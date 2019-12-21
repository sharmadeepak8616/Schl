package ZZZ;

import CreateTeacherAccount.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Captcha {

    public static void main(String[] args) throws InterruptedException {

        ConfigReader input = new ConfigReader();
        System.setProperty("webdriver.chrome.driver", input.getChromeDriverPath());
        WebDriver driver = new ChromeDriver();

        driver.get("https://www-qa2.scholastic.com/parent-ecommerce/parent-store.html");
        //driver.get("https://www-qa2.scholastic.com/teachers-ecommerce/teacher/tsohomepage.html");
        //driver.get("https://shop-stage.scholastic.com/parent-ecommerce/parent-store.html");
        //driver.get("https://shop.scholastic.com/parent-ecommerce/parent-store.html");

        driver.manage().window().maximize();
        Thread.sleep(10000);
        WebElement profile = driver.findElement(By.xpath("//div[@class='sch-global-profile-icon']"));
        Actions act = new Actions(driver);
        act.moveToElement(profile).build().perform();

        WebElement signIn = driver.findElement(By.xpath("//a[@class='sch-global-signin']"));
        act.moveToElement(signIn).click().build().perform();
        Thread.sleep(10000);
        //driver.findElement(By.xpath("//form[@id='frm0']//input[@id='regLoginEmail']")).sendKeys("qasso1@mailinator.com");
        driver.findElement(By.xpath("//form[@id='frm0']//input[@id='regLoginEmail']")).sendKeys("stagesso1@mailinator.com");
        //driver.findElement(By.xpath("//form[@id='frm0']//input[@id='regLoginEmail']")).sendKeys("pds8125713@gmail.com");
        driver.findElement(By.xpath("//form[@id='frm0']//input[@id='regLoginPass']")).sendKeys("passw0rd");
        driver.findElement(By.xpath("//button[text()='Sign In']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@class='sch-cart-icon-container']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@id='btnCheckout']")).click();
        Thread.sleep(4000);

        try {
            driver.findElement(By.xpath("//input[@id='altFirstName']")).sendKeys("Deepak");
            driver.findElement(By.xpath("//input[@id='altLastName']")).sendKeys("Sharma");
            driver.findElement(By.xpath("//input[@id='altAddr1']")).sendKeys("126 Clifton Pl");
            driver.findElement(By.xpath("//input[@id='altAddr2']")).sendKeys("apt - 201");
            driver.findElement(By.xpath("//input[@id='altCity']")).sendKeys("Jersey City");
            WebElement stateDropDownAddrEle = driver.findElement(By.xpath("//select[@id='altState']"));
            Select stateDropdownAddr = new Select(stateDropDownAddrEle);
            stateDropdownAddr.selectByVisibleText("New Jersey");
            driver.findElement(By.xpath("//input[@id='altZip']")).sendKeys("07304");
            driver.findElement(By.xpath("//input[@id='altPhone']")).sendKeys("5512424077");
            driver.findElement(By.xpath("//button[@id='btnSaveAltAddr']")).click();
        } catch (Exception e) {

        }
        Thread.sleep(4000);
        try {
            driver.findElement(By.xpath("//a[@title='Add a New Card']")).click();
        } catch (ElementNotVisibleException e) {

        }
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='ccFirstName']")).sendKeys("Deepak");
        driver.findElement(By.xpath("//input[@id='ccLastName']")).sendKeys("Sharma");
        driver.findElement(By.xpath("//input[@id='ccAddr1']")).sendKeys("126 Clifton Pl");
        driver.findElement(By.xpath("//input[@id='ccAddr2']")).sendKeys("Apt 212");
        driver.findElement(By.xpath("//input[@id='ccCity']")).sendKeys("Jersey City");
        WebElement stateDropdownElement = driver.findElement(By.xpath("//select[@id='ccState']"));
        Select stateDropdown = new Select(stateDropdownElement);
        stateDropdown.selectByVisibleText("New Jersey");
        driver.findElement(By.xpath("//input[@id='ccZip']")).sendKeys("07304");
        driver.findElement(By.xpath("//input[@id='ccPhone']")).sendKeys("5512424077");
        driver.findElement(By.xpath("//input[@id='altEmail']")).sendKeys("pds8125713@gmail.com");
        driver.findElement(By.xpath("//input[@id='altEmailConfirm']")).sendKeys("pds8125713@gmail.com");
        driver.findElement(By.xpath("//input[@id='ccNumber']")).sendKeys("4400669602200883");
        WebElement monthDropdownElement = driver.findElement(By.xpath("//select[@id='ccMonth']"));
        Select monthDropdown = new Select(monthDropdownElement);
        monthDropdown.selectByVisibleText("June");
        WebElement yearDropdownElement = driver.findElement(By.xpath("//select[@id='ccYear']"));
        Select yearDropdown = new Select(yearDropdownElement);
        yearDropdown.selectByVisibleText("2022");
        driver.findElement(By.xpath("//input[@id='ccCvn']")).sendKeys("949");
        //driver.findElement(By.xpath("//input[@id='ccAddr1']")).sendKeys("201 W");
        //driver.findElement(By.xpath("//input[@id='ccAddr1']")).sendKeys("201 W");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//button[@id='btnSaveCC']")).click();




    }


}
