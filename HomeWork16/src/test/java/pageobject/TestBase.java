package pageobject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageobject.helpers.WebDriverContainer;

import java.net.MalformedURLException;

/**
 * Parent class TestBase
 */
public class TestBase {
    // Fields:
    private static final String url = "https://litecart.stqa.ru/en/";
    // Driver:
    protected static WebDriver driver;

    /**
     * SetUp method before every methods
     */
    @BeforeMethod(groups = "for all tests", alwaysRun = true)
    public void setup() throws MalformedURLException {
        driver = WebDriverContainer.getDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    /**
     * TearDown method after all methods
     */
    @AfterMethod(groups = "for all tests", alwaysRun = true)
    public void teardown() {
        WebDriverContainer.quitDriver();
    }
}
