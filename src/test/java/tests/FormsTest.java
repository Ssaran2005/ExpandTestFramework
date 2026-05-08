package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseTest;

import listeners.TestListener;

import pages.FormsPage;

@Listeners(TestListener.class)

public class FormsTest extends BaseTest {

 @Test(priority = 3)
public void formInteractionTest() {

    driver.get(
    "https://practice.expandtesting.com/register");

    FormsPage formsPage =
            new FormsPage(driver);

    formsPage.registerUser(
            "saran123",
            "Password123",
            "Password123");

    try {

        Thread.sleep(5000);

    }

    catch (Exception e) {

    }

    System.out.println(
            "Complete Form Interaction Completed");
}
}
