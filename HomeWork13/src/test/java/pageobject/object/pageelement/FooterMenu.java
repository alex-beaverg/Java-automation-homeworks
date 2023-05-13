package pageobject.object.pageelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Class FooterMenu (page element)
 */
public class FooterMenu {
    // Fields:
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
            case "Rubber Ducks" -> { return footerMenuItems.findElement(By.cssSelector(".categories a")); }
            case "ACME Corp." -> { return footerMenuItems.findElement(By.cssSelector(".manufacturers a")); }
            case "Customer Service" -> {
                return footerMenuItems.findElement(By.cssSelector(".account ul li:nth-child(1)>a"));
            }
            case "Regional Settings" -> {
                return footerMenuItems.findElement(By.cssSelector(".account ul li:nth-child(2)>a"));
            }
            case "Create Account" -> {
                return footerMenuItems.findElement(By.cssSelector(".account ul li:nth-child(3)>a"));
            }
            case "Login" -> {
                return footerMenuItems.findElement(By.cssSelector(".account ul li:nth-child(4)>a"));
            }
            case "About Us" -> {
                return footerMenuItems.findElement(By.cssSelector(".information ul li:nth-child(1)>a"));
            }
            case "Delivery Information" -> {
                return footerMenuItems.findElement(By.cssSelector(".information ul li:nth-child(2)>a"));
            }
            case "Privacy Policy" -> {
                return footerMenuItems.findElement(By.cssSelector(".information ul li:nth-child(3)>a"));
            }
            case "Terms & Conditions" -> {
                return footerMenuItems.findElement(By.cssSelector(".information ul li:nth-child(4)>a"));
            }
        }
        return null;
    }
}
