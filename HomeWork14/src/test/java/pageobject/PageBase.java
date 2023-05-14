package pageobject;

import org.openqa.selenium.WebDriver;

/**
 * Parent class PageBase
 */
public class PageBase {
    /**
     * Method to check open page
     */
    public boolean hasOpened(WebDriver driver, String title) {
        return driver.getTitle().equals(title);
    }
}
