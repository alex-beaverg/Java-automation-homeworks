package pageobject.helpers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;
import pageobject.BrowserList;

import java.net.MalformedURLException;
import java.net.URL;

import static pageobject.BrowserList.CHROME_BROWSER;

/**
 * Class WebDriverContainer
 */
public class WebDriverContainer {
    // Driver:
    private static WebDriver driver;

    /**
     * Constructor for class WebDriverContainer
     */
    private WebDriverContainer() {}

    /**
     * Method to get WebDriver
     */
    public static WebDriver getDriver () throws MalformedURLException {
        if (null == driver) {
            BrowserList browserName = BrowserList.getEnumByLabel(System.getProperty("browser", CHROME_BROWSER.getBrowserName()));
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setPlatform(Platform.WINDOWS);
            switch (browserName) {
                case CHROME_BROWSER -> {
                    WebDriverManager.chromedriver().setup();
                    caps.setBrowserName(Browser.CHROME.browserName());
                }
                case FIREFOX_BROWSER -> {
                    WebDriverManager.firefoxdriver().setup();
                    caps.setBrowserName(Browser.FIREFOX.browserName());
                }
            }
            driver = new RemoteWebDriver(new URL("http://192.168.0.104:4444/wd/hub"), caps);
        }
        return driver;
    }

    /**
     * Method to quit WebDriver
     */
    public static void quitDriver() {
        driver.quit();
        driver = null;
    }
}
