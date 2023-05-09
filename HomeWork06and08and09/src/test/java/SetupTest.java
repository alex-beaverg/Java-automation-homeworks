/*
Run from IDE:
    Shift + F10
    With Run configuration
    With right click to java-file (class, method)
    With right click to xml-file
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

import org.testng.annotations.Listeners;
import util.TestListener;

/**
 * Test class SetupTest
 */
@Listeners(TestListener.class)
public class SetupTest {}
