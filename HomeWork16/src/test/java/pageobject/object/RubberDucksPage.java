package pageobject.object;

import org.openqa.selenium.WebDriver;
import pageobject.object.pageelement.MainMenu;

import static pageobject.helpers.Locators.getLocator;

/**
 * Class for object RubberDucksPage (Object model)
 */
public class RubberDucksPage extends PageBase {
    // Driver:
    private final WebDriver driver;
    // Fields:
    public MainMenu mainMenu;

    /**
     * Constructor for class RubberDucksPage
     * @param driver
     */
    public RubberDucksPage(WebDriver driver) {
        this.driver = driver;
        mainMenu = new MainMenu(driver, driver.findElement(getLocator("RubberDucksPage.mainMenuLocator")));
    }

    /**
     * Method to check open rubber ducks page
     */
    public boolean hasOpened() {
        return super.hasOpened(driver,"Rubber Ducks | My Store");
    }
}
