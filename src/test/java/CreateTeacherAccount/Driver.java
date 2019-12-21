package CreateTeacherAccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private WebDriver driver;
    ConfigReader input = new ConfigReader();

    public void initiateDriver() {
        System.setProperty("webdriver.chrome.driver", input.getChromeDriverPath());
        driver = new ChromeDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }


    public void openUrl() throws InterruptedException {

        Thread.sleep(2000);
        driver.get(input.getUrl());
        //Thread.sleep(4000);
        driver.manage().window().maximize();

    }




}
