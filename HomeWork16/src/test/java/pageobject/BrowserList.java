package pageobject;

/**
 * Enum class Browser
 */
public enum BrowserList {
    CHROME_BROWSER("chrome"),
    FIREFOX_BROWSER("firefox");

    final String browserName;
    BrowserList(String browserName) {
        this.browserName = browserName;
    }

    public String getBrowserName() {
        return browserName;
    }

    public static BrowserList getEnumByLabel(String label) {
        for (BrowserList browser : values()) {
            if (browser.getBrowserName().equals(label)) {
                return browser;
            }
        }
        return null;
    }
}
