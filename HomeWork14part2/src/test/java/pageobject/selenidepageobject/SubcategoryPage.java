package pageobject.selenidepageobject;

import com.codeborne.selenide.SelenideElement;
import pageobject.selenidepageobject.pageelement.FooterMenu;

import static com.codeborne.selenide.Selenide.$;
import static pageobject.helpers.Locators.getLocator;

/**
 * Class for object SubcategoryPage
 */
public class SubcategoryPage extends PageBase {
    // Fields:
    public FooterMenu footerMenu;

    /**
     * Constructor for class SubcategoryPage
     */
    public SubcategoryPage() {
        footerMenu = new FooterMenu($(getLocator("HomePage.footerMenuLocator")));
    }

    /**
     * Method to check open subcategory page
     */
    public SelenideElement hasOpened() {
        return super.hasOpened("Subcategory | My Store");
    }
}
