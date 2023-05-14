package pageobject;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.staticpageobject.HomePage;
import pageobject.staticpageobject.LoginPage;

/**
 * Test class SPOTest (Static Page Object Test)
 */
public class SPOTest extends TestBase {
    /**
     * Test static method to successful customer login on the 'Rubber Ducks Store'
     */
    @Test
    public static void successfulLoginTest() {
        LoginPage.attemptLogin(driver, "a.beaverg@gmail.com", "Test1234!");
        Assert.assertTrue(HomePage.successMessageIsVisible(driver), "Login was unsuccessful");
    }

    /**
     * Test static method to unsuccessful customer login on the 'Rubber Ducks Store'
     */
    @Test
    public static void unsuccessfulLoginTest() {
        LoginPage.attemptLogin(driver, "my.mail@mail.domen", "Test1000!");
        Assert.assertTrue(LoginPage.loginErrorMessageIsVisible(driver), "Logged in with incorrect creds");
    }
}
