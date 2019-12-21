package Donations.Tests.OPS.Positive;

import Donations.Sections.DonationAmount;
import Donations.Sections.Payments;
import Donations.Sections.PersonalDetails;
import Donations.Sections.ThankYou;

import static Donations.Sections.CommonUtils.*;

public class Positive_Master_4Books {

    public static void main(String[] args) {

        PersonalDetails personal = new PersonalDetails();
        DonationAmount donation = new DonationAmount();
        Payments payment = new Payments();
        ThankYou thankyou = new ThankYou();

        openDonationUsingFullUrl();

        personal.verifyColorAllSubHeading(colorBlackValidField);
        personal.enterDefaultPersonal();
        personal.enterFirstName("MASTER");

        donation.verifyColorAllSubHeading(colorBlackValidField);
        donation.verifyBookChoiceTextbeforeContinue();
        donation.clickBookChoiceDropDown();
        donation.selectBooks(15);
        donation.selectBooks(12);
        donation.selectBooks(23);
        donation.selectBooks(4);


        donation.verifyTotalPriceInDropDown();
        donation.clickContinueButton();
        donation.verifyBookChoiceTextAfterContinue(4);

        payment.verifyColorAllSubHeading(colorBlackValidField);
        payment.enterMasterCardDetails();

        payment.clickCompletePayment();

        //String thankYouMsg = defFirstName + thankyouMsg;
        String thankYouMsg = "MASTER" + thankyouMsg;
        String donationMsg = donationMsg_start + donation.getTotalOfSelectedBookInString() + donationMsg_end;

        System.out.println(donationMsg);


        thankyou.verifyThankyouPageHeader();
        thankyou.verifyThankyouMsg(thankYouMsg);
        thankyou.verifyDonationMsg(donationMsg);

        quitDriver();



    }

}
