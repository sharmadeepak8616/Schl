package Donations.Tests.OPS.Negative.BookChoices;

import Donations.Sections.DonationAmount;
import Donations.Sections.Payments;
import Donations.Sections.PersonalDetails;
import Donations.Sections.ThankYou;

import static Donations.Sections.CommonUtils.*;
import static Donations.Sections.CommonUtils.quitDriver;

public class NoSelectAndTryContinue {

    public static void main(String[] args) {

        PersonalDetails personal = new PersonalDetails();
        DonationAmount donation = new DonationAmount();
        Payments payment = new Payments();
        ThankYou thankyou = new ThankYou();

        openDonationUsingFullUrl();

        personal.enterDefaultPersonal();

        donation.clickBookChoiceDropDown();
/*
        donation.selectBooks(1);
        donation.selectBooks(2);
*/

        //donation.verifyTotalBookInDropdownWithNamesPrice();
        donation.verifyTotalPriceInDropDown();
        donation.clickContinueButton();
        donation.verifyBookChoiceTextbeforeContinue();
        //donation.verifyBookChoiceTextAfterContinue(4);

        payment.enterAmexDetails();
        payment.clickCompletePayment();

        payment.verifyErrorMsg(errorMsg);
        donation.checkColorBookChoices(colorRedInvalidField);
        donation.checkColorAmount(colorRedInvalidField);

        quitDriver();






    }
}
