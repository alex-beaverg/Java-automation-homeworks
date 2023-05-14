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
        Run all tests:
            mvn clean test -Dsurefire.suiteXmlFiles=src/test/resources/selenide-all-tests.xml
        Run login tests:
            mvn clean test -Dsurefire.suiteXmlFiles=src/test/resources/selenide-login-tests.xml
        Run after login tests:
            mvn clean test -Dsurefire.suiteXmlFiles=src/test/resources/selenide-after-login-tests.xml
        Run main menu items tests:
            mvn clean test -Dsurefire.suiteXmlFiles=src/test/resources/selenide-main-menu-items-tests.xml
        Run footer menu items tests:
            mvn clean test -Dsurefire.suiteXmlFiles=src/test/resources/selenide-footer-menu-items-tests.xml
Clean folder 'target' from command-line:
    mvn clean
*/

package pageobject;

import org.testng.annotations.Test;
import pageobject.selenidepageobject.*;

import static com.codeborne.selenide.Selenide.open;

/**
 * Class SelenideTest (Selenide PageObject model)
 */
public class SelenideTest {
    /**
     * Test method to successful customer login
     */
    @Test(groups = "login tests")
    public void successLoginTest() {
        LoginPage loginPage = open("https://litecart.stqa.ru/en/login", LoginPage.class);
        HomePage homePage = loginPage.attemptLogin("a.beaverg@gmail.com", "Test1234!");
        homePage.successMessageIsVisible();
    }

    /**
     * Test method to unsuccessful customer login
     */
    @Test(groups = "login tests")
    public void unSuccessLoginTest() {
        LoginPage loginPage = open("https://litecart.stqa.ru/en/login", LoginPage.class);
        loginPage.attemptLogin("my.mail@mail.domen", "Test1000!");
        loginPage.loginErrorMessageIsVisible();
    }

    /**
     * Test method to load home page
     */
    @Test(groups = "after login tests")
    public void homePageLoadedTest() {
        LoginPage loginPage = open("https://litecart.stqa.ru/en/login", LoginPage.class);
        HomePage homePage = loginPage.attemptLogin("a.beaverg@gmail.com", "Test1234!");
        homePage.hasOpened();
    }

    /**
     * Test method to load login page
     */
    @Test(groups = "after login tests")
    public void loginPageLoadedTest() {
        LoginPage loginPage = open("https://litecart.stqa.ru/en/login", LoginPage.class);
        loginPage.attemptLogin("my.mail@mail.domen", "Test1000!");
        loginPage.hasOpened();
    }

    /**
     * Test method to check main menu item 'Rubber Ducks'
     */
    @Test(groups = "main menu items tests")
    public void rubberDucksMainMenuItemTest() {
        HomePage homePage = open("https://litecart.stqa.ru/en/", HomePage.class);
        RubberDucksPage rubberDucksPage = (RubberDucksPage) homePage.mainMenu.clickToMainMenuItem("Rubber Ducks");
        rubberDucksPage.hasOpened();
    }

    /**
     * Test method to check main menu item 'Subcategory'
     */
    @Test(groups = "main menu items tests")
    public void subcategoryMainMenuItemTest() {
        HomePage homePage = open("https://litecart.stqa.ru/en/", HomePage.class);
        SubcategoryPage subcategoryPage = (SubcategoryPage) homePage.mainMenu.clickToMainMenuItem("Subcategory");
        subcategoryPage.hasOpened();
    }

    /**
     * Test method to check main menu item 'Home'
     */
    @Test(groups = "main menu items tests")
    public void homeMainMenuItemTest() {
        HomePage homePage = open("https://litecart.stqa.ru/en/", HomePage.class);
        RubberDucksPage rubberDucksPage = (RubberDucksPage) homePage.mainMenu.clickToMainMenuItem("Rubber Ducks");
        homePage = (HomePage) rubberDucksPage.mainMenu.clickToMainMenuItem("Home");
        homePage.hasOpened();
    }

