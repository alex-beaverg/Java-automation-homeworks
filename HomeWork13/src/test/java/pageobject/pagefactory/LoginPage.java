package pageobject.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Class for object LoginPage (Page Factory model)
 */
public class LoginPage {
    // Fields:
    @FindBy(name = "email")
    private WebElement emailInput;
    @FindBy(name = "password")
    private WebElement passwordInput;
    @FindBy(name = "login")
    private WebElement loginButton;
    @FindBy(css = ".notice.errors")
    private WebElement loginErrorMessage;

    /**
     * Method to enter email into email input field
     * @param email
     */
    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    /**
     * Method to enter password into password input field
     * @param password
     */
    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    /**
     * Method to click login button
     */
    public void clickLoginButton() {
        loginButton.click();
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
        return loginErrorMessage.isDisplayed();
    }
}
