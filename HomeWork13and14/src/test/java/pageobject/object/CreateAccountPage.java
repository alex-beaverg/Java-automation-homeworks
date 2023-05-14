package pageobject.object;

import org.openqa.selenium.WebDriver;

/**
 * Class for object CreateAccountPage (Object model)
 */
public class CreateAccountPage extends PageBase {
    // Driver:
    private final WebDriver driver;

    /**
     * Constructor for class CreateAccountPage
     * @param driver
     */
    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Method to check open create account page
     */
    public boolean hasOpened() {
        return super.hasOpened(driver,"Create Account | My Store");
    }
}
