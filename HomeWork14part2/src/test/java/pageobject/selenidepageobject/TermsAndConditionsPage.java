package pageobject.selenidepageobject;

import com.codeborne.selenide.SelenideElement;
import pageobject.selenidepageobject.pageelement.FooterMenu;

import static com.codeborne.selenide.Selenide.$;
import static pageobject.helpers.Locators.getLocator;

/**
 * Class for object TermsAndConditionsPage
 */
public class TermsAndConditionsPage extends PageBase {
    // Fields:
    public FooterMenu footerMenu;

    /**
     * Constructor for class TermsAndConditionsPage
     */
    public TermsAndConditionsPage() {
        footerMenu = new FooterMenu($(getLocator("HomePage.footerMenuLocator")));
    }

    /**
     * Method to check open terms and conditions page
     */
    public SelenideElement hasOpened() {
        return super.hasOpened("Terms & Conditions | My Store");
    }
}
