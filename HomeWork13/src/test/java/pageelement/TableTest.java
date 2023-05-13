package pageelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Class TableTest
 */
public class TableTest {
    /**
     * Test method to testing table
     */
    @Test
    public void tableTest() {
        WebDriver driver = new ChromeDriver();
        SoftAssert softAssert = new SoftAssert();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/tables");

        PageWithTable pageWithTable = new PageWithTable(driver);

        int rowsTable1 = pageWithTable.table1.getRowsCount();
        softAssert.assertEquals(rowsTable1, 5);

        int columnsTable1 = pageWithTable.table1.getColumnsCount();
        softAssert.assertEquals(columnsTable1, 6);

        String textInTable1Cell33 = pageWithTable.table1.getCell(3, 3).getText();
        softAssert.assertEquals(textInTable1Cell33, "jdoe@hotmail.com");

        int rowsTable2 = pageWithTable.table1.getRowsCount();
        softAssert.assertEquals(rowsTable2, 5);

        int columnsTable2 = pageWithTable.table1.getColumnsCount();
        softAssert.assertEquals(columnsTable2, 6);

        String textInTable2Cell33 = pageWithTable.table2.getCell(3, 3).getText();
        softAssert.assertEquals(textInTable2Cell33, "jdoe@hotmail.com");

        softAssert.assertAll();
        driver.quit();
    }
}
