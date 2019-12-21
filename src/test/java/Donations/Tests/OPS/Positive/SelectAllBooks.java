package Donations.Tests.OPS.Positive;

import Donations.Sections.DonationAmount;
import Donations.Sections.Payments;
import Donations.Sections.PersonalDetails;
import Donations.Sections.ThankYou;

import static Donations.Sections.CommonUtils.*;

public class SelectAllBooks {

    public static void main(String[] args) {

        PersonalDetails personal = new PersonalDetails();
        DonationAmount donation = new DonationAmount();
        Payments payment = new Payments();
        ThankYou thankyou = new ThankYou();

        openDonationUsingFullUrl();

        personal.enterDefaultPersonal();
        personal.enterFirstName("ALLBOOKS");

        donation.verifyBookChoiceTextbeforeContinue();
        donation.clickBookChoiceDropDown();
        donation.selectAllBooks();
        donation.verifyAllPricesInBookChoicesDropdown();
        donation.verifyTotalPriceInDropDown();
        donation.clickContinueButton();
        donation.verifyBookChoiceTextAfterContinue(donation.getTotalSelectedBookCount());

        payment.enterVisaDetails();

/*        payment.clickCompletePayment();

        String thankYouMsg = "ALLBOOKS" + thankyouMsg;
        String donationMsg = donationMsg_start + donation.getTotalOfSelectedBookInString() + donationMsg_end;

        System.out.println(donationMsg);

        thankyou.verifyThankyouPageHeader();
        thankyou.verifyThankyouMsg(thankYouMsg);
        thankyou.verifyDonationMsg(donationMsg);

        quitDriver();*/



    }
}
