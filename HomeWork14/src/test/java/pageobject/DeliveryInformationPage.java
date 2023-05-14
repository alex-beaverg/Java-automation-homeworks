package pageobject;

import org.openqa.selenium.WebDriver;

/**
 * Class for object DeliveryInformationPage
 */
public class DeliveryInformationPage extends PageBase {
    // Driver:
    private final WebDriver driver;

    /**
     * Constructor for class DeliveryInformationPage
     * @param driver
     */
    public DeliveryInformationPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Method to check open delivery information page
     */
    public boolean hasOpened() {
        return super.hasOpened(driver,"Delivery Information | My Store");
    }
}
