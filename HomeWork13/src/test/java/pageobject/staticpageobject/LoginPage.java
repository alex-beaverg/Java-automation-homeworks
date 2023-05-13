package pageobject.staticpageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Class for object LoginPage (Static model)
 */
public class LoginPage {
    // Static fields:
    private static final By emailInput = By.name("email");
    private static final By passwordInput = By.name("password");
    private static final By loginButton = By.name("login");
    private static final By loginErrorMessage = By.cssSelector(".notice.errors");

    /**
     * Static method to enter email into email input field
     * @param driver
     * @param email
     */
    public static void enterEmail(WebDriver driver, String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    /**
     * Static method to enter password into password input field
     * @param driver
     * @param password
     */
    public static void enterPassword(WebDriver driver,  String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    /**
     * Static method to click login button
     * @param driver
     */
    public static void clickLoginButton(WebDriver driver) {
        driver.findElement(loginButton).click();
    }

    /**
     * Static method to full login actions
     * @param driver
     * @param email
     * @param password
     */
    public static void attemptLogin(WebDriver driver,  String email, String password) {
        enterEmail(driver, email);
        enterPassword(driver, password);
        clickLoginButton(driver);
    }

    /**
     * Static method to check error login message
     * @param driver
     * @return boolean
     */
    public static boolean loginErrorMessageIsVisible(WebDriver driver) {
        return driver.findElement(loginErrorMessage).isDisplayed();
    }
}
