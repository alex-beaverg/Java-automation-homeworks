package pageobject.object.pageelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static pageobject.helpers.Locators.getLocator;

/**
 * Class MainMenu (page element)
 */
public class MainMenu {
    // Driver:
    private final WebDriver driver;
    // WebElements:
    private final WebElement mainMenuItems;

    /**
     * Constructor for class MainMenu
     * @param mainMenuItems
     */
    public MainMenu(WebDriver driver, WebElement mainMenuItems) {
        this.driver = driver;
        this.mainMenuItems = mainMenuItems;
    }

    /**
     * Method to click main menu item
     * @param mainMenuItem
     */
    public void clickToMainMenuItem(String mainMenuItem) {
        switch (mainMenuItem) {
            case "Home" -> mainMenuItems.findElement(getLocator("MainMenu.home")).click();
            case "Rubber Ducks" -> mainMenuItems.findElement(getLocator("MainMenu.rubberDucks")).click();
            case "Subcategory" -> {
                Actions builder = new Actions(driver);
                builder.moveToElement(mainMenuItems.findElement(getLocator("MainMenu.subcategory")))
                        .moveByOffset(0,45).click().perform();
            }
            default -> throw new RuntimeException("No such main menu item");
        }
    }
}
