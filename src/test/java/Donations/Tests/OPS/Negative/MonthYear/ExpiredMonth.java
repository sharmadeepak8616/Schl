package Donations.Tests.OPS.Negative.MonthYear;

import Donations.Sections.DonationAmount;
import Donations.Sections.Payments;
import Donations.Sections.PersonalDetails;
import Donations.Sections.ThankYou;

import static Donations.Sections.CommonUtils.*;

public class ExpiredMonth {

    public static void main(String[] args) {

        PersonalDetails personal = new PersonalDetails();
        DonationAmount donation = new DonationAmount();
        Payments payment = new Payments();
        ThankYou thankyou = new ThankYou();

        openDonationUsingFullUrl();

        personal.enterDefaultPersonal();

        donation.verifyBookChoiceTextbeforeContinue();
        donation.clickBookChoiceDropDown();
        donation.selectBooks(3);
        donation.selectBooks(4);
        donation.verifyTotalPriceInDropDown();
        donation.clickContinueButton();
        donation.verifyBookChoiceTextAfterContinue(2);


        payment.enterVisaDetails();
        payment.selectExpiryMonth("01");
        payment.selectExpiryYear("2019");

        payment.clickCompletePayment();

        payment.verifyErrorMsg(errorMsg);
        payment.checkColorExpiryMonth(colorRedInvalidField);
        payment.verifyExpiredCardMonthError();

        quitDriver();

    }
}
