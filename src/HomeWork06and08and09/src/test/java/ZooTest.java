import HomeWork06and08and09.zoo_classes.Eagle;
import HomeWork06and08and09.zoo_classes.Sparrow;
import HomeWork06and08and09.zoo_classes.Zoo;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Test class ZooTest
 */
public class ZooTest extends SetupTest {
    // Test class variables:
    private Zoo zoo;
    private Eagle eagle;
    private Sparrow sparrow;

    /**
     * Setup test method for class ZooTest
     */
    @BeforeTest
    public void setupZoo() {
        zoo = new Zoo();
        eagle = new Eagle("Eagle Steeve");
        sparrow = new Sparrow("Sparrow Jack");
    }

    /**
     * Teardown test method for class ZooTest
     */
    @AfterTest
    public void teardownZoo() {}

    /**
     * Test method for method 'add animal to zoo' with expected result
     */
    @Test(groups = "positive")
    public void addAnimalToZooMethodTestWithExpectedResult() {
        zoo.addAnimalToZoo(eagle);
        zoo.addAnimalToZoo(sparrow);
        Assert.assertTrue(zoo.getZoo().size() == 2);
    }

    /**
     * Test method for method 'add animal to zoo' with wrong result
     */
    @Test(groups = "negative", dataProvider = "wrongAnimalsInZoo")
    public void addAnimalToZooMethodTestWithWrongResult(int number) {
        zoo.addAnimalToZoo(eagle);
        zoo.addAnimalToZoo(sparrow);
        Assert.assertFalse(zoo.getZoo().size() == number);
    }

    /**
     * Data provider method for test method addAnimalToZooMethodTestWithWrongResult()
     * @return
     */
    @DataProvider(name = "wrongAnimalsInZoo")
    public Object[][] getWrongAnimalsInZoo() {
        return new Object[][] {
                { -5 }, { 0 }, { 3 }, { 25 }
        };
    }
}
