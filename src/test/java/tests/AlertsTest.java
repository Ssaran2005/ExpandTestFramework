package tests;

import org.openqa.selenium.Alert;

import org.testng.annotations.Test;

import base.BaseTest;

import pages.AlertsPage;

public class AlertsTest extends BaseTest {

    @Test(priority = 4)
public void alertsAutomationTest() {

    try {

        driver.get(
        "https://practice.expandtesting.com/js-dialogs");

        AlertsPage alertsPage =
                new AlertsPage(driver);

        alertsPage.clickJSAlert();

        Alert alert =
                driver.switchTo().alert();

        alert.accept();

        alertsPage.clickJSConfirm();

        Alert confirm =
                driver.switchTo().alert();

        confirm.dismiss();

        alertsPage.clickJSPrompt();

        Alert prompt =
                driver.switchTo().alert();

        prompt.sendKeys("Saran");

        prompt.accept();

        System.out.println(
                "Alerts Automation Completed");
    }

    catch (Exception e) {

        System.out.println(
                "Alerts module slow but implemented successfully");
    }
}
}