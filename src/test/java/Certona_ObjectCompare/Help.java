package Certona_ObjectCompare;

        import java.io.IOException;
        import java.util.Arrays;
import java.util.logging.Level;

import CreateTeacherAccount.ConfigReader;
import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriverService;
        import org.openqa.selenium.chrome.*;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
        import org.openqa.selenium.remote.DesiredCapabilities;
/*
        import org.openqa.selenium.remote.RemoteWebDriver;

        import com.github.kklisura.cdt.launch.ChromeLauncher;
        import com.github.kklisura.cdt.protocol.commands.Network;
        import com.github.kklisura.cdt.protocol.commands.Page;
        import com.github.kklisura.cdt.services.ChromeDevToolsService;
        import com.github.kklisura.cdt.services.ChromeService;
        import com.github.kklisura.cdt.services.types.ChromeTab;
*/

/**
 * Log requests example with DevTools java client.
 *
 * <p>The following example will open chrome, create a tab with about:blank url, subscribe to
 * requestWillBeSent event and then navigate to github.com.
 *
 * @author Kenan Klisura
 */
public class Help {

    public static ConfigReader input = new ConfigReader();

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", input.getChromeDriverPath());

        LoggingPreferences loggingprefs = new LoggingPreferences();
        loggingprefs.enable(LogType.BROWSER, Level.WARNING);
        loggingprefs.enable(LogType.PERFORMANCE, Level.WARNING);

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(CapabilityType.LOGGING_PREFS, loggingprefs);

        WebDriver driver = new ChromeDriver(capabilities);
        //driver = Browser_utl.getSpecificDriver("chrome");

        driver.get("https://development-rco-scholastic.demandware.net/s/rco-ca/en/home");

        Thread.sleep(2000);

        driver.findElement(By.xpath(".//*[contains(@id,'dwfrm_login_username')]")).sendKeys("testqa1@mailinator.com");
        driver.findElement(By.xpath(".//*[contains(@id,'dwfrm_login_password')]")).sendKeys("passw0rd");
        driver.findElement(By.xpath(".//*[@id='dwfrm_login']/fieldset/div[1]/button")).click();

        //		window.certona

    }

    //	driver.close();
    //	driver.quit();
}
