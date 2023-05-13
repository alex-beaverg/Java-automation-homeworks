package pageobject.object.pageelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Class MainMenu (page element)
 */
public class MainMenu {
    // Fields:
    private final WebElement mainMenuItems;
    // Driver:
    private final WebDriver driver;

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
            case "Home" -> mainMenuItems.findElement(By.cssSelector(".general-0>a")).click();
            case "Rubber Ducks" -> mainMenuItems.findElement(By.cssSelector(".category-1>a:first-child")).click();
            case "Subcategory" -> {
                Actions builder = new Actions(driver);
                builder.moveToElement(mainMenuItems.findElement(By.cssSelector(".category-1>a:first-child")))
                        .moveByOffset(0,45).click().perform();
            }
        }
    }
}
