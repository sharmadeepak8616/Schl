package Donations.Tests.OPS.Negative.CVC;

import Donations.Sections.DonationAmount;
import Donations.Sections.Payments;
import Donations.Sections.PersonalDetails;
import Donations.Sections.ThankYou;

import static Donations.Sections.CommonUtils.*;

public class VisaCard_AmexCVC {

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


        payment.enterVisaDetails();
        payment.enterCVC(amexCvc);

        payment.clickCompletePayment();

        payment.verifyErrorMsg(errorMsg);
        payment.checkColorCVC(colorRedInvalidField);
        payment.verifyInvalidCVCError();

        quitDriver();


    }
}
