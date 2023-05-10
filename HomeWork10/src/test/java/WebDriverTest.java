import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class WebDriverTest {

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
        driver.quit();
    }
}
