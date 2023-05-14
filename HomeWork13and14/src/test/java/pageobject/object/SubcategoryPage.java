package pageobject.object;

import org.openqa.selenium.WebDriver;

/**
 * Class for object SubcategoryPage
 */
public class SubcategoryPage extends PageBase {
    // Driver:
    private final WebDriver driver;

    /**
     * Constructor for class SubcategoryPage
     * @param driver
     */
    public SubcategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Method to check open subcategory page
     */
    public boolean hasOpened() {
        return super.hasOpened(driver,"Subcategory | My Store");
    }
}
