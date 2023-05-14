package pageobject.object;

import org.openqa.selenium.WebDriver;
import pageobject.object.pageelement.FooterMenu;
import pageobject.object.pageelement.MainMenu;

import static pageobject.helpers.Locators.getLocator;

/**
 * Class for object HomePage (Object model)
 */
public class HomePage extends PageBase {
    // Driver:
    private final WebDriver driver;
    // Fields:
    public MainMenu mainMenu;
    public FooterMenu footerMenu;

    /**
     * Constructor for class HomePage
     * @param driver
     */
    public HomePage(WebDriver driver) {
        this.driver = driver;
        mainMenu = new MainMenu(driver, driver.findElement(getLocator("HomePage.mainMenuLocator")));
        footerMenu = new FooterMenu(driver.findElement(getLocator("HomePage.footerMenuLocator")));
    }

    /**
     * Method to check success login message
     * @return boolean
     */
    public boolean successMessageIsVisible() {
        return driver.findElement(getLocator("HomePage.successMessage")).isDisplayed();
    }

    /**
     * Method to check open home page
     */
    public boolean hasOpened() {
        return super.hasOpened(driver,"Online Store | My Store");
    }
}
