package Donations.Tests;

import Donations.Sections.DonationAmount;
import Donations.Sections.Payments;
import Donations.Sections.PersonalDetails;
import Donations.Sections.ThankYou;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.awt.event.KeyEvent;

import static Donations.Sections.CommonUtils.*;

public class Try {

    public static void main(String[] args) {

        PersonalDetails personal = new PersonalDetails();
        DonationAmount donation = new DonationAmount();
        Payments payment = new Payments();
        ThankYou thankyou = new ThankYou();

        By fName = By.xpath("//label[@for='dwfrm_donation_personalDetails_firstName']//span[text()='First Name']");

        openDonationUsingFullUrl();

        System.out.println(getDriver().findElement(fName).getCssValue("color"));

        donation.clickBookChoiceDropDown();
        donation.selectBooks(2);
        donation.selectBooks(4);

        //donation.verifyTotalPriceInDropDown();

        //donation.verifyContinueButtontext();



        quitDriver();








    }


}
