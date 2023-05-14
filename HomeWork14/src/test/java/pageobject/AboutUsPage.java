package pageobject;

import htmlelement.LeftMenuInfoSection;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

/**
 * Class for object AboutUsPage
 */
public class AboutUsPage extends PageBase {
    // Driver:
    private final WebDriver driver;
    // Fields:
    public LeftMenuInfoSection leftMenuInfoSection;

    /**
     * Constructor for class AboutUsPage
     * @param driver
     */
    public AboutUsPage(WebDriver driver) {
        this.driver = driver;
        HtmlElementLoader.populatePageObject(this, driver);
    }

    /**
     * Method to check open about us page
     */
    public boolean hasOpened() {
        return super.hasOpened(driver,"About Us | My Store");
    }
}
