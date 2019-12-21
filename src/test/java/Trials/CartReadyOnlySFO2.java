package Trials;

import CreateTeacherAccount.ConfigReader;
import Shortcuts.AddItems;
import Shortcuts.Login;
import Shortcuts.ScreenShot;
import Shortcuts.SwitchPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartReadyOnlySFO2 {
    public static void main(String[] args) throws InterruptedException {

        Login login = new Login();
        SwitchPages go = new SwitchPages();
        ConfigReader input = new ConfigReader();
        AddItems add = new AddItems();
        ScreenShot takeSnippet = new ScreenShot();

        System.setProperty("webdriver.chrome.driver", input.getChromeDriverPath());
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get(input.getUrl());
        driver.manage().window().maximize();

        //login.login(driver, "qaPrecartTax1@schl.com");
        login.login(driver, "tax@schl.com");


        //add.addItemToWishList(driver, "1H5");

        //go.fromAnyToMyClassroomWishList(driver);

        //add.publishWishList(driver);


        go.fromHomeToEnderOrders(driver);

        add.addCouponItemOnSFO(driver, "John", "80069");
/*

        Thread.sleep(4000);
        add.addSFOItem(driver, "Gary" , "1H3");
        add.addSFOItem(driver, "John" , "2H3");

        go.fromSfoToCart(driver);

        add.addDonation(driver, "5");



        String snippetName = new CartReadyOnlySFO2().getClassname();
        takeSnippet.getFullPageScreenShot(driver, snippetName);
*/


        driver.quit();

    }

    public String getClassname() {
        return this.getClass().getSimpleName();
    }


}
