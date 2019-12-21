package BusinessManager;

import org.omg.CORBA.INITIALIZE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BMActions {

    public void login(WebDriver driver, String username, String password) throws InterruptedException {
        driver.get("https://development-rco-scholastic.demandware.net/on/demandware.store/Sites-Site/default/ViewCustomObjectList_52-Dispatch?csrf_token=fcuj_vlpqGt4yThokbaSTYi_ExWjAFbhWoH5GYDMmpL1FHz_LCEfVNSJ6OMUnAplcm53bCU-9YIdhelsxu2dp4sMdVvEZGSxuozmnCJxN25pEg0WRYtSzeXVTeiXSMYcq_yA9V0ucQuMXFUdQNWB85XMyWkcTNZC9iRLijXNsR65T1wZOrI");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='LoginForm_Login']")).sendKeys(username);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='LoginForm_Password']")).sendKeys(password);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@name='login']")).click();

    }

    public void gotoMerchantTools(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//span[contains(text(),'Merchant Tools')]")).click();
        Thread.sleep(2000);
    }

    public void gotoReadingClubsUSInMerchantTools(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Reading Club US')]")).click();
        Thread.sleep(2000);
    }

}
