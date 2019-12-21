package Donations.Sections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import static Donations.Sections.CommonUtils.*;

public class ThankYou {

    private By thankyouHeader = By.xpath("//h1[@class='hd-donate-now']//span[contains(text(),'Thank You')]");
    private By thankyouMsg = By.xpath("//p[@class='msg-thankyou']");
    private By donationAmtMsg = By.xpath("//p[@class='msg-amount']");

    public void verifyThankyouPageHeader() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {

        }
        CommonUtils.sleepProg(4);
        //System.out.println(driver.findElement(thankyouHeader).getText());
        Assert.assertTrue(getDriver().findElement(thankyouHeader).getText().equals(CommonUtils.thankyouPageHeader));

    }

    public void verifyThankyouMsg(String expMsg) {
        CommonUtils.sleepProg(2);
        Assert.assertTrue(getDriver().findElement(thankyouMsg).getText().equals(expMsg));
    }

    public void verifyDonationMsg(String expMsg) {
        CommonUtils.sleepProg(2);
        System.out.println(getDriver().findElement(donationAmtMsg).getText());
        Assert.assertTrue(getDriver().findElement(donationAmtMsg).getText().equals(expMsg));
    }


}
