package Trials;

import Shortcuts.Login;
import Shortcuts.SwitchPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import CreateTeacherAccount.ConfigReader;

import java.util.ArrayList;

public class SFO {

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

        Thread.sleep(4000);
        WebElement attnMsg = driver.findElement(By.xpath("//div[@class='exclamation-message hide']"));
        System.out.println(attnMsg.getAttribute("style"));

        ArrayList<WebElement> arr = new ArrayList<>();
        arr.add(attnMsg);


    }



}
