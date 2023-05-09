import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.TestListener;

/**
 * Test class ExceptionTest
 */
@Listeners(TestListener.class)
public class ExceptionTest extends SetupTest {

    /**
     * Test method with Exception
     * @throws Exception
     */
    @Test(expectedExceptions = Exception.class)
    public void exceptionTest() throws Exception {
        throw new Exception();
    }
}
