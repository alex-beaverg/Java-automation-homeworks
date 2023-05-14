package pageobject.selenidepageobject;

import com.codeborne.selenide.SelenideElement;
import pageobject.selenidepageobject.pageelement.FooterMenu;

import static com.codeborne.selenide.Selenide.$;
import static pageobject.helpers.Locators.getLocator;

/**
 * Class for object CustomerServicePage
 */
public class CustomerServicePage extends PageBase {
    // Fields:
    public FooterMenu footerMenu;

    /**
     * Constructor for class CustomerServicePage
     */
    public CustomerServicePage() {
        footerMenu = new FooterMenu($(getLocator("HomePage.footerMenuLocator")));
    }

    /**
     * Method to check open customer service page
     */
    public SelenideElement hasOpened() {
        return super.hasOpened("Customer Service | My Store");
    }
}
