package Donations.Tests.OPS.Negative.Zip;

import Donations.Sections.DonationAmount;
import Donations.Sections.Payments;
import Donations.Sections.PersonalDetails;
import Donations.Sections.ThankYou;

import static Donations.Sections.CommonUtils.*;

public class InvalidZipCode_01234 {

    public static void main(String[] args) {

        PersonalDetails personal = new PersonalDetails();
        DonationAmount donation = new DonationAmount();
        Payments payment = new Payments();
        ThankYou thankyou = new ThankYou();

        openDonationUsingFullUrl();

        personal.enterDefaultPersonal();
        personal.enterZipCode("01234");

        donation.clickBookChoiceDropDown();
        donation.selectBooks(1);
        donation.selectBooks(2);
        donation.verifyTotalPriceInDropDown();
        donation.clickContinueButton();
        donation.verifyBookChoiceTextAfterContinue(4);

        payment.enterAmexDetails();
        payment.clickCompletePayment();

        payment.verifyErrorMsg(errorMsg);
        personal.checkColorZipCode(colorRedInvalidField);

        quitDriver();


    }
}