    /**
     * Test method to check footer menu item 'Rubber Ducks'
     */
    @Test(groups = "footer menu items tests")
    public void rubberDucksFooterMenuItemTest() {
        HomePage homePage = open("https://litecart.stqa.ru/en/", HomePage.class);
        RubberDucksPage rubberDucksPage = (RubberDucksPage) homePage.footerMenu.clickFooterMenuItem("Rubber Ducks");
        rubberDucksPage.hasOpened();
    }

    /**
     * Test method to check footer menu item 'ACME Corp.'
     */
    @Test(groups = "footer menu items tests")
    public void acmeCorpFooterMenuItemTest() {
        HomePage homePage = open("https://litecart.stqa.ru/en/", HomePage.class);
        AcmeCorpPage acmeCorpPage = (AcmeCorpPage) homePage.footerMenu.clickFooterMenuItem("ACME Corp.");
        acmeCorpPage.hasOpened();
    }

    /**
     * Test method to check footer menu item 'Customer Service'
     */
    @Test(groups = "footer menu items tests")
    public void customerServiceFooterMenuItemTest() {
        HomePage homePage = open("https://litecart.stqa.ru/en/", HomePage.class);
        CustomerServicePage customerServicePage = (CustomerServicePage) homePage.footerMenu
                .clickFooterMenuItem("Customer Service");
        customerServicePage.hasOpened();
    }

    /**
     * Test method to check footer menu item 'Regional Settings'
     */
    @Test(groups = "footer menu items tests")
    public void regionalSettingsFooterMenuItemTest() {
        HomePage homePage = open("https://litecart.stqa.ru/en/", HomePage.class);
        RegionalSettingsPage regionalSettingsPage = (RegionalSettingsPage) homePage.footerMenu
                .clickFooterMenuItem("Regional Settings");
        regionalSettingsPage.hasOpened();
    }

    /**
     * Test method to check footer menu item 'Create Account'
     */
    @Test(groups = "footer menu items tests")
    public void createAccountFooterMenuItemTest() {
        HomePage homePage = open("https://litecart.stqa.ru/en/", HomePage.class);
        CreateAccountPage createAccountPage = (CreateAccountPage) homePage.footerMenu
                .clickFooterMenuItem("Create Account");
        createAccountPage.hasOpened();
    }

    /**
     * Test method to check footer menu item 'About Us'
     */
    @Test(groups = "footer menu items tests")
    public void aboutUsFooterMenuItemTest() {
        HomePage homePage = open("https://litecart.stqa.ru/en/", HomePage.class);
        AboutUsPage aboutUsPage = (AboutUsPage) homePage.footerMenu.clickFooterMenuItem("About Us");
        aboutUsPage.hasOpened();
    }

    /**
     * Test method to check footer menu item 'Delivery Information'
     */
    @Test(groups = "footer menu items tests")
    public void deliveryInformationFooterMenuItemTest() {
        HomePage homePage = open("https://litecart.stqa.ru/en/", HomePage.class);
        DeliveryInformationPage deliveryInformationPage = (DeliveryInformationPage) homePage.footerMenu
                .clickFooterMenuItem("Delivery Information");
        deliveryInformationPage.hasOpened();
    }

    /**
     * Test method to check footer menu item 'Privacy Policy'
     */
    @Test(groups = "footer menu items tests")
    public void privacyPolicyFooterMenuItemTest() {
        HomePage homePage = open("https://litecart.stqa.ru/en/", HomePage.class);
        PrivacyPolicyPage privacyPolicyPage = (PrivacyPolicyPage) homePage.footerMenu
                .clickFooterMenuItem("Privacy Policy");
        privacyPolicyPage.hasOpened();
    }

    /**
     * Test method to check footer menu item 'Terms & Conditions'
     */
    @Test(groups = "footer menu items tests")
    public void termsAndConditionsFooterMenuItemTest() {
        HomePage homePage = open("https://litecart.stqa.ru/en/", HomePage.class);
        TermsAndConditionsPage termsAndConditionsPage = (TermsAndConditionsPage) homePage.footerMenu
                .clickFooterMenuItem("Terms & Conditions");
        termsAndConditionsPage.hasOpened();
    }
}
