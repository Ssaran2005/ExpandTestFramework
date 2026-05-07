package utils;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    public static ExtentReports extentReports;

    public static ExtentReports getReportInstance() {

        if (extentReports == null) {

            ExtentSparkReporter reporter =
                    new ExtentSparkReporter(
                            "reports/ExtentReport.html");

            reporter.config().setReportName(
                    "Expand Testing Automation Report");

            reporter.config().setDocumentTitle(
                    "Automation Test Results");

            extentReports = new ExtentReports();

            extentReports.attachReporter(reporter);
        }

        return extentReports;
    }
}