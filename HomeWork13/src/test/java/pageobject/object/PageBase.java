package pageobject.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static pageobject.helpers.Locators.getLocator;

/**
 * Parent class PageBase
 */
public class PageBase {
    /**
     * Method to check open page
     */
    public boolean hasOpened(WebDriver driver, String title) {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.titleIs(title));
        return driver.getTitle().equals(title);
    }
}
