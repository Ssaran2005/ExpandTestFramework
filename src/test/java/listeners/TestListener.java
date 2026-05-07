package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utils.ExtentManager;
import base.BaseTest;

import utils.ScreenshotUtil;

public class TestListener implements ITestListener {
    ExtentReports extentReports = ExtentManager.getReportInstance();

ExtentTest test;

    @Override
public void onTestFailure(ITestResult result) {

    test.fail(result.getThrowable());

    ScreenshotUtil.captureScreenshot(
            BaseTest.driver,
            result.getName());

    System.out.println("Screenshot Captured");
}

    @Override
public void onStart(ITestContext context) {

    System.out.println("Test Started");
}
@Override
public void onTestStart(ITestResult result) {

    test = extentReports.createTest(result.getName());
}
@Override
public void onTestSuccess(ITestResult result) {

    test.pass("Test Passed");
}

    @Override
public void onFinish(ITestContext context) {

    extentReports.flush();

    System.out.println("Test Finished");
}
}