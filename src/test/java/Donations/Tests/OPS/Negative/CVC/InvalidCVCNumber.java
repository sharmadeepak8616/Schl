package Donations.Tests.OPS.Negative.CVC;

import Donations.Sections.DonationAmount;
import Donations.Sections.Payments;
import Donations.Sections.PersonalDetails;
import Donations.Sections.ThankYou;

import static Donations.Sections.CommonUtils.*;

public class InvalidCVCNumber {

    public static void main(String[] args) {

        PersonalDetails personal = new PersonalDetails();
        DonationAmount donation = new DonationAmount();
        Payments payment = new Payments();
        ThankYou thankyou = new ThankYou();

        openDonationUsingFullUrl();

        personal.enterDefaultPersonal();

        donation.verifyBookChoiceTextbeforeContinue();
        donation.clickBookChoiceDropDown();
        donation.selectBooks(1);
        donation.selectBooks(3);
        donation.verifyTotalPriceInDropDown();
        donation.clickContinueButton();
        donation.verifyBookChoiceTextAfterContinue(2);


        payment.enterVisaDetails();
        payment.enterCVC("999");

        payment.clickCompletePayment();

        payment.verifyErrorMsg(errorMsg);
        payment.checkColorCVC(colorRedInvalidField);
        payment.verifyInvalidCVCError();

        quitDriver();

    }
}
