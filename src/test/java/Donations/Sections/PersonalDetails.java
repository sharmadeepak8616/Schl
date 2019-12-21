package Donations.Sections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import static Donations.Sections.CommonUtils.*;

public class PersonalDetails {

    private By fName = By.xpath("//label[@for='dwfrm_donation_personalDetails_firstName']//span[text()='First Name']");
    private By fNameBox = By.xpath("//input[@id='dwfrm_donation_personalDetails_firstName']");
    private By lName = By.xpath("//label[@for='dwfrm_donation_personalDetails_lastName']//span[text()='Last Name']");
    private By lNameBox = By.xpath("//input[@id='dwfrm_donation_personalDetails_lastName']");
    private By addr = By.xpath("//label[@for='dwfrm_donation_personalDetails_address']//span[text()='Address']");
    private By addrBox = By.xpath("//input[@id='dwfrm_donation_personalDetails_address']");
    private By city = By.xpath("//label[@for='dwfrm_donation_personalDetails_city']//span[text()='City']");
    private By cityBox = By.xpath("//input[@id='dwfrm_donation_personalDetails_city']");
    private By state = By.xpath("//label[@for='dwfrm_donation_personalDetails_donationstates_state']//span[text()='State']");
    private By stateDropdown = By.xpath("//select[@id='dwfrm_donation_personalDetails_donationstates_state']");
    private By zip = By.xpath("//label[@for='dwfrm_donation_personalDetails_postal']//span[text()='ZIP Code']");
    private By zipBox = By.xpath("//input[@id='dwfrm_donation_personalDetails_postal']");
    private By email = By.xpath("//label[@for='dwfrm_donation_personalDetails_emailAddress']//span[text()='Email']");
    private By emailBox = By.xpath("//input[@id='dwfrm_donation_personalDetails_emailAddress']");
    private By phone = By.xpath("//label[@for='dwfrm_donation_personalDetails_phone']//span[text()='Phone']");
    private By phoneBox = By.xpath("//input[@id='dwfrm_donation_personalDetails_phone']");


    public void checkColorFirstName(String expColor) {
        CommonUtils.sleepProg(2);
        Assert.assertTrue(getDriver().findElement(fName).getCssValue("color").equals(expColor));
    }

    public void enterFirstName(String fname) {
        CommonUtils.sleepProg(2);
        getDriver().findElement(fNameBox).clear();
        getDriver().findElement(fNameBox).sendKeys(fname);
    }

    public void checkColorLastName(String expColor) {
        CommonUtils.sleepProg(2);
        Assert.assertTrue(getDriver().findElement(lName).getCssValue("color").equals(expColor));
    }

    public void enterLastName(String lname) {
        CommonUtils.sleepProg(2);
        getDriver().findElement(lNameBox).clear();
        getDriver().findElement(lNameBox).sendKeys(lname);
    }

    public void checkColorAddress(String expColor) {
        CommonUtils.sleepProg(2);
        Assert.assertTrue(getDriver().findElement(addr).getCssValue("color").equals(expColor));
    }

    public void enterAddress(String addr) {
        CommonUtils.sleepProg(2);
        getDriver().findElement(addrBox).clear();
        getDriver().findElement(addrBox).sendKeys(addr);
    }

    public void checkColorCity(String expColor) {
        CommonUtils.sleepProg(2);
        Assert.assertTrue(getDriver().findElement(city).getCssValue("color").equals(expColor));
    }

    public void enterCity(String city) {
        CommonUtils.sleepProg(2);
        getDriver().findElement(cityBox).clear();
        getDriver().findElement(cityBox).sendKeys(city);
    }

    public void checkColorState(String expColor) {
        CommonUtils.sleepProg(2);
        Assert.assertTrue(getDriver().findElement(state).getCssValue("color").equals(expColor));
    }

    public void selectState(String state) {
        CommonUtils.sleepProg(2);
        Select stateDD = new Select(getDriver().findElement(stateDropdown));
        stateDD.selectByVisibleText(state);
    }

    public void checkColorZipCode(String expColor) {
        CommonUtils.sleepProg(2);
        Assert.assertTrue(getDriver().findElement(zip).getCssValue("color").equals(expColor));
    }

    public void enterZipCode(String zip) {
        CommonUtils.sleepProg(2);
        getDriver().findElement(zipBox).clear();
        getDriver().findElement(zipBox).sendKeys(zip);
    }

    public void checkColorEmail(String expColor) {
        CommonUtils.sleepProg(2);
        Assert.assertTrue(getDriver().findElement(email).getCssValue("color").equals(expColor));
    }

    public void enterEmail(String email) {
        CommonUtils.sleepProg(2);
        getDriver().findElement(emailBox).clear();
        getDriver().findElement(emailBox).sendKeys(email);
    }

    public void checkColorPhone(String expColor) {
        CommonUtils.sleepProg(2);
        Assert.assertTrue(getDriver().findElement(phone).getCssValue("color").equals(expColor));
    }

    public void enterPhone(String phone) {
        CommonUtils.sleepProg(2);
        getDriver().findElement(phoneBox).clear();
        getDriver().findElement(phoneBox).sendKeys(phone);
    }

    public void enterDefaultPersonal() {
        sleepProg(2);
        enterFirstName(defFirstName);
        enterLastName(defLastName);
        enterAddress(defAddress);
        enterCity(defCity);
        selectState(defState);
        enterZipCode(defZipCode);
        enterEmail(defEmail);
        enterPhone(defPhone);
    }

    public void verifyColorAllSubHeading(String expColor) {
        checkColorFirstName(expColor);
        checkColorLastName(expColor);
        checkColorAddress(expColor);
        checkColorCity(expColor);
        checkColorState(expColor);
        checkColorZipCode(expColor);
        checkColorEmail(expColor);
        checkColorPhone(expColor);
    }





}
