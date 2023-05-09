/*
Run from IDE:
    Shift + F10
Run from command-line:
    Run all tests:
        mvn clean test
    Run tests with xml suite:
        Run all tests:
            mvn clean test -Dsurefire.suiteXmlFiles=src/test/resources/MyTestNGAllSuite.xml
        Run positive tests:
            mvn clean test -Dsurefire.suiteXmlFiles=src/test/resources/MyTestNGPositiveSuite.xml
        Run negative tests:
            mvn clean test -Dsurefire.suiteXmlFiles=src/test/resources/MyTestNGNegativeSuite.xml
Clean folder 'target' from command-line:
    mvn clean
*/

/**
 * Test class SetupTest
 */
public class SetupTest {
    // Variables for print test logs in another color:
    protected static final String ANSI_BLUE = "\u001B[34m";
    protected static final String ANSI_RESET = "\u001B[0m";
}
