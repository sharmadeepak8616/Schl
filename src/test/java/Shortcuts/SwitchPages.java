package Shortcuts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwitchPages {

    public void fromHomeToEnderOrders(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='orders']//a[contains(@href, 'sfoshow')]")).click();
        Thread.sleep(2000);
    }

    public void fromSfoToReviewSfo(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(@href, 'sforeview')]")).click();
        Thread.sleep(2000);
    }

    public void fromSfoTabToYtoTab(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@id='tab-yto']/a")).click();
        Thread.sleep(2000);
    }

    public void fromItemTabToFlyerTabOnYTOPage(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'By Flyer')]")).click();
        Thread.sleep(5000);
    }

    public void fromSfoToCart(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='secondary']")).click();
        Thread.sleep(4000);
    }

    public void fromAnyToMyClassroomWishList(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='toggle-item']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href='https://clubs3qa1.scholastic.com/wishlist?wishlistroom=true']")).click();
        Thread.sleep(4000);
    }



}
