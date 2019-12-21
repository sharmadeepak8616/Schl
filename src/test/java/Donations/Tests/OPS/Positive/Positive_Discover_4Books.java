package Donations.Tests.OPS.Positive;

import Donations.Sections.DonationAmount;
import Donations.Sections.Payments;
import Donations.Sections.PersonalDetails;
import Donations.Sections.ThankYou;

import static Donations.Sections.CommonUtils.*;

public class Positive_Discover_4Books {

    public static void main(String[] args) {

        PersonalDetails personal = new PersonalDetails();
        DonationAmount donation = new DonationAmount();
        Payments payment = new Payments();
        ThankYou thankyou = new ThankYou();

        openDonationUsingFullUrl();

        personal.verifyColorAllSubHeading(colorBlackValidField);
        personal.enterDefaultPersonal();
        personal.enterFirstName("DISCOVER");

        donation.verifyColorAllSubHeading(colorBlackValidField);
        donation.verifyBookChoiceTextbeforeContinue();
        donation.clickBookChoiceDropDown();
        donation.selectBooks(5);
        donation.selectBooks(6);
        donation.selectBooks(7);
        //donation.selectBooks(4);
        donation.verifyTotalPriceInDropDown();
        donation.clickContinueButton();
        donation.verifyBookChoiceTextAfterContinue(3);

        payment.verifyColorAllSubHeading(colorBlackValidField);
        payment.enterDiscoverDetails();

        payment.clickCompletePayment();

        String thankYouMsg = "DISCOVER" + thankyouMsg;
        String donationMsg = donationMsg_start + donation.getTotalOfSelectedBookInString() + donationMsg_end;

        System.out.println(donationMsg);


        thankyou.verifyThankyouPageHeader();
        thankyou.verifyThankyouMsg(thankYouMsg);
        thankyou.verifyDonationMsg(donationMsg);

        quitDriver();


    }

}
