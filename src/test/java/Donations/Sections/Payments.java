package Donations.Sections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import static Donations.Sections.CommonUtils.*;

public class Payments {

    private By cardType = By.xpath("//label[@for='dwfrm_donation_paymentMethods_donationcreditcard_type']//span[text()='Card Type']");
    private By cardTypeDD = By.xpath("//select[@id='dwfrm_donation_paymentMethods_donationcreditcard_type']");
    private By cardNumber = By.xpath("//label[@for='dwfrm_donation_paymentMethods_donationcreditcard_number']//span[text()='Card Number']");
    private By cardNumberBox = By.xpath("//input[@id='dwfrm_donation_paymentMethods_donationcreditcard_number']");
    private By cvc = By.xpath("//label[@for='dwfrm_donation_paymentMethods_donationcreditcard_cvn']//span[text()='CVC']");
    private By cvcBox = By.xpath("//input[@id='dwfrm_donation_paymentMethods_donationcreditcard_cvn']");
    private By expiryMonth = By.xpath("//label[@for='dwfrm_donation_paymentMethods_donationcreditcard_expiration_month']//span[text()='Expiration Month']");
    private By expiryMonthDD = By.xpath("//select[@id='dwfrm_donation_paymentMethods_donationcreditcard_expiration_month']");
    private By expiryYear = By.xpath("//label[@for='dwfrm_donation_paymentMethods_donationcreditcard_expiration_year']//span[text()='Expiration Year']");
    private By expiryYearDD = By.xpath("//select[@id='dwfrm_donation_paymentMethods_donationcreditcard_expiration_year']");
    private By completePayment = By.xpath("//button[@id='btnSubmit']//span");
    private By errorMsg = By.xpath("//div[contains(text(),'Please make a valid entry in the above fields')]");
    private By invalidCardError = By.xpath("//div[contains(text(),'Invalid Credit Card')]");
    private By invalidCVCError = By.xpath("//div[contains(text(),'Invalid Security Code')]");
    private By ccExpiredError = By.xpath("//div[contains(text(),'Credit Card is expired')]");


    public void checkColorCardType(String expColor) {
        CommonUtils.sleepProg(2);
        Assert.assertTrue(getDriver().findElement(cardType).getCssValue("color").equals(expColor));
    }

    public void selectCardType(String cardType) {
        CommonUtils.sleepProg(2);
        Select cardTypeDropdown = new Select(getDriver().findElement(cardTypeDD));
        cardTypeDropdown.selectByVisibleText(cardType);
    }

    public void checkColorCardNumber(String expColor) {
        CommonUtils.sleepProg(2);
        Assert.assertTrue(getDriver().findElement(cardNumber).getCssValue("color").equals(expColor));
    }

    public void enterCardNumber(String cardNum) {
        CommonUtils.sleepProg(2);
        getDriver().findElement(cardNumberBox).clear();
        getDriver().findElement(cardNumberBox).sendKeys(cardNum);
    }

    public void checkColorCVC(String expColor) {
        CommonUtils.sleepProg(2);
        Assert.assertTrue(getDriver().findElement(cvc).getCssValue("color").equals(expColor));
    }

    public void enterCVC(String cvc) {
        CommonUtils.sleepProg(2);
        getDriver().findElement(cvcBox).clear();
        getDriver().findElement(cvcBox).sendKeys(cvc);
    }

    public void checkColorExpiryMonth(String expColor) {
        CommonUtils.sleepProg(2);
        Assert.assertTrue(getDriver().findElement(expiryMonth).getCssValue("color").equals(expColor));
    }

    public void selectExpiryMonth(String expMonth) {
        CommonUtils.sleepProg(2);
        Select expMonthDD = new Select(getDriver().findElement(expiryMonthDD));
        expMonthDD.selectByVisibleText(expMonth);
    }

    public void checkColorExpiryYear(String expColor) {
        CommonUtils.sleepProg(2);
        Assert.assertTrue(getDriver().findElement(expiryYear).getCssValue("color").equals(expColor));
    }

    public void selectExpiryYear(String expYear) {
        CommonUtils.sleepProg(2);
        Select expYearDD = new Select(getDriver().findElement(expiryYearDD));
        expYearDD.selectByVisibleText(expYear);
    }

    public void verifyErrorMsg(String expMsg) {
        CommonUtils.sleepProg(2);
        Assert.assertTrue(getDriver().findElement(errorMsg).getText().contains(expMsg));
    }

    public void checkColorErrorMsg(String expColor) {
        CommonUtils.sleepProg(2);
        Assert.assertTrue(getDriver().findElement(errorMsg).getCssValue("color").equals(expColor));
    }

    public void clickCompletePayment() {
        CommonUtils.sleepProg(2);
        getDriver().findElement(completePayment).click();
    }

    public void verifyColorAllSubHeading(String expColor) {
        checkColorCardType(expColor);
        checkColorCardNumber(expColor);
        checkColorCVC(expColor);
        checkColorExpiryMonth(expColor);
        checkColorExpiryYear(expColor);
    }

    public void verifyColorAllSubHeadingSkipCardType(String expColor) {
        checkColorCardNumber(expColor);
        checkColorCVC(expColor);
        checkColorExpiryMonth(expColor);
        checkColorExpiryYear(expColor);
    }


    public void enterVisaDetails() {
        selectCardType(visaType);
        enterCardNumber(visaNumber);
        enterCVC(visaCvc);
        selectExpiryMonth(cardExpiryMonth);
        selectExpiryYear(cardExpiryYear);
    }

    public void enterAmexDetails() {
        selectCardType(amexType);
        enterCardNumber(amexNumber);
        enterCVC(amexCvc);
        selectExpiryMonth(cardExpiryMonth);
        selectExpiryYear(cardExpiryYear);
    }

    public void enterMasterCardDetails() {
        selectCardType(masterCardType);
        enterCardNumber(masterCardNumber);
        enterCVC(masterCardCvc);
        selectExpiryMonth(cardExpiryMonth);
        selectExpiryYear(cardExpiryYear);
    }

    public void enterDiscoverDetails() {
        selectCardType(discoverType);
        enterCardNumber(discoverNumber);
        enterCVC(discoverCvc);
        selectExpiryMonth(cardExpiryMonth);
        selectExpiryYear(cardExpiryYear);
    }

    public void verifyInvalidCardError() {
        Assert.assertTrue(getDriver().findElement(invalidCardError).isDisplayed());
        try{
            Thread.sleep(1);
        } catch (InterruptedException e) {

        }
        System.out.println(getDriver().findElement(invalidCardError).getCssValue("color"));
        Assert.assertTrue(getDriver().findElement(invalidCardError).getCssValue("color").equals(colorDarkRedInvalidField));
    }

    public void verifyInvalidCVCError() {
        Assert.assertTrue(getDriver().findElement(invalidCVCError).isDisplayed());
        try{
            Thread.sleep(1);
        } catch (InterruptedException e) {

        }
        Assert.assertTrue(getDriver().findElement(invalidCVCError).getCssValue("color").equals(colorDarkRedInvalidField));
    }

    public void verifyExpiredCardMonthError() {
        Assert.assertTrue(getDriver().findElement(ccExpiredError).isDisplayed());
        try{
            Thread.sleep(1);
        } catch (InterruptedException e) {

        }
        Assert.assertTrue(getDriver().findElement(ccExpiredError).getCssValue("color").equals(colorDarkRedInvalidField));

    }

}
