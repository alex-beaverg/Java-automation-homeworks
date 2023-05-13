package pageobject;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.pagefactory.HomePage;
import pageobject.pagefactory.LoginPage;

/**
 * Test class PFTest (Page Factory model Test)
 */
public class PFTest extends TestBase {
    /**
     * Test method to successful customer login on the 'Rubber Ducks Store'
     */
    @Test
    public void successfulLoginTest() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        loginPage.attemptLogin("a.beaverg@gmail.com", "Test1234!");
        Assert.assertTrue(homePage.successMessageIsVisible(), "Login was unsuccessful");
    }

    /**
     * Test method to unsuccessful customer login on the 'Rubber Ducks Store'
     */
    @Test
    public void unsuccessfulLoginTest() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        loginPage.attemptLogin("my.mail@mail.domen", "Test1000!");
        Assert.assertTrue(loginPage.loginErrorMessageIsVisible(), "Logged in with incorrect creds");
    }
}
