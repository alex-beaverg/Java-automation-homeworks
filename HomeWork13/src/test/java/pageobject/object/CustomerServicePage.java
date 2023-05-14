package pageobject.object;

import org.openqa.selenium.WebDriver;

/**
 * Class for object CustomerServicePage (Object model)
 */
public class CustomerServicePage extends PageBase {
    // Driver:
    private final WebDriver driver;

    /**
     * Constructor for class CustomerServicePage
     * @param driver
     */
    public CustomerServicePage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Method to check open customer service page
     */
    public boolean hasOpened() {
        return super.hasOpened(driver,"Customer Service | My Store");
    }
}
