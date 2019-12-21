package CreateTeacherAccount;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SCHL {

    public static void main(String[] args) throws InterruptedException {



        Date start = new Date();
        ConfigReader input = new ConfigReader();
        String numberInEmail = "";
        System.out.println(start);
        Driver d = new Driver();

        System.setProperty("webdriver.chrome.driver", input.getChromeDriverPath());
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get(input.getUrl());
        //Thread.sleep(4000);
        driver.manage().window().maximize();

/*        d.initiateDriver();
        d.openUrl();
        WebDriver driver = d.getDriver();*/


        int number = Integer.parseInt(input.getNumberOfTeacherAccount());
        if (number == 0) {
            number = 10;
        }

        for (int i=1 ; i <= number ; i++) {
            //System.setProperty("webdriver.chrome.driver", input.getChromeDriverPath());
            //WebDriver driver = new ChromeDriver();

            try {
                driver.findElement(By.xpath("//a[@class='avaya-no button disabled']")).click();
            } catch (Exception e) {

            }

            //CREATE A TEACHER
            driver.findElement(By.xpath("//div[contains(@class,'home-unauthenticated-middle')]//span[@class='teacher_signin']")).click();

            //TEACHER INFO PAGE;
            Thread.sleep(5000);
            driver.findElement((By.xpath("//div[@class='custom-select']"))).click();
            //Thread.sleep(2000);
            driver.findElement((By.xpath("//li[@class='custom-option select-option'][@data-label='" + input.getGreeting() + "']"))).click();

            driver.findElement((By.id("dwfrm_profile_customer_firstname"))).sendKeys(input.getFirstname());
            driver.findElement((By.id("dwfrm_profile_customer_lastname"))).sendKeys(input.getLastname());

            String emailId = "";
            if (input.getRandom().equalsIgnoreCase("on")) {
                emailId = input.getEmail() + RandomStringUtils.randomNumeric(6) + "@schl.com";
            } else {
                if (i == 1) {
                    numberInEmail = input.getEmailStartForTax();
                } else {
                    numberInEmail = String.valueOf((Integer.parseInt(numberInEmail) + 1));
                }
                emailId = input.getEmail() + numberInEmail + "@schl.com";
            }
            driver.findElement((By.id("dwfrm_profile_customer_email"))).sendKeys(emailId);
            driver.findElement((By.id("dwfrm_profile_login_password"))).sendKeys(input.getPassword());
            driver.findElement((By.id("dwfrm_registration_termsofuseteacher"))).click();
            driver.findElement((By.className("button-continue"))).click();

            //SCHOOL PAGE INFO
            Thread.sleep(5000);

/*	            System.out.println("Happy");
	            System.out.println(driver.findElement(By.xpath("//div[@class='form-caption error-message' and contains(text(),'email already exists')]")).isDisplayed());
	            System.out.println(driver.findElement(By.xpath("//div[@class='form-caption error-message' and contains(text(),'email already exists')]")).isEnabled());
	            System.out.println("Happy Again");
	            try {
	            	webAction(By.id("dwfrm_myschool_schoolzip")).sendKeys(input.getZip());
	            } catch (Exception e) {
	            	System.out.println("Email id already registered....going to get next one");
	            	break;
	            }*/

/*	            boolean emailAlreadyPresent = webAction(By.xpath("//div[@class='form-caption error-message' and contains(text(),'email already exists')]")).isDisplayed();
	            if (emailAlreadyPresent) {
	            	System.out.println("Next one");
	            	break;
	            }*/

            try {
                boolean emailAlreadyPresent = driver.findElement((By.xpath("//div[@class='form-caption error-message' and contains(text(),'email already exists')]"))).isDisplayed();
                if (emailAlreadyPresent) {
                    System.out.println("Next one");
                    driver.findElement(By.xpath("//div[contains(@class,'step-1')]//span[contains(@class,'dialog-close')]")).click();
                    Thread.sleep(5000);
                    continue;
                }
            } catch (NoSuchElementException e) {

            }

            driver.findElement((By.id("dwfrm_myschool_schoolzip"))).sendKeys(input.getZip());
            driver.findElement((By.id("button-search"))).click();
            Thread.sleep(5000);
            WebElement school = driver.findElement(By.xpath("//ul[@class='content-scrollbar']//li[36]//span"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", school);
            driver.findElement((By.xpath("//button[@value='NEXT']"))).click();

            //TEACHER ROLE PAGE
            Thread.sleep(5000);
            driver.findElement((By.xpath("//div[@class='custom-select']"))).click();
            driver.findElement((By.xpath("//div[contains(@class,'custom-select active')]//li[contains(@data-label,'" + input.getRole1() + "')]"))).click();
            //Thread.sleep(4000);
            driver.findElement((By.xpath("//label[@for='dwfrm_myrole_grades']/following-sibling::div[@class='custom-select']"))).click();
            driver.findElement((By.xpath("//div[@class='custom-select active']//ul[@class='content-scrollbar']//li[@data-label='" + input.getRole2() + "']"))).click();
            //Thread.sleep(2000);
            driver.findElement((By.id("dwfrm_myrole_students"))).sendKeys(input.getStudents());
            driver.findElement((By.xpath("//button[@value='NEXT']"))).click();

            //CUSTOMIZE READING CLUB EXPERIENCE
            Thread.sleep(5000);
            driver.findElement((By.xpath("//div[@class='custom-select']"))).click();
            driver.findElement((By.xpath("//div[contains(@class,'custom-select active')]//li[contains(@data-label,'" + input.getLevel() + "')]"))).click();
            //Thread.sleep(2000);
            driver.findElement((By.xpath("//div[@class='form-row'][1]//label["+getAns(input.getQ1())+"]"))).click();
            driver.findElement((By.xpath("//div[@class='form-row'][2]//label["+getAns(input.getQ2())+"]"))).click();
            driver.findElement((By.xpath("//div[@class='form-row'][3]//label["+getAns(input.getQ3())+"]"))).click();
            driver.findElement((By.xpath("//button[@class='button-continue']"))).click();

            //HOMEPAGE
            Thread.sleep(5000);
            try {
                driver.findElement((By.xpath("//span[@class='notification-close']"))).click();
            } catch (Exception e) {

            }
            String lastNameOnWelcomePage = driver.findElement(By.xpath("//div[@class='user']//span")).getText();
            if (lastNameOnWelcomePage.contains(input.getLastname())) {
                Date now = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("MMMdd");
                String time = sdf.format(now);

                WriteInFile textToWrite = new WriteInFile("sample" + time + ".txt");
                textToWrite.writeToFile(emailId);
            }

            //click My Account
            driver.findElement((By.xpath("//li[@class='user-info toggle-menu']/a"))).click();

            //click SignOut
            driver.findElement((By.xpath("//a[text()='Sign Out']"))).click();
            Thread.sleep(10000);

            //Close window
            //driver.close();
        }
        driver.close();
        Date end = new Date();
        System.out.println(end);

    }

/*

    // This is the most common wait function used in selenium
    public static WebElement webAction(final By locator) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(1, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementNotVisibleException.class)
                .withMessage("Webdriver waited for 30 seconds but still could not find the element therefore Timeout Exception has been thrown");

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
        return element;

    }
*/

    public static int getAns(String qValueFromConfig) {
        int ans=3;
        if (qValueFromConfig.equalsIgnoreCase("yes")) {
            ans=2;
        }
        return ans;
    }









}