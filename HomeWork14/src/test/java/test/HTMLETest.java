/*
Run from IDE:
    Shift + F10
    With Run configuration
    With right click to java-file (class, method)
    With right click to xml-file
Run from command-line:
    Run all tests:
        mvn clean test
    Run all tests with Chrome browser:
        mvn clean test -Dbrowser=chrome
    Run all tests with Edge browser:
        mvn clean test -Dbrowser=edge
    Run all tests with Firefox browser:
        mvn clean test -Dbrowser=firefox
    Run tests with xml suite:
        Run all tests with Chrome browser:
            mvn clean test -Dbrowser=chrome -Dsurefire.suiteXmlFiles=src/test/resources/htmlelement-tests.xml
Clean folder 'target' from command-line:
    mvn clean
*/

package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.*;

/**
 * Class HTMLETest
 */
public class HTMLETest extends TestBase {
    /**
     * Test Method to click 'About Us' menu item on Left menu for Information section for 'About Us' page
     */
    @Test(groups = "left menu tests")
    public void aboutUsLeftMenuItemTest() {
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        aboutUsPage.leftMenuInfoSection.clickAboutUsMenuItem();
        Assert.assertTrue(aboutUsPage.hasOpened(), "About Us page hasn't opened");
    }

    /**
     * Test Method to click 'Delivery Information' menu item on Left menu for Information section for 'About Us' page
     */
    @Test(groups = "left menu tests")
    public void deliveryInfoLeftMenuItemTest() {
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        aboutUsPage.leftMenuInfoSection.clickDeliveryInfoMenuItem();
        DeliveryInformationPage deliveryInformationPage = new DeliveryInformationPage(driver);
        Assert.assertTrue(deliveryInformationPage.hasOpened(), "Delivery Information page hasn't opened");
    }

    /**
     * Test Method to click 'Privacy Policy' menu item on Left menu for Information section for 'About Us' page
     */
    @Test(groups = "left menu tests")
    public void privacyPolicyLeftMenuItemTest() {
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        aboutUsPage.leftMenuInfoSection.clickPrivacyPolicyMenuItem();
        PrivacyPolicyPage privacyPolicyPage = new PrivacyPolicyPage(driver);
        Assert.assertTrue(privacyPolicyPage.hasOpened(), "Privacy Policy page hasn't opened");
    }

    /**
     * Test Method to click 'Terms & Conditions' menu item on Left menu for Information section for 'About Us' page
     */
    @Test(groups = "left menu tests")
    public void termsAndCondLeftMenuItemTest() {
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        aboutUsPage.leftMenuInfoSection.clickTermsAndCondMenuItem();
        TermsAndConditionsPage termsAndConditionsPage = new TermsAndConditionsPage(driver);
        Assert.assertTrue(termsAndConditionsPage.hasOpened(), "Privacy Policy page hasn't opened");
    }
}
