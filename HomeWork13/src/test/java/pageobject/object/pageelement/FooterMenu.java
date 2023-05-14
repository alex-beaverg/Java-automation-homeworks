package pageobject.object.pageelement;

import org.openqa.selenium.WebElement;

import static pageobject.helpers.Locators.getLocator;

/**
 * Class FooterMenu (page element)
 */
public class FooterMenu {
    // WebElements:
    private final WebElement footerMenuItems;

    /**
     * Constructor for class FooterMenuMenu
     * @param footerMenuItems
     */
    public FooterMenu(WebElement footerMenuItems) {
        this.footerMenuItems = footerMenuItems;
    }

    /**
     * Method to get footer menu item
     * @param footerMenuItem
     */
    public WebElement getFooterMenuItem(String footerMenuItem) {
        switch (footerMenuItem) {
            case "Rubber Ducks" -> { return footerMenuItems.findElement(getLocator("FooterMenu.rubDucks")); }
            case "ACME Corp" -> { return footerMenuItems.findElement(getLocator("FooterMenu.acmeCorp")); }
            case "Customer Serv" -> { return footerMenuItems.findElement(getLocator("FooterMenu.customerServ")); }
            case "Regional Sett" -> { return footerMenuItems.findElement(getLocator("FooterMenu.regSett")); }
            case "Create Account" -> { return footerMenuItems.findElement(getLocator("FooterMenu.createAcc")); }
            case "Login" -> { return footerMenuItems.findElement(getLocator("FooterMenu.login")); }
            case "About Us" -> { return footerMenuItems.findElement(getLocator("FooterMenu.aboutUs")); }
            case "Delivery Info" -> { return footerMenuItems.findElement(getLocator("FooterMenu.deliveryInfo")); }
            case "Privacy Policy" -> { return footerMenuItems.findElement(getLocator("FooterMenu.prPolicy")); }
            case "Terms & Cond" -> { return footerMenuItems.findElement(getLocator("FooterMenu.termsAndCond")); }
            default -> throw new RuntimeException("No such footer menu item");
        }
    }
}
