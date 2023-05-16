/*
Run from IDE:
    Shift + F10
    With Run configuration
    With right click to java-file (class, method)
    With right click to xml-file
Run from command-line:
    Run all tests:
        mvn clean test
    Run tests with xml suite:
        Run all tests with Chrome browser:
            mvn clean test -Dbrowser=chrome -Dsurefire.suiteXmlFiles=src/test/resources/obj-mod-all-tests.xml
        Run login tests with Edge browser:
            mvn clean test -Dbrowser=edge -Dsurefire.suiteXmlFiles=src/test/resources/obj-mod-login-tests.xml
        Run after login tests with Firefox browser:
            mvn clean test -Dbrowser=firefox -Dsurefire.suiteXmlFiles=src/test/resources/obj-mod-after-login-tests.xml
        Run main menu items tests with Edge browser:
            mvn clean test -Dbrowser=edge -Dsurefire.suiteXmlFiles=src/test/resources/obj-mod-main-menu-items-tests.xml
        Run footer menu items tests with Edge browser:
            mvn clean test -Dbrowser=edge -Dsurefire.suiteXmlFiles=src/test/resources/obj-mod-footer-menu-items-tests.xml
Clean folder 'target' from command-line:
    mvn clean
*/

package pageobject;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.object.*;

/**
 * Test class POTest (Page Object model Test)
 */
