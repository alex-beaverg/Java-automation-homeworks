import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Test class JSAlertsTest
 */
public class JSAlertsTest {

    /**
     * Test method for HomeWork 10
     */
    @Test
    public void webDriverTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("All links on the webpage:");
        for (WebElement link : allLinks) {
            System.out.println(link.getAttribute("href"));
        }

        allLinks.get(10).click();

        WebElement checkTextAfterClick = driver.findElement(By.cssSelector(".example>h3"));
        Assert.assertEquals(checkTextAfterClick.getText(), "Drag and Drop");
        driver.quit();
    }

    /**
     * Test method to open JS Alert page
     */
    @Test
    public void openJSAlertPage() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement checkTextAfterOpenPage = driver.findElement(By.cssSelector(".example>h3"));
        Assert.assertEquals(checkTextAfterOpenPage.getText(), "JavaScript Alerts");
        driver.quit();
    }

    /**
     * Test method to click button JS Alert
     */
    @Test
    public void clickButtonJSAlert() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement alertButton = driver.findElement(By.cssSelector("[onclick='jsAlert()']"));
        alertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement checkTextAfterClick = driver.findElement(By.id("result"));
        Assert.assertEquals(checkTextAfterClick.getText(),"You successfully clicked an alert");
        driver.quit();
    }

    /**
     * Test method to click button JS Confirm and choose button 'OK'
     */
    @Test
    public void clickButtonJSConfirmAndClickOK() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement alertButton = driver.findElement(By.cssSelector("[onclick='jsConfirm()']"));
        alertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement checkTextAfterClick = driver.findElement(By.id("result"));
        Assert.assertEquals(checkTextAfterClick.getText(),"You clicked: Ok");
        driver.quit();
    }

    /**
     * Test method to click button JS Confirm and choose button 'Cancel'
     */
    @Test
    public void clickButtonJSConfirmAndClickCancel() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement alertButton = driver.findElement(By.cssSelector("[onclick='jsConfirm()']"));
        alertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();

        WebElement checkTextAfterClick = driver.findElement(By.id("result"));
        Assert.assertEquals(checkTextAfterClick.getText(),"You clicked: Cancel");
        driver.quit();
    }

    /**
     * Test method to click button JS Prompt, add message 'Hello!' and choose button 'OK'
     */
    @Test
    public void clickButtonJSPromptAddMessageAndClickOK() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement alertButton = driver.findElement(By.cssSelector("[onclick='jsPrompt()']"));
        alertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Hello!");
        alert.accept();

        WebElement checkTextAfterClick = driver.findElement(By.id("result"));
        Assert.assertEquals(checkTextAfterClick.getText(),"You entered: Hello!");
        driver.quit();
    }

    /**
     * Test method to click button JS Prompt, don't add message and choose button 'OK'
     */
    @Test
    public void clickButtonJSPromptDoNotAddMessageAndClickOK() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement alertButton = driver.findElement(By.cssSelector("[onclick='jsPrompt()']"));
        alertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement checkTextAfterClick = driver.findElement(By.id("result"));
        Assert.assertEquals(checkTextAfterClick.getText(),"You entered:");
        driver.quit();
    }

    /**
     * Test method to click button JS Prompt and choose button 'Cancel'
     */
    @Test
    public void clickButtonJSPromptAndClickCancel() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement alertButton = driver.findElement(By.cssSelector("[onclick='jsPrompt()']"));
        alertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();

        WebElement checkTextAfterClick = driver.findElement(By.id("result"));
        Assert.assertEquals(checkTextAfterClick.getText(),"You entered: null");
        driver.quit();
    }
}
