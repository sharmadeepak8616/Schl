package Trials;

import Shortcuts.Login;
import Shortcuts.SwitchPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import CreateTeacherAccount.ConfigReader;

public class YTOItem {

    public static void main(String[] args) throws InterruptedException {

        Login login = new Login();
        SwitchPages go = new SwitchPages();
        ConfigReader input = new ConfigReader();
        System.setProperty("webdriver.chrome.driver", input.getChromeDriverPath());
        WebDriver driver = new ChromeDriver();

        driver.get(input.getUrl());
        driver.manage().window().maximize();

        login.taxLogin(driver);
        go.fromHomeToEnderOrders(driver);
        go.fromSfoTabToYtoTab(driver);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='item-number']")).click();


    }
}

