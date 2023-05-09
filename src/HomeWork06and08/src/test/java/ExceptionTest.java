import org.testng.annotations.Test;

/**
 * Test class ExceptionTest
 */
public class ExceptionTest extends SetupTest {

    /**
     * Test method with Exception
     * @throws Exception
     */
    @Test(expectedExceptions = Exception.class)
    public void exceptionTest() throws Exception {
        System.out.println(ANSI_BLUE + "TEST_INFO: Method with exception test starts" + ANSI_RESET);
        throw new Exception();
    }
}
