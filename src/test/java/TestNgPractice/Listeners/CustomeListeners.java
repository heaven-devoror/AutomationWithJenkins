package TestNgPractice.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class CustomeListeners implements ITestListener {
    public void onStart(ITestContext arg) {
        System.out.println("Starts test execution ....." + arg.getName());
    }

    public void onFinish(ITestContext arg) {
        System.out.println("Finishing test execution ....." + arg.getName());
    }

    public void onTestSuccess(ITestContext arg)
    {
        System.out.println("Test completed successfully ....." + arg.getName());
    }

    public void onTestFailure(ITestContext arg)
    {
        System.out.println("Test failed ......." + arg.getName());
    }

    public void onTestSkipped(ITestContext arg)
    {
        System.out.println("Test Skipped ......"+ arg.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestContext arg)
    {
        // TODO
    }
}
