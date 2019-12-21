package Donations.Tests.OPS.Negative.City;

import Donations.Sections.DonationAmount;
import Donations.Sections.Payments;
import Donations.Sections.PersonalDetails;
import Donations.Sections.ThankYou;

import static Donations.Sections.CommonUtils.*;

public class DifferentCityAndState {

    public static void main(String[] args) {

        PersonalDetails personal = new PersonalDetails();
        DonationAmount donation = new DonationAmount();
        Payments payment = new Payments();
        ThankYou thankyou = new ThankYou();

        openDonationUsingFullUrl();

        personal.enterDefaultPersonal();
        personal.enterCity("Invalid City");

        donation.clickBookChoiceDropDown();
        donation.selectBooks(1);
        donation.selectBooks(2);
        donation.selectBooks(3);
        donation.selectBooks(4);
        donation.verifyTotalPriceInDropDown();
        donation.clickContinueButton();
        donation.verifyBookChoiceTextAfterContinue(4);

        payment.enterAmexDetails();

        payment.clickCompletePayment();

        /**
         *
         * Check error on Prod and then write code to verify invalid city error
         *
         */


        quitDriver();



    }

}
