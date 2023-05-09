import HomeWork06and08and09.zoo_classes.Lion;
import HomeWork06and08and09.zoo_classes.Pike;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test class AnimalsTest
 */
public class AnimalsTest extends SetupTest {

    // Lion tests
    /**
     * Test method for 'getter for name' for lion with expected input type
     */
    @Test(groups = "positive")
    public void getLionNameTestWithExpectedInput() {
        Lion lion = new Lion("Lion Alex");
        Assert.assertEquals(lion.getAnimalName(),"Lion Alex");
    }

    /**
     * Test method for 'getter for name' for lion with wrong input type
     */
    @Test(groups = "negative")
    public void getLionNameTestWithWrongInput() {
        Lion lion = new Lion("Alex");
        Assert.assertNotEquals(lion.getAnimalName(),"Lion Alex");
    }

    /**
     * Test method for method 'toMove' for lion with expected result
     */
    @Test(groups = "positive")
    public void lionToMoveMethodTestExpectedResult() {
        Lion lion = new Lion("Lion Alex");
        Assert.assertEquals(lion.toMove(), "I move on the ground!");
    }

    /**
     * Test method for method 'toBreathe' for lion with wrong result
     */
    @Test(groups = "negative")
    public void lionToBreatheMethodTestWithWrongResult() {
        Lion lion = new Lion("Lion Alex");
        Assert.assertNotEquals(lion.toBreathe(), "I move in the water!");
    }

    // Pike tests
    /**
     * Test method for 'getter for name' for pike with expected input type
     */
    @Test(groups = "positive")
    public void getPikeNameTestWithExpectedInput() {
        Pike pike = new Pike("Pike Arrow");
        Assert.assertEquals(pike.getAnimalName(),"Pike Arrow");
    }

    /**
     * Test method for 'getter for name' for pike with wrong input type
     */
    @Test(groups = "negative")
    public void getPikeNameTestWithWrongInput() {
        Pike pike = new Pike("Arrow");
        Assert.assertNotEquals(pike.getAnimalName(),"Pike Arrow");
    }

    /**
     * Test method for method 'toMove' for pike with expected result
     */
    @Test(groups = "positive")
    public void pikeToMoveMethodTestExpectedResult() {
        Pike pike = new Pike("Pike Arrow");
        Assert.assertEquals(pike.toMove(), "I move in the water!");
    }

    /**
     * Test method for method 'toBreathe' for pike with wrong result
     */
    @Test(groups = "negative")
    public void pikeToBreatheMethodTestWithWrongResult() {
        Pike pike = new Pike("Pike Arrow");
        Assert.assertNotEquals(pike.toBreathe(), "I move on the ground!");
    }
}
