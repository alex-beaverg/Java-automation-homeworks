package pageobject.staticpageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Class for object HomePage (Static model)
 */
public class HomePage {
    // Static fields:
    private static final By successMessage = By.cssSelector(".notice.success");

    /**
     * Static method to check success login message
     * @param driver
     * @return boolean
     */
    public static boolean successMessageIsVisible(WebDriver driver) {
        return driver.findElement(successMessage).isDisplayed();
    }
}
