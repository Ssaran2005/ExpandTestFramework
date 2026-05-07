package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseTest;

import listeners.TestListener;

import pages.FormsPage;

@Listeners(TestListener.class)

public class FormsTest extends BaseTest {

    @Test
    public void formInteractionTest() {

        driver.get(
        "https://practice.expandtesting.com/inputs");

        FormsPage formsPage =
                new FormsPage(driver);

        formsPage.enterFormData("100");

        System.out.println(
                "Form Interaction Completed");
    }
}