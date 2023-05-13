package pageobject;

/**
 * Enum class Browser
 */
public enum Browser {
    CHROME("chrome"),
    FIREFOX("firefox"),
    EDGE("edge");

    final String browserName;
    Browser(String browserName) {
        this.browserName = browserName;
    }

    String getBrowserName() {
        return browserName;
    }

    static Browser getEnumByLabel(String label) {
        for (Browser browser : values()) {
            if (browser.getBrowserName().equals(label)) {
                return browser;
            }
        }
        return null;
    }
}
