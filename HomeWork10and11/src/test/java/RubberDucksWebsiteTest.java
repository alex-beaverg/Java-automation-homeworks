import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test class RubberDucksTest
 */
public class RubberDucksWebsiteTest {

    // Today (in 2023) there are no menu items on this website
    // I did tests for another elements

    /**
     * Test method to open 'Rubber Ducks Store' home page
     */
    @Test
    public void openRubberDucksStoreHomePageTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://litecart.stqa.ru/en/");

        WebElement titleLoginBox = driver.findElement(By.cssSelector("#box-account-login .title"));
        Assert.assertEquals(titleLoginBox.getText(), "Login");
        driver.quit();
    }

    /**
     * Test method to customer login on the 'Rubber Ducks Store' home page
     */
    @Test
    public void loginCustomerHomePageTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://litecart.stqa.ru/en/");

        WebElement inputLogin = driver.findElement(By.name("email"));
        inputLogin.sendKeys("a.beaverg@gmail.com");
        WebElement inputPassword = driver.findElement(By.name("password"));
        inputPassword.sendKeys("Test1234!");
        WebElement buttonLogin = driver.findElement(By.name("login"));
        buttonLogin.click();

        WebElement checkTextAfterLogin = driver.findElement(By.cssSelector(".notice.success"));
        Assert.assertTrue(checkTextAfterLogin.getText().contains("Alexey Bobrikov"));
        driver.quit();
    }

    /**
     * Test method to click menu item 'Rubber Ducks' on the 'Rubber Ducks Store' home page
     */
    @Test
    public void openRubberDucksPageTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://litecart.stqa.ru/en/");

        WebElement menuItemRubberDucks = driver.findElement(By.cssSelector("#site-menu .category-1 > a"));
        menuItemRubberDucks.click();

        WebElement checkTextAfterClick = driver.findElement(By.cssSelector("h1.title"));
        Assert.assertEquals(checkTextAfterClick.getText(),"Rubber Ducks");
        driver.quit();
    }

    /**
     * Test method to click menu item 'Subcategory' on the 'Rubber Ducks Store' home page
     */
    @Test
    public void openSubcategoryPageTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://litecart.stqa.ru/en/");

        WebElement menuItemHover = driver.findElement(By.cssSelector("#site-menu .category-1 > a"));
        Actions builder = new Actions(driver);
        builder.moveToElement(menuItemHover).moveByOffset(0,45).click().perform();

        WebElement checkTextAfterClick = driver.findElement(By.cssSelector("h1.title"));
        Assert.assertEquals(checkTextAfterClick.getText(),"Subcategory");
        driver.quit();
    }
}
