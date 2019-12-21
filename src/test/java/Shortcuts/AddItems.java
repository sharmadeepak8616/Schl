package Shortcuts;

import gherkin.lexer.Th;
import gherkin.lexer.Tr;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddItems {

    public void addSFOItem(WebDriver driver, String sName, String itemNo) throws InterruptedException {
        driver.findElement(By.id("student-name")).sendKeys(sName);
        Thread.sleep(2000);
        driver.findElement(By.id("item-number")).sendKeys(itemNo);
        Thread.sleep(2000);
        driver.findElement(By.id("btn-add")).click();
        Thread.sleep(2000);
    }

    public void addYTOItem(WebDriver driver, String itemNo) throws InterruptedException {
        driver.findElement(By.id("item-number")).sendKeys(itemNo);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='btn-add']")).click();
        Thread.sleep(2000);
    }

    public void addYTOItemByBonus(WebDriver driver, String itemNo, String itemQty) throws InterruptedException {
        driver.findElement(By.id("item-number")).sendKeys(itemNo);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='btn-add']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[contains(@class,'itemNum')]/a[text()='"+itemNo+"']/parent::td/following-sibling::td[contains(@class,'bonus-qty')]/input")).sendKeys(itemQty);
    }


    public void addDonation(WebDriver driver, String amount) throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='selected-option selected-active']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[contains(@class,'custom-option')]//span[text()='$"+amount+"']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("cb-book-trust")).click();
        Thread.sleep(2000);

    }

    public void addItemToWishList(WebDriver driver, String item) throws InterruptedException {
        driver.findElement(By.id("q")).sendKeys(item);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//form[@name='simpleSearch']//button[@type='submit']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[contains(text(),'Add to Wish List')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value='wishlist']")).click();
        Thread.sleep(1000);
    }

    public void publishWishList(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='dwfrm_wishlist_publishlistwish']")).click();
        Thread.sleep(1000);
    }

    public void addCouponItemOnSFO(WebDriver driver, String studentName, String coupon) throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Apply a coupon for this student')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='coupon-student-name']")).sendKeys(studentName);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='coupon-number']")).sendKeys(coupon);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='btn-apply']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='selected-option input-select']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[contains(@class,'custom-option')]//span[contains(text(),'Kindergarten')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//table[@id='sfo-coupon-table']//tr[1]/td[contains(@class,'col-select')]/i")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='btn-coupon-confirm']")).click();
        Thread.sleep(4000);
    }




}
