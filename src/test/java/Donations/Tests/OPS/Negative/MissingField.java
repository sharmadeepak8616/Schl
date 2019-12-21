package Donations.Tests.OPS.Negative;

import static Donations.Sections.CommonUtils.*;
import Donations.Sections.DonationAmount;
import Donations.Sections.Payments;
import Donations.Sections.PersonalDetails;
import Donations.Sections.ThankYou;
import org.testng.annotations.Test;

public class MissingField {

    @Test
    public void missingFieldTest() {

        PersonalDetails personal = new PersonalDetails();
        DonationAmount donation = new DonationAmount();
        Payments payment = new Payments();
        ThankYou thankyou = new ThankYou();

        openDonationUsingFullUrl();


        /***
         * Missing First Name in this testcase
         */
        personal.checkColorFirstName(colorBlackValidField);

        //personal.enterFirstName("FirstName");
        personal.enterLastName("LastName");
        personal.enterAddress("201 W");
        personal.enterCity("New York");
        personal.selectState("New York");
        personal.enterZipCode("10012");
        personal.enterEmail("ds8125713@gmail.com");
        personal.enterPhone("1234567890");


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
        personal.checkColorFirstName(colorRedInvalidField);

        quitDriver();


    }



}
