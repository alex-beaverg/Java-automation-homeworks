package pageobject.selenidepageobject;

import com.codeborne.selenide.SelenideElement;
import pageobject.selenidepageobject.pageelement.FooterMenu;

import static com.codeborne.selenide.Selenide.$;
import static pageobject.helpers.Locators.getLocator;

/**
 * Class for object RegionalSettingsPage
 */
public class RegionalSettingsPage extends PageBase {
    // Fields:
    public FooterMenu footerMenu;

    /**
     * Constructor for class RegionalSettingsPage
     */
    public RegionalSettingsPage() {
        footerMenu = new FooterMenu($(getLocator("HomePage.footerMenuLocator")));
    }

    /**
     * Method to check open regional settings page
     */
    public SelenideElement hasOpened() {
        return super.hasOpened("Regional Settings | My Store");
    }
}
