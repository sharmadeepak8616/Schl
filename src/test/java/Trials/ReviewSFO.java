package Trials;

import Shortcuts.Login;
import Shortcuts.Modification;
import Shortcuts.SwitchPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import CreateTeacherAccount.ConfigReader;

import java.util.List;

public class ReviewSFO {

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
        go.fromSfoToReviewSfo(driver);

        String name = "Zac";
        double actualTotalPrice = 0;
        int actualTotalItems = 0;
        double cartTotal = 0;
        List<WebElement> studentPrices = driver.findElements(By.xpath("//tr[@data-name='"+name+"']//td[@class='price hidden-xs']"));
        List<WebElement> studentItems = driver.findElements(By.xpath("//tr[@data-name='"+name+"']//td[@class='item-qty']/input"));
        for (int i=0 ; i < studentItems.size() ; i++) {
            actualTotalPrice = Modification.stringToDouble(Modification.getPriceWithoutDollar(studentPrices.get(i).getText()));
            int item = 0;
            if (i == 0) {
                //get i from quantiy in dataxml
                item = Modification.stringToInt(studentItems.get(i).getAttribute("value"));
            } else {
                item = Modification.stringToInt(studentItems.get(i).getAttribute("value"));
            }
            actualTotalItems = actualTotalItems + item;
            cartTotal = cartTotal + (actualTotalPrice * item);
        }

        String expectedTotalPriceStr = driver.findElement(By.xpath("//li[contains(text(), '"+name+"')]/following-sibling::li[@class='std-total-price']")).getText();
        double expectedStudentTotalPrice = Modification.stringToDouble(Modification.getPriceWithoutDollar(expectedTotalPriceStr));

        String expectedTotalItemStr = driver.findElement(By.xpath("//li[contains(text(), '"+name+"')]/following-sibling::li//span")).getText();
        int expectedStudentTotalItem = Modification.stringToInt(expectedTotalItemStr);

        if((actualTotalItems == expectedStudentTotalItem) && (cartTotal == expectedStudentTotalPrice)) {
            System.out.println("All good");
            System.out.println("Good values: " + actualTotalItems + " -- " + expectedStudentTotalItem + " -- " + cartTotal + " -- " + expectedStudentTotalPrice);
        } else {
            System.out.println(actualTotalItems + " -- " + expectedStudentTotalItem + " -- " + cartTotal + " -- " + expectedStudentTotalPrice);
        }

        List<WebElement> allTotalPrices = driver.findElements(By.xpath("//li[@class='std-total-price']"));
        List<WebElement> allItems = driver.findElements(By.xpath("//li[@class='std-total-qty']//span"));
        int actualAllItems = 0;
        double actualAllPrices = 0;
        for (int i=0 ; i < allItems.size()-1 ; i++) {
            actualAllItems = actualAllItems + Modification.stringToInt(allItems.get(i).getText());
            actualAllPrices = actualAllPrices + Modification.stringToDouble(Modification.getPriceWithoutDollar(allTotalPrices.get(i).getText()));
        }

        double expectedAllPrices = Modification.stringToDouble(Modification.getPriceWithoutDollar(allTotalPrices.get(allItems.size()-1).getText()));
        int expectedAllItems = Modification.stringToInt(allItems.get(allItems.size()-1).getText());

        WebElement sfoSummary = driver.findElement(By.id("student_flyer_orders"));
        double totalSFOSummary = Modification.stringToDouble(Modification.getPriceWithoutDollar(sfoSummary.getText()));

        System.out.println("Totals: ");
        System.out.println(actualAllItems + " -- " + expectedAllItems + " -- " + actualAllPrices + " -- " + expectedAllPrices + " summary -- " + totalSFOSummary);





























        driver.quit();

    }


}
