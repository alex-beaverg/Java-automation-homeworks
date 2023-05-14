package pageelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Class PageWithTable
 */
public class PageWithTable {
    // Fields:
    public Table table1;
    public Table table2;
    // Locators:
    private By table1Locator = By.id("table1");
    private By table2Locator = By.id("table2");
    // Driver:
    private WebDriver driver;

    /**
     * Constructor for class PageWithTable
     * @param driver
     */
    public PageWithTable(WebDriver driver) {
        this.driver = driver;
        table1 = new Table(driver.findElement(table1Locator));
        table2 = new Table(driver.findElement(table2Locator));
    }
}
