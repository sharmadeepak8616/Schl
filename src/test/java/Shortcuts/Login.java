package Shortcuts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    public void taxLogin(WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("dwfrm_login_username")).sendKeys("tax@schl.com");
        driver.findElement(By.id("dwfrm_login_password")).sendKeys("passw0rd");
        driver.findElement(By.xpath("//button[@value='Login']")).click();
        Thread.sleep(10000);
        try {
            driver.findElement(By.xpath("//span[@class='notification-close']")).click();
        } catch (Exception e) {

        }
        Thread.sleep(2000);
    }

    public void login(WebDriver driver, String email) throws InterruptedException {
        driver.findElement(By.id("dwfrm_login_username")).sendKeys(email);
        driver.findElement(By.id("dwfrm_login_password")).sendKeys("passw0rd");
        driver.findElement(By.xpath("//button[@value='Login']")).click();
        Thread.sleep(10000);
        try {
            driver.findElement(By.xpath("//span[@class='notification-close']")).click();
        } catch (Exception e) {

        }
        Thread.sleep(2000);
    }


}
