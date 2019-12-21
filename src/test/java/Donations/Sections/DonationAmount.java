package Donations.Sections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import static Donations.Sections.CommonUtils.*;

public class DonationAmount {

    public List<String> selectedBookPrices = new ArrayList<String>();
    public List<WebElement> bookNames;
    public List<WebElement> bookPrices;
    public List<WebElement> bookCheckBoxes;
    public DecimalFormat df = new DecimalFormat("#.00");
    public double totalOfSelectedBooks = 0.00;
    private By amount = By.xpath("//label[@for='dwfrm_donation_donationAmount_amount']//span[text()='Amount']");
    private By amountBox = By.xpath("//input[@id='dwfrm_donation_donationAmount_amount']");
    private By amountMinMsg = By.xpath("//span[@class='msg-minimum']");
    private By school = By.xpath("//div[@id='partnerDiv']//label[text(),'School']");
    private By schoolD = By.xpath("//select[@id='dwfrm_donation_donationAmount_donateto']");

    private By bookChoice = By.xpath("//label[contains(text(),'Book Choices')]");
    private By bookChoiceDDText = By.xpath("//button[@type='button']/span[@class='btn-label']");
    private By bookChoiceArrow = By.xpath("//button[@type='button']/span[@class='arrow-down']");
    private By bookChoiceAllBooksNames = By.xpath("//button[@type='button']/following-sibling::ul//span[@class='product-name']");
    private By bookChoiceAllBooksPrices = By.xpath("//button[@type='button']/following-sibling::ul//span[@class='product-price']");
    private By bookChoiceAllBooksCheckBox = By.xpath("//button[@type='button']/following-sibling::ul//span[@class='checkmark']");
    private By bookChoiceTotalText = By.xpath("//div[@class='product-total']//div[contains(@class,'sec-amount-total')]");
    private By bookChoiceContinueBtn = By.xpath("//div[@class='product-total']//div[@class='table-cell']//a");

    public int getTotalSelectedBookCount() {
        System.out.println("Total number of books : " + selectedBookPrices.size());
        return selectedBookPrices.size();
    }

    public void verifyAllPricesInBookChoicesDropdown() {
        for (WebElement bookPrice : bookPrices) {
            Assert.assertFalse(bookPrice.getText().contains("$0.00"));
            Assert.assertFalse(bookPrice.getText().contains("$0"));
            Assert.assertFalse(bookPrice.getText().toLowerCase().contains("na"));
            Assert.assertFalse(bookPrice.getText().toLowerCase().contains("n/a"));
            Assert.assertFalse(bookPrice.getText().toLowerCase().contains("n"));
        }
    }

    public void checkColorAmount(String expColor) {
        sleepProg(2);
        Assert.assertTrue(getDriver().findElement(amount).getCssValue("color").equals(expColor));
    }

    public void enterAmount(String amount) {
        sleepProg(2);
        getDriver().findElement(amountBox).clear();
        getDriver().findElement(amountBox).sendKeys(amount);
    }

    public void checkColorMinAmountMsg(String expColor) {
        sleepProg(2);
        Assert.assertTrue(getDriver().findElement(amountMinMsg).getCssValue("color").equals(expColor));
    }

    public void verifyMinAmountMsg(String expMsg) {
        sleepProg(2);
        Assert.assertTrue(getDriver().findElement(amountMinMsg).getText().equals(expMsg));
    }

    public void checkColorSchool(String expColor) {
        sleepProg(2);
        Assert.assertTrue(getDriver().findElement(school).getCssValue("color").equals(expColor));
    }

    public void selectSchool(String school) {
        sleepProg(2);
        Select schoolDD = new Select(getDriver().findElement(schoolD));
        schoolDD.selectByVisibleText(school);
    }

    public void selectSchool(int school) {
        sleepProg(2);
        Select schoolDD = new Select(getDriver().findElement(schoolD));
        schoolDD.selectByIndex(school);
    }

    public void checkColorBookChoices(String expColor) {
        sleepProg(2);
        Assert.assertTrue(getDriver().findElement(bookChoice).getCssValue("color").equals(expColor));
    }

