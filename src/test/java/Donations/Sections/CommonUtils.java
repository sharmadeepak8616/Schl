package Donations.Sections;

import CreateTeacherAccount.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonUtils {

    public static String fullUrl = "https://shop.scholastic.com/on/demandware.store/Sites-donation-us-Site/default/Donate-Start?campaignId=OPS";
    public static String shortUrl = "scholastic.com/OaklandSchoolsISD";

    //public static String fullUrl = "https://shop-stage.scholastic.com/on/demandware.store/Sites-donation-us-Site/default/Donate-Start?campaignId=OPS";
    //public static String fullUrl = "https://shop.scholastic.com/on/demandware.store/Sites-donation-us-Site/default/Donate-Start?campaignId=OPS";

    public static String masterCardType = "MasterCard";
    public static String masterCardNumber = "5555111111111111";
    public static String masterCardCvc = "123";

    public static String visaType = "Visa";
    public static String visaNumber = "4111111111111111";
    public static String visaCvc = "111";

    public static String discoverType = "Discover";
    public static String discoverNumber = "6011111111111117";
    public static String discoverCvc = "555";

    public static String amexType = "American Express";
    public static String amexNumber = "378282246310005";
    public static String amexCvc = "9999";

    public static String cardExpiryMonth = "02";
    public static String cardExpiryYear = "2022";

    public static String defFirstName = "dfName";
    public static String defLastName = "dlName";
    public static String defAddress = "201 W";
    public static String defCity = "New York City";
    public static String defState = "New York";
    public static String defZipCode = "10012";
    public static String defEmail = "dsharma-consultant@scholastic.com";
    public static String defPhone = "1234567890";

    public static WebDriver driver;
    public static String errorMsg = "Please make a valid entry in the above fields";
    public static String minAmountMsg = "*minimum donation of $5 is required";
    public static String colorWhiteValidField = "rgba(255, 255, 255, 1)";
    public static String colorBlackValidField = "rgba(0, 0, 0, 1)";
    public static String colorRedInvalidField = "rgba(255, 0, 0, 1)";
    public static String colorDarkRedInvalidField = "rgba(236, 29, 37, 1)";
    public static String thankyouPageHeader = "THANK YOU";
    public static String thankyouMsg = ", thank you for supporting this campaign.";
    public static String donationMsg_start = "Your donation of $";
    public static String donationMsg_end = " has been processed.";
    public static String totalPriceMsg = "Total: $";
    public static String bookChoiceTextBeforeContinue = "Select books";
    public static String bookChoiceTextAfterContinue = " books selected";
    public static String invalidCCErrorMsg = "We are unable to process your payment at this time. Please check your card number or enter another card at this time!";
    public static String incompleteCCErrorMsg = "Invalid Credit Card";
    public static String invalidCVCErrorMsg = "Invalid Security Code";
    public static String ccExpiredErrorMsg = "Credit Card is expired";

    public static void sleepProg(int time) {
       /* try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }

    public static String makeIntDouble(double amount) {
        DecimalFormat df = new DecimalFormat("#.00");
        String actualCartPrice = df.format(amount);
        return actualCartPrice;
    }

    public static double getPriceWithoutDollar(String priceWithDollar) {
        String patternToGetHour = "\\s*\\$([\\d\\.]+)";
        Pattern pattern = Pattern.compile(patternToGetHour);
        Matcher match = pattern.matcher(priceWithDollar);
        String price = null;
        if(match.find()) {
            price = match.group(1);
        }
        return Double.valueOf(price);



    }

    public static void openDonationUsingFullUrl() {
        ConfigReader input = new ConfigReader();
        System.setProperty("webdriver.chrome.driver", input.getChromeDriverPath());
        driver = new ChromeDriver();
        driver.get(fullUrl);
        driver.manage().window().maximize();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {

        }
    }

    public static void openDonationUsingShortUrl() {
        ConfigReader input = new ConfigReader();
        System.setProperty("webdriver.chrome.driver", input.getChromeDriverPath());
        driver = new ChromeDriver();
        driver.get(shortUrl);
        driver.manage().window().maximize();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {

        }
    }

    public static void verifyshortUrlChangedIntoFullUrl() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        String currentUrl = getDriver().getCurrentUrl();
        Assert.assertTrue(currentUrl.equals(fullUrl), "Issue in URL : " + currentUrl);
    }

    public static WebDriver getDriver() {return driver;}

    public static void quitDriver() {driver.quit();}

    //this.getClass().getSimpleName()
    public static void getFullPageScreenShot(String name) {
        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(getDriver());
        try {
            ImageIO.write(screenshot.getImage(), "PNG", new File("C:/Schl/ScreenShots/"+name+".png"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
