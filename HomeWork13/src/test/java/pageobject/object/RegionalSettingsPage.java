package pageobject.object;

import org.openqa.selenium.WebDriver;

/**
 * Class for object RegionalSettingsPage (Object model)
 */
public class RegionalSettingsPage extends PageBase {
    // Driver:
    private final WebDriver driver;

    /**
     * Constructor for class RegionalSettingsPage
     * @param driver
     */
    public RegionalSettingsPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Method to check open regional settings page
     */
    public boolean hasOpened() {
        return super.hasOpened(driver,"Regional Settings | My Store");
    }
}
