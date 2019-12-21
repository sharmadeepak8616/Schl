package Donations.Tests.OPS.Negative.CardNumber;

import Donations.Sections.DonationAmount;
import Donations.Sections.Payments;
import Donations.Sections.PersonalDetails;
import Donations.Sections.ThankYou;

import static Donations.Sections.CommonUtils.*;
import static Donations.Sections.CommonUtils.quitDriver;

public class InvalidCardNumber {

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
        donation.selectBooks(2);
        donation.selectBooks(3);
        donation.selectBooks(4);
        donation.verifyTotalPriceInDropDown();
        donation.clickContinueButton();
        donation.verifyBookChoiceTextAfterContinue(4);


        payment.enterAmexDetails();
        payment.enterCardNumber("5555555555555555");

        payment.clickCompletePayment();

        payment.verifyErrorMsg(errorMsg);
        payment.checkColorCardNumber(colorRedInvalidField);
        payment.verifyInvalidCardError();

        quitDriver();


    }
}
