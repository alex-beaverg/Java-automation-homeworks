package pageobject.selenidepageobject;

import com.codeborne.selenide.SelenideElement;
import pageobject.selenidepageobject.pageelement.FooterMenu;

import static com.codeborne.selenide.Selenide.$;
import static pageobject.helpers.Locators.getLocator;

/**
 * Class for object AcmeCorpPage
 */
public class AcmeCorpPage extends PageBase {
    // Fields:
    public FooterMenu footerMenu;

    /**
     * Constructor for class AcmeCorpPage
     */
    public AcmeCorpPage() {
        footerMenu = new FooterMenu($(getLocator("HomePage.footerMenuLocator")));
    }

    /**
     * Method to check open ACME corp. page
     */
    public SelenideElement hasOpened() {
        return super.hasOpened("ACME Corp. | My Store");
    }
}
