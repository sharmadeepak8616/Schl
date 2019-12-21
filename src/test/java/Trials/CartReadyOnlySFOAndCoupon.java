package Trials;

import CreateTeacherAccount.ConfigReader;
import Shortcuts.AddItems;
import Shortcuts.Login;
import Shortcuts.ScreenShot;
import Shortcuts.SwitchPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartReadyOnlySFOAndCoupon {
    public static void main(String[] args) throws InterruptedException {

        Login login = new Login();
        SwitchPages go = new SwitchPages();
        ConfigReader input = new ConfigReader();
        AddItems add = new AddItems();
        ScreenShot takeSnippet = new ScreenShot();


        System.setProperty("webdriver.chrome.driver", input.getChromeDriverPath());
        WebDriver driver = new ChromeDriver();

        driver.get(input.getStgUrl());
        driver.manage().window().maximize();

        login.login(driver, "precartTax13@schl.com");
        go.fromHomeToEnderOrders(driver);
        Thread.sleep(4000);
        add.addSFOItem(driver, "Gary" , "2T7");
        add.addSFOItem(driver, "John" , "1T7");
        go.fromSfoToCart(driver);
        String snippetName = new CartReadyOnlySFOAndCoupon().getClassname();
        takeSnippet.getFullPageScreenShot(driver, "snippetName");


    }

    public String getClassname() {
        return this.getClass().getSimpleName();
    }


}
