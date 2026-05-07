package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import listeners.TestListener;
import base.BaseTest;
import pages.LoginPage;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {

        driver.get("https://practice.expandtesting.com/login");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("practice", "SuperSecretPassword!");

        String message = loginPage.getSuccessMessage();

Assert.assertTrue(message.contains("You logged into a secure area!"));
        System.out.println("Login Test Passed");
    }
}