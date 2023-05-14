package pageobject;

import org.openqa.selenium.WebDriver;

/**
 * Class for object TermsAndConditionsPage
 */
public class TermsAndConditionsPage extends PageBase {
    // Driver:
    private final WebDriver driver;

    /**
     * Constructor for class TermsAndConditionsPage
     * @param driver
     */
    public TermsAndConditionsPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Method to check open terms and conditions page
     */
    public boolean hasOpened() {
        return super.hasOpened(driver,"Terms & Conditions | My Store");
    }
}