public class POTest extends TestBase {
    /**
     * Test method to successful customer login
     */
    @Test(groups = "login tests")
    public void successfulLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.attemptLogin("a.beaverg@gmail.com", "Test1234!");
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.successMessageIsVisible(), "Login was unsuccessful");
    }

    /**
     * Test method to unsuccessful customer login
     */
    @Test(groups = "login tests")
    public void unsuccessfulLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.attemptLogin("my.mail@mail.domen", "Test1000!");
        Assert.assertTrue(loginPage.loginErrorMessageIsVisible(), "Logged in with incorrect creds");
    }

    /**
     * Test method to load home page
     */
    @Test(groups = "after login tests")
    public void homePageLoadedTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.attemptLogin("a.beaverg@gmail.com", "Test1234!");
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.hasOpened(), "Home page hasn't opened");
    }

    /**
     * Test method to load login page
     */
    @Test(groups = "after login tests")
    public void loginPageLoadedTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.attemptLogin("my.mail@mail.domen", "Test1000!");
        Assert.assertTrue(loginPage.hasOpened(), "Login page hasn't opened");
    }

    /**
     * Test method to check main menu item 'Rubber Ducks'
     */
    @Test(groups = "main menu items tests")
    public void rubberDucksMainMenuItemTest() {
        HomePage homePage = new HomePage(driver);
        homePage.mainMenu.clickToMainMenuItem("Rubber Ducks");
        RubberDucksPage rubberDucksPage = new RubberDucksPage(driver);
        Assert.assertTrue(rubberDucksPage.hasOpened(), "Rubber Ducks page hasn't opened");
    }

    /**
     * Test method to check main menu item 'Subcategory'
     */
    @Test(groups = "main menu items tests")
    public void subcategoryMainMenuItemTest() {
        HomePage homePage = new HomePage(driver);
        homePage.mainMenu.clickToMainMenuItem("Subcategory");
        SubcategoryPage subcategoryPage = new SubcategoryPage(driver);
        Assert.assertTrue(subcategoryPage.hasOpened(), "Subcategory page hasn't opened");
    }

    /**
     * Test method to check main menu item 'Home'
     */
    @Test(groups = "main menu items tests")
    public void homeMainMenuItemTest() {
        HomePage homePage = new HomePage(driver);
        homePage.mainMenu.clickToMainMenuItem("Rubber Ducks");
        RubberDucksPage rubberDucksPage = new RubberDucksPage(driver);
        rubberDucksPage.mainMenu.clickToMainMenuItem("Home");
        Assert.assertTrue(homePage.hasOpened(), "Home page hasn't opened");
    }

    /**
     * Test method to check footer menu item 'Rubber Ducks'
     */
    @Test(groups = "footer menu items tests")
    public void rubberDucksFooterMenuItemTest() {
        HomePage homePage = new HomePage(driver);
        homePage.footerMenu.getFooterMenuItem("Rubber Ducks").click();
        RubberDucksPage rubberDucksPage = new RubberDucksPage(driver);
        Assert.assertTrue(rubberDucksPage.hasOpened(), "Rubber Ducks page hasn't opened");
    }

    /**
     * Test method to check footer menu item 'ACME Corp.'
     */
    @Test(groups = "footer menu items tests")
    public void acmeCorpFooterMenuItemTest() {
        HomePage homePage = new HomePage(driver);
        homePage.footerMenu.getFooterMenuItem("ACME Corp").click();
        AcmeCorpPage acmeCorpPage = new AcmeCorpPage(driver);
        Assert.assertTrue(acmeCorpPage.hasOpened(), "ACME Corp. page hasn't opened");
    }

    /**
     * Test method to check footer menu item 'Customer Service'
     */
    @Test(groups = "footer menu items tests")
    public void customerServiceFooterMenuItemTest() {
        HomePage homePage = new HomePage(driver);
        homePage.footerMenu.getFooterMenuItem("Customer Serv").click();
        CustomerServicePage customerServicePage = new CustomerServicePage(driver);
        Assert.assertTrue(customerServicePage.hasOpened(), "Customer Service page hasn't opened");
    }

    /**
     * Test method to check footer menu item 'Regional Settings'
     */
    @Test(groups = "footer menu items tests")
    public void regionalSettingsFooterMenuItemTest() {
        HomePage homePage = new HomePage(driver);
        homePage.footerMenu.getFooterMenuItem("Regional Sett").click();
        RegionalSettingsPage regionalSettingsPage = new RegionalSettingsPage(driver);
        Assert.assertTrue(regionalSettingsPage.hasOpened(), "Regional Settings page hasn't opened");
    }

    /**
     * Test method to check footer menu item 'Create Account'
     */
    @Test(groups = "footer menu items tests")
    public void createAccountFooterMenuItemTest() {
        HomePage homePage = new HomePage(driver);
        homePage.footerMenu.getFooterMenuItem("Create Account").click();
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        Assert.assertTrue(createAccountPage.hasOpened(), "Create Account page hasn't opened");
    }

    /**
     * Test method to check footer menu item 'Login'
     */
    @Test(groups = "footer menu items tests")
    public void loginFooterMenuItemTest() {
        HomePage homePage = new HomePage(driver);
        homePage.footerMenu.getFooterMenuItem("Login").click();
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.hasOpened(), "Login page hasn't opened");
    }

    /**
     * Test method to check footer menu item 'About Us'
     */
    @Test(groups = "footer menu items tests")
    public void aboutUsFooterMenuItemTest() {
        HomePage homePage = new HomePage(driver);
        homePage.footerMenu.getFooterMenuItem("About Us").click();
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        Assert.assertTrue(aboutUsPage.hasOpened(), "About Us page hasn't opened");
    }

    /**
     * Test method to check footer menu item 'Delivery Information'
     */
    @Test(groups = "footer menu items tests")
    public void deliveryInformationFooterMenuItemTest() {
        HomePage homePage = new HomePage(driver);
        homePage.footerMenu.getFooterMenuItem("Delivery Info").click();
        DeliveryInformationPage deliveryInformationPage = new DeliveryInformationPage(driver);
        Assert.assertTrue(deliveryInformationPage.hasOpened(), "Delivery Information page hasn't opened");
    }

    /**
     * Test method to check footer menu item 'Privacy Policy'
     */
    @Test(groups = "footer menu items tests")
    public void privacyPolicyFooterMenuItemTest() {
        HomePage homePage = new HomePage(driver);
        homePage.footerMenu.getFooterMenuItem("Privacy Policy").click();
        PrivacyPolicyPage privacyPolicyPage = new PrivacyPolicyPage(driver);
        Assert.assertTrue(privacyPolicyPage.hasOpened(), "Privacy Policy page hasn't opened");
    }

    /**
     * Test method to check footer menu item 'Terms & Conditions'
     */
    @Test(groups = "footer menu items tests")
    public void termsAndConditionsFooterMenuItemTest() {
        HomePage homePage = new HomePage(driver);
        homePage.footerMenu.getFooterMenuItem("Terms & Cond").click();
        TermsAndConditionsPage termsAndConditionsPage = new TermsAndConditionsPage(driver);
        Assert.assertTrue(termsAndConditionsPage.hasOpened(), "Terms & Conditions page hasn't opened");
    }
}
