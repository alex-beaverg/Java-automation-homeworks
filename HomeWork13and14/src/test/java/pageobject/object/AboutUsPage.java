package pageobject.object;

import org.openqa.selenium.WebDriver;

/**
 * Class for object AboutUsPage (Object model)
 */
public class AboutUsPage extends PageBase {
    // Driver:
    private final WebDriver driver;

    /**
     * Constructor for class AboutUsPage
     * @param driver
     */
    public AboutUsPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Method to check open about us page
     */
    public boolean hasOpened() {
        return super.hasOpened(driver,"About Us | My Store");
    }
}
