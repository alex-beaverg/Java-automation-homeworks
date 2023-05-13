package pageobject.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobject.object.pageelement.MainMenu;

/**
 * Class for object RubberDucksPage (Object model)
 */
public class RubberDucksPage extends PageBase {
    // Fields:
    public MainMenu mainMenu;
    private static final By mainMenuLocator = By.id("site-menu");
    // Driver:
    private final WebDriver driver;

    /**
     * Constructor for class RubberDucksPage
     * @param driver
     */
    public RubberDucksPage(WebDriver driver) {
        this.driver = driver;
        mainMenu = new MainMenu(driver, driver.findElement(mainMenuLocator));
    }

    /**
     * Method to check open rubber ducks page
     */
    public boolean hasOpened() {
        return super.hasOpened(driver,"Rubber Ducks | My Store");
    }
}
