package pageobject.fluentinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Class for object HomePage (Fluent model)
 */
public class HomePage {
    // Fields:
    private final By successMessage = By.cssSelector(".notice.success");
    // Driver:
    private final WebDriver driver;

    /**
     * Constructor for class HomePage
     * @param driver
     */
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Method to check and assert success login message
     * @return HomePage
     */
    public HomePage assertThatSuccessMessageIsVisible() {
        Assert.assertTrue(driver.findElement(successMessage).isDisplayed(), "Login was unsuccessful");
        return this;
    }
}
