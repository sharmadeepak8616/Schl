package Donations.Tests.OPS.Negative.Email;

import Donations.Sections.DonationAmount;
import Donations.Sections.Payments;
import Donations.Sections.PersonalDetails;
import Donations.Sections.ThankYou;

import static Donations.Sections.CommonUtils.*;

public class IncompleteEmail {

    public static void main(String[] args) {

        PersonalDetails personal = new PersonalDetails();
        DonationAmount donation = new DonationAmount();
        Payments payment = new Payments();
        ThankYou thankyou = new ThankYou();

        openDonationUsingFullUrl();


        /***
         * Missing First Name in this testcase
         */
        personal.verifyColorAllSubHeading(colorBlackValidField);

        personal.enterDefaultPersonal();
        personal.enterEmail("invalid@wrongdomain");


        donation.clickBookChoiceDropDown();
        donation.selectBooks(1);
        donation.selectBooks(2);
        donation.verifyTotalPriceInDropDown();
        donation.clickContinueButton();
        donation.verifyBookChoiceTextAfterContinue(2);

        payment.enterAmexDetails();
        payment.clickCompletePayment();

        payment.verifyErrorMsg(errorMsg);
        payment.checkColorErrorMsg(colorRedInvalidField);
        personal.checkColorEmail(colorRedInvalidField);

        quitDriver();



    }
}
