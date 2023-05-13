package pageobject.fluentinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Class for object LoginPage (Fluent model)
 */
public class LoginPage {
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
    public LoginPage enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
        return this;
    }

    /**
     * Method to enter password into password input field
     * @param password
     */
    public LoginPage enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
        return this;
    }

    /**
     * Method to click login button
     */
    private void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    /**
     * Method to full login actions with correct credentials
     * @return HomePage
     */
    public HomePage loginWithCorrectCreds() {
        enterEmail("a.beaverg@gmail.com");
        enterPassword("Test1234!");
        clickLoginButton();
        return new HomePage(driver);
    }

    /**
     * Method to full login actions with incorrect credentials
     * @return LoginPage
     */
    public LoginPage loginWithIncorrectCreds() {
        enterEmail("my.mail@mail.domen");
        enterPassword("Test1000!");
        clickLoginButton();
        return this;
    }

    /**
     * Method to check and assert error login message
     * @return LoginPage
     */
    public LoginPage assertThatLoginErrorMessageIsVisible() {
        Assert.assertTrue(driver.findElement(loginErrorMessage).isDisplayed(), "Error message not displayed");
        return this;
    }
}
