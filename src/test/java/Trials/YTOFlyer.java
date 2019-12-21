
package Trials;

import Shortcuts.Login;
import Shortcuts.SwitchPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import CreateTeacherAccount.ConfigReader;

public class YTOFlyer {

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
        go.fromItemTabToFlyerTabOnYTOPage(driver);
        Thread.sleep(4000);
        System.out.println(driver.findElement(By.xpath("//tr[1]/td[contains(@class,'item-qty')]/input")).getAttribute("jumpy"));
        System.out.println("HAPPY START");
        driver.findElement(By.xpath("//tr[1]/td[contains(@class,'item-qty')]/input")).click();
        System.out.println(driver.findElement(By.xpath("//div[contains(@class,'content-asset')]//div[@class='info-modal']")).isDisplayed());
        Thread.sleep(2000);
        System.out.println("Happy");
        System.out.println(driver.findElement(By.xpath("//tr[1]/td[contains(@class,'item-qty')]/input")).getAttribute("jumpy"));
        System.out.println("Happy");

        System.out.println(driver.findElement(By.xpath("//div[contains(@class,'content-asset')]//div[@class='info-modal-hd']")).getText());
        System.out.println(driver.findElement(By.xpath("//div[contains(@class,'content-asset')]//div[@class='info-modal-content']")).getText().trim());

        //driver.findElement(By.xpath("//tr[1]/td[contains(@class,'bonus-qty')]/input")).click();
        driver.findElement(By.xpath("//div[contains(@class,'content-asset')]//div[@class='info-modal']//span")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//tr[1]/td[contains(@class,'item-qty')]/input")).getAttribute("jumpy"));
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//div[contains(@class,'content-asset')]//div[@class='info-modal']")).isDisplayed());





        driver.quit();




    }


}

