package pageelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Class Table
 */
public class Table {
    // Fields:
    WebElement table;

    /**
     * Constructor for class Table
     * @param table
     */
    public Table(WebElement table) {
        this.table = table;
    }

    /**
     * Method to get rows count
     * @return int
     */
    public int getRowsCount() {
        return table.findElements(By.tagName("tr")).size();
    }

    /**
     * Method to get columns count
     * @return int
     */
    public int getColumnsCount() {
        return table.findElement(By.tagName("tr")).findElements(By.tagName("th")).size();
    }

    /**
     * Method to get cell
     * @param rowIndex
     * @param colIndex
     * @return WebElement
     */
    public WebElement getCell(int rowIndex, int colIndex) {
        WebElement row = table.findElements(By.tagName("tr")).get(rowIndex);
        return row.findElements(By.tagName("td")).get(colIndex - 1);
    }
}
