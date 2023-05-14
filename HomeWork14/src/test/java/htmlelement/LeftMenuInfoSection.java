package htmlelement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

/**
 * Class LeftMenuInfoSection (html element)
 */
@Name("Left menu for Information section")
@FindBy(id = "box-information-links")
public class LeftMenuInfoSection extends HtmlElement {
    // HTML elements:
    @Name("'About Us' menu item")
    @FindBy(css = ".content li:nth-child(1)>a")
    WebElement aboutUsMenuItem;

    @Name("'Delivery Information' menu item")
    @FindBy(css = ".content li:nth-child(2)>a")
    WebElement deliveryInfoMenuItem;

    @Name("'Privacy Policy' menu item")
    @FindBy(css = ".content li:nth-child(3)>a")
    WebElement privacyPolicyMenuItem;

    @Name("'Terms & Conditions' menu item")
    @FindBy(css = ".content li:nth-child(4)>a")
    WebElement termsAndCondMenuItem;

    /**
     * Method to click 'About Us' menu item
     */
    public void clickAboutUsMenuItem() {
        aboutUsMenuItem.click();
    }

    /**
     * Method to click 'Delivery Information' menu item
     */
    public void clickDeliveryInfoMenuItem() {
        deliveryInfoMenuItem.click();
    }

    /**
     * Method to click 'Privacy Policy' menu item
     */
    public void clickPrivacyPolicyMenuItem() {
        privacyPolicyMenuItem.click();
    }

    /**
     * Method to click 'Terms & Conditions' menu item
     */
    public void clickTermsAndCondMenuItem() {
        termsAndCondMenuItem.click();
    }
}
