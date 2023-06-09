package pageobject.selenidepageobject;

import com.codeborne.selenide.SelenideElement;
import pageobject.selenidepageobject.pageelement.FooterMenu;

import static com.codeborne.selenide.Selenide.$;
import static pageobject.helpers.Locators.getLocator;

/**
 * Class for object AboutUsPage
 */
public class AboutUsPage extends PageBase {
    // Fields:
    public FooterMenu footerMenu;

    /**
     * Constructor for class AboutUsPage
     */
    public AboutUsPage() {
        footerMenu = new FooterMenu($(getLocator("HomePage.footerMenuLocator")));
    }

    /**
     * Method to check open about us page
     */
    public SelenideElement hasOpened() {
        return super.hasOpened("About Us | My Store");
    }
}
