package helpers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static helpers.Browser.CHROME;

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
    public static WebDriver getDriver () {
        if (null == driver) {
            Browser browserName = Browser.getEnumByLabel(System.getProperty("browser", CHROME.getBrowserName()));
            switch (browserName) {
                case CHROME -> {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                }
                case FIREFOX -> {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver(); }
                case EDGE -> {
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                }
            }
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
