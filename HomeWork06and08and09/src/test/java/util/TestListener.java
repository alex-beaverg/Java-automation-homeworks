package util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * Class TestListener implements ITestListener
 */
public class TestListener implements ITestListener {
    // Variables for print test logs in another color:
    protected static final String ANSI_BLUE = "\u001B[34m";
    protected static final String ANSI_RESET = "\u001B[0m";
    protected static final String ANSI_GREEN = "\u001B[32m";

    /**
     * Override method to print start project test-log
     * @param iTestContext
     */
    @Override
    public void onStart(ITestContext iTestContext) {
        String projectName = iTestContext.getName();
        System.out.printf("%sTEST_INFO: The tests for project %s%s%s were started%s%n",
                ANSI_BLUE, ANSI_GREEN, projectName, ANSI_BLUE, ANSI_RESET);
    }

    /**
     * Override method to print finish project test-log
     * @param iTestContext
     */
    @Override
    public void onFinish(ITestContext iTestContext) {
        String projectName = iTestContext.getName();
        long allTestsRunTime = iTestContext.getEndDate().getTime() - iTestContext.getStartDate().getTime();
        System.out.printf("%sTEST_INFO: All tests for project %s%s%s lasted %s milliseconds%s%n",
                ANSI_BLUE, ANSI_GREEN, projectName, ANSI_BLUE, allTestsRunTime, ANSI_RESET);
    }

    /**
     * Override method to print start test test-log
     * @param iTestResult
     */
    @Override
    public void onTestStart(ITestResult iTestResult) {
        String testName = iTestResult.getName();
        System.out.printf("%sTEST_INFO: The test %s%s%s was started%s%n",
                ANSI_BLUE, ANSI_GREEN, testName, ANSI_BLUE, ANSI_RESET);
    }

    /**
     * Override method to print success finish test test-log
     * @param iTestResult
     */
    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        long testRunTime = iTestResult.getEndMillis() - iTestResult.getStartMillis();
        String testName = iTestResult.getName();
        System.out.printf("%sTEST_INFO: The test %s%s%s lasted %s milliseconds and was successful%s%n",
                ANSI_BLUE, ANSI_GREEN, testName, ANSI_BLUE, testRunTime, ANSI_RESET);
    }

    /**
     * Override method to print failure finish test test-log
     * @param iTestResult
     */
    @Override
    public void onTestFailure(ITestResult iTestResult) {
        long testRunTime = iTestResult.getEndMillis() - iTestResult.getStartMillis();
        String testName = iTestResult.getName();
        System.out.printf("%sTEST_INFO: The test %s%s%s lasted %s milliseconds and was a failure%s%n",
                ANSI_BLUE, ANSI_GREEN, testName, ANSI_BLUE, testRunTime, ANSI_RESET);
    }

    /**
     * Override method to print skipped finish test test-log
     * @param iTestResult
     */
    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        long testRunTime = iTestResult.getEndMillis() - iTestResult.getStartMillis();
        String testName = iTestResult.getName();
        System.out.printf("%sTEST_INFO: The test %s%s%s lasted %s milliseconds and was skipped%s%n",
                ANSI_BLUE, ANSI_GREEN, testName, ANSI_BLUE, testRunTime, ANSI_RESET);
    }
}
