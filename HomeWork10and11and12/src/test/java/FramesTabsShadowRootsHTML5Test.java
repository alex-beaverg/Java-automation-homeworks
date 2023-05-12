import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

/**
 * Test class FramesTabsShadowRootsHTML5Test
 */
public class FramesTabsShadowRootsHTML5Test {

    /**
     * Test method to switch between nested frames
     */
    @Test
    public void switchBetweenNestedFramesTest() {
        WebDriver driver = new ChromeDriver();
        SoftAssert softAssert = new SoftAssert();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/nested_frames");

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        String leftFrameText = driver.findElement(By.tagName("body")).getText();
        softAssert.assertEquals(leftFrameText, "LEFT");

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-right");
        String rightFrameText = driver.findElement(By.tagName("body")).getText();
        softAssert.assertEquals(rightFrameText, "RIGHT");

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        String bottomFrameText = driver.findElement(By.tagName("body")).getText();
        softAssert.assertEquals(bottomFrameText, "BOTTOM");

        softAssert.assertAll();
        driver.quit();
    }

    /**
     * Test method to switch to iframe
     */
    @Test
    public void switchToIframeTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/iframe");

        driver.switchTo().frame(driver.findElement(By.cssSelector("[title='Rich Text Area']")));

        WebElement textArea = (new WebDriverWait(driver, Duration.ofSeconds(5)))
                .until(ExpectedConditions.presenceOfElementLocated(By.tagName("p")));

        String textAreaText = textArea.getText();
        Assert.assertEquals(textAreaText, "Your content goes here.");
        driver.quit();
    }

    /**
     * Test method to switch to new tab
     */
    @Test
    public void switchToNewTabTest() {
        WebDriver driver = new ChromeDriver();
        SoftAssert softAssert = new SoftAssert();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/windows");

        String initialTab = driver.getWindowHandle();
        WebElement newTabLink = driver.findElement(By.cssSelector(".example>a"));
        newTabLink.click();
        String newTab = driver.getWindowHandles().toArray()[1].toString();
        driver.switchTo().window(newTab);

        String newTabText = driver.findElement(By.cssSelector("h3")).getText();
        softAssert.assertEquals(newTabText, "New Window");

        driver.close();
        driver.switchTo().window(initialTab);
        String initialTabText = driver.findElement(By.cssSelector("h3")).getText();
        softAssert.assertEquals(initialTabText, "Opening a new window");

        softAssert.assertAll();
        driver.quit();
    }

    /**
     * Test method to switch to shadow root
     */
    @Test
    public void switchToShadowRootTest() {
        WebDriver driver = new ChromeDriver();
        SoftAssert softAssert = new SoftAssert();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/shadowdom");

        WebElement rootElementFirst = driver.findElement(By.cssSelector("#content>my-paragraph:nth-last-child(2)"));
        SearchContext shadowRootFirst = getShadowRoot(driver, rootElementFirst);
        String shadowRootFirstText = shadowRootFirst.findElement(By.cssSelector("p")).getText();
        softAssert.assertEquals(shadowRootFirstText, "Let's have some different text!");

        WebElement rootElementSecond = driver.findElement(By.cssSelector("#content>my-paragraph:last-child"));
        SearchContext shadowRootSecond = getShadowRoot(driver, rootElementSecond);
        String shadowRootSecondText = shadowRootSecond.findElement(By.cssSelector("p")).getText();
        softAssert.assertEquals(shadowRootSecondText, "Let's have some different text!\nIn a list!");

        softAssert.assertAll();
        driver.quit();
    }

    /**
     * Private utility method to get shadow root
     * @param driver
     * @param rootElement
     * @return shadowRoot
     */
    private SearchContext getShadowRoot(WebDriver driver, WebElement rootElement) {
        return (SearchContext) ((JavascriptExecutor) driver)
                .executeScript("return arguments[0].shadowRoot", rootElement);
    }

    /**
     * Pseudo test method for 'canvas' HTML5 tag
     */
    @Test
    public void canvasPseudoTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://canvas.apps.chrome/");

        WebElement rootElementFirst = driver.findElement(By.id("drawing-app"));
        SearchContext shadowRootFirst = getShadowRoot(driver, rootElementFirst);

        WebElement rootElementSecond = shadowRootFirst.findElement(By.cssSelector("welcome-dialog"));
        SearchContext shadowRootSecond = getShadowRoot(driver, rootElementSecond);

        WebElement startButton = (new WebDriverWait(driver, Duration.ofSeconds(5))).until(ExpectedConditions
                .visibilityOf(shadowRootSecond.findElement(By.cssSelector("ea-button#get-started"))));

        startButton.click();

        (new WebDriverWait(driver, Duration.ofSeconds(5)))
                .until(ExpectedConditions.numberOfWindowsToBe(2));

        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        driver.close();
        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());

        (new WebDriverWait(driver, Duration.ofSeconds(5))).until(ExpectedConditions
                .visibilityOf(getShadowRoot(driver, shadowRootFirst.findElement(By.cssSelector("drawing-canvas")))
                        .findElement(By.cssSelector(".ink-engine"))));

        Actions builder = new Actions(driver);
        builder.moveByOffset(200, 200).clickAndHold().moveByOffset(500, 0).release()
                .clickAndHold().moveByOffset(0, 350).release().clickAndHold()
                .moveByOffset(-500, 0).release().clickAndHold()
                .moveByOffset(0, -350).release().perform();

        Assert.assertTrue(true);
        driver.quit();
    }

    /**
     * Pseudo test method for 'video' HTML5 tag
     */
    @Test
    public void videoPseudoTest() {
        WebDriver driver = new ChromeDriver();
        SoftAssert softAssert = new SoftAssert();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/html5_video.asp");

        WebElement player = driver.findElement(By.id("video1"));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        double duration = (Double) js.executeScript("return arguments[0].duration", player);
        softAssert.assertEquals((int) duration, 10);

        String source = (String) js.executeScript("return arguments[0].currentSrc", player);
        softAssert.assertEquals(source, "https://www.w3schools.com/html/mov_bbb.mp4");

        softAssert.assertAll();
        driver.quit();
    }

    /**
     * Pseudo test method for 'Web Storage' HTML5 element
     */
    @Test
    public void webStoragePseudoTest() {
        WebDriver driver = new ChromeDriver();
        SoftAssert softAssert = new SoftAssert();
        driver.manage().window().maximize();
        driver.get("https://mdn.github.io/dom-examples/web-storage/");

        String newColor = "000000";
        String newFont = "'Ubuntu Mono'";
        String newImage = "images/crocodile.png";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("localStorage.bgcolor = '" + newColor + "'");
        js.executeScript("localStorage.font = `" + newFont + "`");
        js.executeScript("localStorage.image = '" + newImage + "'");
        js.executeScript("location.reload()");

        WebElement inputColor = driver.findElement(By.id("bgcolor"));
        String color = inputColor.getAttribute("value");
        WebElement inputFont = driver.findElement(By.id("font"));
        String font = inputFont.getAttribute("value");
        WebElement inputImage = driver.findElement(By.id("image"));
        String image = inputImage.getAttribute("value");

        softAssert.assertEquals(color, newColor);
        softAssert.assertEquals(font, newFont);
        softAssert.assertEquals(image, newImage);

        softAssert.assertAll();
        driver.quit();
    }
}
