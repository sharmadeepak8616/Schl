package Donations.Tests.OPS.Positive;

import Donations.Sections.DonationAmount;
import Donations.Sections.Payments;
import Donations.Sections.PersonalDetails;
import Donations.Sections.ThankYou;

import static Donations.Sections.CommonUtils.*;

public class UnSelectSelectedOnesBooks {

    public static void main(String[] args) {

        PersonalDetails personal = new PersonalDetails();
        DonationAmount donation = new DonationAmount();
        Payments payment = new Payments();
        ThankYou thankyou = new ThankYou();

        openDonationUsingFullUrl();

        personal.enterDefaultPersonal();
        personal.enterFirstName("SELECTUNSELECT");

        donation.clickBookChoiceDropDown();
        donation.selectBooks(1);
        donation.selectBooks(2);
        donation.verifyTotalPriceInDropDown();
        donation.clickContinueButton();
        donation.verifyBookChoiceTextAfterContinue(2);

        donation.clickBookChoiceDropDown();
        //donation.selectBooks(1); -- Keeping 1 checked
        donation.unSelectBooks(2);  //DeSelected 2nd book ( to make total book = 1)
        donation.selectBooks(3); //Selected 3rd book ( to make total book = 2)
        donation.verifyTotalPriceInDropDownAgain();
        donation.clickContinueButton();
        donation.verifyBookChoiceTextAfterContinue(2);

        donation.clickBookChoiceDropDown();
        donation.selectBooks(4); //Selected 4th book ( to make total book = 3)
        donation.verifyTotalPriceInDropDownAgain();
        donation.clickContinueButton();
        donation.verifyBookChoiceTextAfterContinue(3);

        payment.enterVisaDetails();
        payment.clickCompletePayment();

        String thankYouMsg = "SELECTUNSELECT" + thankyouMsg;
        String donationMsg = donationMsg_start + donation.getTotalOfSelectedBookInString() + donationMsg_end;

        System.out.println(donationMsg);

        thankyou.verifyThankyouPageHeader();
        thankyou.verifyThankyouMsg(thankYouMsg);
        thankyou.verifyDonationMsg(donationMsg);

        quitDriver();





    }


}
