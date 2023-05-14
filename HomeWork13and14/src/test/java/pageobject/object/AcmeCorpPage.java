package pageobject.object;

import org.openqa.selenium.WebDriver;

/**
 * Class for object AcmeCorpPage (Object model)
 */
public class AcmeCorpPage extends PageBase {
    // Driver:
    private final WebDriver driver;

    /**
     * Constructor for class AcmeCorpPage
     * @param driver
     */
    public AcmeCorpPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Method to check open ACME corp. page
     */
    public boolean hasOpened() {
        return super.hasOpened(driver,"ACME Corp. | My Store");
    }
}
