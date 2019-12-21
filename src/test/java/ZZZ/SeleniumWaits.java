package ZZZ;

import com.google.common.base.Function;
import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.util.concurrent.TimeUnit;


public class SeleniumWaits {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        //Implicit
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //Explicit
        WebDriverWait expWait = new WebDriverWait(driver, 10);
        expWait.until(ExpectedConditions.titleIs("Google"));

        /**
         * ExpectedConditions with AND/OR
         */
        expWait.until(ExpectedConditions.or(ExpectedConditions.titleIs(""),ExpectedConditions.alertIsPresent()));
        expWait.until(ExpectedConditions.and(ExpectedConditions.titleIs(""),ExpectedConditions.alertIsPresent()));


        //Fluent
        Wait<WebDriver> fWait = new FluentWait<WebDriver>(driver)
                .withTimeout(20, TimeUnit.SECONDS)
                .pollingEvery(1, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class)
                .withMessage("Wait time over");

        WebElement element = fWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(""));
            }
        });

        fWait.until(ExpectedConditions.titleIs(""));




    }

}
