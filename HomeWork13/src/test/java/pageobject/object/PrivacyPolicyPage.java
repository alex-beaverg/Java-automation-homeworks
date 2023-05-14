package pageobject.object;

import org.openqa.selenium.WebDriver;

/**
 * Class for object PrivacyPolicyPage (Object model)
 */
public class PrivacyPolicyPage extends PageBase {
    // Driver:
    private final WebDriver driver;

    /**
     * Constructor for class PrivacyPolicyPage
     * @param driver
     */
    public PrivacyPolicyPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Method to check open privacy policy page
     */
    public boolean hasOpened() {
        return super.hasOpened(driver,"Privacy Policy | My Store");
    }
}
