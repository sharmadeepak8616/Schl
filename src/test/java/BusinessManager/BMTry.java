package BusinessManager;

import CreateTeacherAccount.ConfigReader;
import Shortcuts.AddItems;
import Shortcuts.Login;
import Shortcuts.ScreenShot;
import Shortcuts.SwitchPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BMTry {

    public static void main(String[] args) throws InterruptedException {

        Login login = new Login();
        SwitchPages go = new SwitchPages();
        ConfigReader input = new ConfigReader();
        AddItems add = new AddItems();
        ScreenShot takeSnippet = new ScreenShot();
        BMActions bm = new BMActions();

        System.setProperty("webdriver.chrome.driver", input.getChromeDriverPath());
        WebDriver driver = new ChromeDriver();

        bm.login(driver, "tshanmugam", "Green511!");


        driver.quit();
    }


}