    public void clickBookChoiceDropDown() {
        sleepProg(2);
        getDriver().findElement(bookChoiceArrow).click();
        bookNames = getDriver().findElements(bookChoiceAllBooksNames);
        bookPrices = getDriver().findElements(bookChoiceAllBooksPrices);
        bookCheckBoxes = getDriver().findElements(bookChoiceAllBooksCheckBox);
    }

    public void verifyTotalBookInDropdownWithNamesPrice() {
        sleepProg(2);
        System.out.println("Total number of book names : " + bookNames.size());
        System.out.println("Total number of book prices : " + bookPrices.size());
        Assert.assertEquals(bookNames.size() , bookPrices.size(), "Number of names and prices are different");
        for (int i = 0 ; i < bookNames.size() ; i++) {
            System.out.println("Name : " + bookNames.get(i));
            System.out.println("Price : " + bookPrices.get(i));
        }
    }

    public void selectBooks(int n) {
        sleepProg(2);
        bookCheckBoxes.get(n-1).click();
        selectedBookPrices.add(bookPrices.get(n-1).getText());
    }

    public void unSelectBooks(int n) {
        sleepProg(2);
        bookCheckBoxes.get(n-1).click();
        selectedBookPrices.remove(bookPrices.get(n-1).getText());
        System.out.println("After removal : " + selectedBookPrices);
    }

    public String getTotalOfSelectedBookInString() {
        return df.format(totalOfSelectedBooks);
    }

    public void verifyTotalPriceInDropDown() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        String totalPriceInDD = getDriver().findElement(bookChoiceTotalText).getText();
        for (String selectedBookPrice : selectedBookPrices) {
            totalOfSelectedBooks = totalOfSelectedBooks + getPriceWithoutDollar(selectedBookPrice);
        }
        String totalPriceMsgInDD = "";
        if (totalOfSelectedBooks <= 0) {
            totalPriceMsgInDD = totalPriceMsg + "0.00";
        } else {
            totalPriceMsgInDD = totalPriceMsg + getTotalOfSelectedBookInString();
        }
        Assert.assertEquals(totalPriceInDD, totalPriceMsgInDD, "Issue in total price in dropdown");
    }

    public void verifyTotalPriceInDropDownAgain() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        totalOfSelectedBooks = 0.00;
        String totalPriceInDD = getDriver().findElement(bookChoiceTotalText).getText();
        for (String selectedBookPrice : selectedBookPrices) {
            totalOfSelectedBooks = totalOfSelectedBooks + getPriceWithoutDollar(selectedBookPrice);
        }
        String totalPriceMsgInDD = "";
        if (totalOfSelectedBooks <= 0) {
            totalPriceMsgInDD = totalPriceMsg + "0.00";
        } else {
            totalPriceMsgInDD = totalPriceMsg + getTotalOfSelectedBookInString();
        }
        Assert.assertEquals(totalPriceInDD, totalPriceMsgInDD, "Issue in total price in dropdown");
    }


    public void clickContinueButton() {
        getDriver().findElement(bookChoiceContinueBtn).click();
    }

    public void verifyBookChoiceTextbeforeContinue() {
        getDriver().findElement(bookChoiceDDText).getText().equals(bookChoiceTextBeforeContinue);
    }

    public void verifyBookChoiceTextAfterContinue(int noOfBooksSelected) {
        String expMsg = String.valueOf(noOfBooksSelected) + bookChoiceTextAfterContinue;
        getDriver().findElement(bookChoiceDDText).getText().equals(expMsg);
    }


    public void verifyContinueButtontext() {
        String continueBtnText = getDriver().findElement(bookChoiceContinueBtn).getText();
        Assert.assertEquals(continueBtnText, "CONTINUE", "Text mismatch on Continue button");
    }


    public void verifyColorAllSubHeading(String expColor) {
        checkColorBookChoices(expColor);
        checkColorAmount(expColor);
    }

    public void selectAllBooks() {
        for (int i=0 ; i < bookCheckBoxes.size() ; i++) {
            bookCheckBoxes.get(i).click();
            selectedBookPrices.add(bookPrices.get(i).getText());
        }
        System.out.println(selectedBookPrices);
    }




}
