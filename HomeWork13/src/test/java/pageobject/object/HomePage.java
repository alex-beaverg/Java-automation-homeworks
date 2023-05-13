package pageobject.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobject.object.pageelement.FooterMenu;
import pageobject.object.pageelement.MainMenu;

/**
 * Class for object HomePage (Object model)
 */
public class HomePage extends PageBase {
    // Fields:
    private static final By successMessage = By.cssSelector(".notice.success");
    public MainMenu mainMenu;
    private static final By mainMenuLocator = By.id("site-menu");
    public FooterMenu footerMenu;
    private static final By footerMenuLocator = By.id("footer");
    // Driver:
    private final WebDriver driver;

    /**
     * Constructor for class HomePage
     * @param driver
     */
    public HomePage(WebDriver driver) {
        this.driver = driver;
        mainMenu = new MainMenu(driver, driver.findElement(mainMenuLocator));
        footerMenu = new FooterMenu(driver.findElement(footerMenuLocator));
    }

    /**
     * Method to check success login message
     * @return boolean
     */
    public boolean successMessageIsVisible() {
        return driver.findElement(successMessage).isDisplayed();
    }

    /**
     * Method to check open home page
     */
    public boolean hasOpened() {
        return super.hasOpened(driver,"Online Store | My Store");
    }
}
