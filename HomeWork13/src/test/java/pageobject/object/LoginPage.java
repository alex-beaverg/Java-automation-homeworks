package pageobject.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Class for object LoginPage (Object model)
 */
public class LoginPage extends PageBase {
    // Fields:
    private final By emailInput = By.name("email");
    private final By passwordInput = By.name("password");
    private final By loginButton = By.name("login");
    private final By loginErrorMessage = By.cssSelector(".notice.errors");
    // Driver:
    private final WebDriver driver;

    /**
     * Constructor for class LoginPage
     * @param driver
     */
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Method to enter email into email input field
     * @param email
     */
    public void enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    /**
     * Method to enter password into password input field
     * @param password
     */
    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    /**
     * Method to click login button
     */
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    /**
     * Method to full login actions
     * @param email
     * @param password
     */
    public void attemptLogin(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }

    /**
     * Method to check error login message
     * @return boolean
     */
    public boolean loginErrorMessageIsVisible() {
        return driver.findElement(loginErrorMessage).isDisplayed();
    }

    /**
     * Method to check open login page
     */
    public boolean hasOpened() {
        return super.hasOpened(driver,"Login | My Store");
    }
}
