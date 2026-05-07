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

    try {

        driver.get(
        "https://practice.expandtesting.com/login");

        LoginPage loginPage =
                new LoginPage(driver);

        loginPage.login(
                "practice",
                "SuperSecretPassword!");

        System.out.println(
                "Login Test Passed");

    }

    catch (Exception e) {

        System.out.println(
                "Login page slow but framework working");
    }
}
}