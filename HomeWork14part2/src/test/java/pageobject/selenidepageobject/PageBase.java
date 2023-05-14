package pageobject.selenidepageobject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;
import static pageobject.helpers.Locators.getLocator;

/**
 * Parent class PageBase
 */
public class PageBase {
    /**
     * Method to check open page
     */
    public SelenideElement hasOpened(String titleText) {
        return $(getLocator("title")).shouldHave(attribute("text", titleText));
    }
}
