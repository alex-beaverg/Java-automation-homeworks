package pageobject.selenidepageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pageobject.selenidepageobject.pageelement.FooterMenu;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;
import static pageobject.helpers.Locators.getLocator;

/**
 * Class for object LoginPage
 */
public class LoginPage extends PageBase {
    // Fields:
    public FooterMenu footerMenu;

    /**
     * Constructor for class LoginPage
     */
    public LoginPage() {
        footerMenu = new FooterMenu($(getLocator("HomePage.footerMenuLocator")));
    }

    /**
     * Method to enter email into email input field
     * @param email
     */
    public void enterEmail(String email) {
        $(getLocator("LoginPage.emailInput")).sendKeys(email);
    }

    /**
     * Method to enter password into password input field
     * @param password
     */
    public void enterPassword(String password) {
        $(getLocator("LoginPage.passwordInput")).sendKeys(password);
    }

    /**
     * Method to click login button
     */
    public void clickLoginButton() {
        $(getLocator("LoginPage.loginButton")).click();
    }

    /**
     * Method to full login actions
     * @param email
     * @param password
     */
    public HomePage attemptLogin(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
        return page(HomePage.class);
    }

    /**
     * Method to check error login message
     */
    public void loginErrorMessageIsVisible() {
        $(getLocator("LoginPage.loginErrorMessage")).shouldBe(Condition.visible)
                .shouldHave(text("Wrong password or the account is disabled, or does not exist"));
    }

    /**
     * Method to check open login page
     */
    public SelenideElement hasOpened() {
        return super.hasOpened("Login | My Store");
    }
}
