package pageobject.object;

import org.openqa.selenium.WebDriver;

import static pageobject.helpers.Locators.getLocator;

/**
 * Class for object LoginPage (Object model)
 */
public class LoginPage extends PageBase {
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
        driver.findElement(getLocator("LoginPage.emailInput")).sendKeys(email);
    }

    /**
     * Method to enter password into password input field
     * @param password
     */
    public void enterPassword(String password) {
        driver.findElement(getLocator("LoginPage.passwordInput")).sendKeys(password);
    }

    /**
     * Method to click login button
     */
    public void clickLoginButton() {
        driver.findElement(getLocator("LoginPage.loginButton")).click();
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
        return driver.findElement(getLocator("LoginPage.loginErrorMessage")).isDisplayed();
    }

    /**
     * Method to check open login page
     */
    public boolean hasOpened() {
        return super.hasOpened(driver,"Login | My Store");
    }
}
