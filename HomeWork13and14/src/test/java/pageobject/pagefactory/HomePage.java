package pageobject.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Class for object HomePage (PageFactory model)
 */
public class HomePage {
    // Fields:
    @FindBy(css = ".notice.success")
    private WebElement successMessage;

    /**
     * Method to check success login message
     * @return boolean
     */
    public boolean successMessageIsVisible() {
        return successMessage.isDisplayed();
    }
}
