package pageobject;

import org.testng.annotations.Test;
import pageobject.fluentinterface.LoginPage;

/**
 * Test class FITest (Fluent Interface model Test)
 */
public class FITest extends TestBase {
    /**
     * Test method to successful customer login on the 'Rubber Ducks Store'
     */
    @Test
    public void successfulLoginTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage
                .loginWithCorrectCreds()
                .assertThatSuccessMessageIsVisible();
    }

    /**
     * Test method to unsuccessful customer login on the 'Rubber Ducks Store'
     */
    @Test
    public void unsuccessfulLoginTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage
                .loginWithIncorrectCreds()
                .assertThatLoginErrorMessageIsVisible();
    }
}
