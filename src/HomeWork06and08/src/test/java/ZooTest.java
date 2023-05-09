import HomeWork06and08.zoo_classes.Eagle;
import HomeWork06and08.zoo_classes.Sparrow;
import HomeWork06and08.zoo_classes.Zoo;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
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
        System.out.println(ANSI_BLUE + "TEST_INFO: Setup for zoo tests starts" + ANSI_RESET);
        zoo = new Zoo();
        eagle = new Eagle("Eagle Steeve");
        sparrow = new Sparrow("Sparrow Jack");
    }

    /**
     * Teardown test method for class ZooTest
     */
    @AfterTest
    public void teardownZoo() {
        System.out.println(ANSI_BLUE + "TEST_INFO: Teardown for zoo tests starts" + ANSI_RESET);
    }

    /**
     * Test method for method 'add animal to zoo' with expected result
     */
    @Test(groups = "positive")
    public void addAnimalToZooMethodTestWithExpectedResult() {
        System.out.println(ANSI_BLUE + "TEST_INFO: Zoo test method for method 'add animal to zoo' " +
                "with expected result" + ANSI_RESET);
        zoo.addAnimalToZoo(eagle);
        zoo.addAnimalToZoo(sparrow);
        Assert.assertTrue(zoo.getZoo().size() == 2);
    }

    /**
     * Test method for method 'add animal to zoo' with wrong result
     */
    @Test(groups = "negative")
    public void addAnimalToZooMethodTestWithWrongResult() {
        System.out.println(ANSI_BLUE + "TEST_INFO: Zoo test method for method 'add animal to zoo' " +
                "with wrong result" + ANSI_RESET);
        zoo.addAnimalToZoo(eagle);
        zoo.addAnimalToZoo(sparrow);
        Assert.assertFalse(zoo.getZoo().size() == 9);
    }
}
