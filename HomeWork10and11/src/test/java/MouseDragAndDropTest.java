import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test class MouseDragAndDropTest
 */
public class MouseDragAndDropTest {

    /**
     * Test method using Drug and Drop action
     */
    @Test
    public void drugAndDropTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://learn.javascript.ru/article/mouse-drag-and-drop/ball4");

        WebElement ball = driver.findElement(By.id("ball"));
        WebElement goal = driver.findElement(By.id("gate"));
        Actions builder = new Actions(driver);
        builder.clickAndHold(ball).moveByOffset(600, 300).moveByOffset(-600, 300)
                .moveByOffset(1200, 0).moveByOffset(-600, -300)
                .moveByOffset(600, -300).moveByOffset(-1200, 0).release()
                .dragAndDrop(ball, goal).perform();

        Assert.assertEquals(goal.getCssValue("background-color"),"rgba(255, 192, 203, 1)");
    }
}
