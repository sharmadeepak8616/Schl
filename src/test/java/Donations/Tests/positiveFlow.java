package Donations.Tests;

import static Donations.Sections.CommonUtils.*;
import Donations.Sections.DonationAmount;
import Donations.Sections.Payments;
import Donations.Sections.PersonalDetails;
import Donations.Sections.ThankYou;
import org.testng.annotations.Test;

public class positiveFlow {

    @Test
    public void positivetest() {

        PersonalDetails personal = new PersonalDetails();
        DonationAmount donation = new DonationAmount();
        Payments payment = new Payments();
        ThankYou thankyou = new ThankYou();


        openDonationUsingFullUrl();

        personal.enterFirstName("FirstName");
        personal.enterLastName("LastName");
        personal.enterAddress("201 W");
        personal.enterCity("New York");
        personal.selectState("New York");
        personal.enterZipCode("10012");
        personal.enterEmail("ds8125713@gmail.com");
        personal.enterPhone("1234567890");

        donation.enterAmount("11.1");
        donation.selectSchool(4);

        donation.verifyMinAmountMsg(minAmountMsg);

        payment.enterCardNumber("4111111111111111");
        payment.enterCVC("123");
        payment.selectExpiryMonth("02");
        payment.selectExpiryYear("2022");

        payment.clickCompletePayment();

        String thankYouMsg = "FirstName" + thankyouMsg;
        String donationMsg = donationMsg_start + makeIntDouble(11.1) + donationMsg_end;

        thankyou.verifyThankyouPageHeader();
        thankyou.verifyThankyouMsg(thankYouMsg);
        thankyou.verifyDonationMsg(donationMsg);

        quitDriver();


    }



}
