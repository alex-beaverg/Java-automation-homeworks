package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static pageobject.Browser.CHROME;

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
    @BeforeMethod(groups = "for all tests")
    public void setup() {
        Browser browserName = Browser.getEnumByLabel(System.getProperty("browser", CHROME.getBrowserName()));
        switch (browserName) {
            case CHROME -> driver = new ChromeDriver();
            case FIREFOX -> driver = new FirefoxDriver();
            case EDGE -> driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
    }

    /**
     * TearDown method after all methods
     */
    @AfterMethod(groups = "for all tests")
    public void teardown() {
        driver.quit();
    }
}
