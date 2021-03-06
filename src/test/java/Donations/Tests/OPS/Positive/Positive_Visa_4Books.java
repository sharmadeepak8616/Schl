package Donations.Tests.OPS.Positive;

import Donations.Sections.DonationAmount;
import Donations.Sections.Payments;
import Donations.Sections.PersonalDetails;
import Donations.Sections.ThankYou;
import static Donations.Sections.CommonUtils.*;

public class Positive_Visa_4Books {

    public static void main(String[] args) {

        PersonalDetails personal = new PersonalDetails();
        DonationAmount donation = new DonationAmount();
        Payments payment = new Payments();
        ThankYou thankyou = new ThankYou();

        openDonationUsingFullUrl();

        personal.verifyColorAllSubHeading(colorBlackValidField);
        personal.enterDefaultPersonal();
        personal.enterFirstName("VISA");

        donation.verifyColorAllSubHeading(colorBlackValidField);
        donation.verifyBookChoiceTextbeforeContinue();
        donation.clickBookChoiceDropDown();
        donation.selectBooks(1);
        donation.selectBooks(2);
        donation.selectBooks(3);
        donation.selectBooks(4);
        donation.verifyTotalPriceInDropDown();
        donation.clickContinueButton();
        donation.verifyBookChoiceTextAfterContinue(4);

        payment.verifyColorAllSubHeading(colorBlackValidField);
        payment.enterVisaDetails();

        payment.clickCompletePayment();

        String thankYouMsg = "VISA" + thankyouMsg;
        String donationMsg = donationMsg_start + donation.getTotalOfSelectedBookInString() + donationMsg_end;

        System.out.println(donationMsg);


        thankyou.verifyThankyouPageHeader();
        thankyou.verifyThankyouMsg(thankYouMsg);
        thankyou.verifyDonationMsg(donationMsg);

        quitDriver();


    }

}
