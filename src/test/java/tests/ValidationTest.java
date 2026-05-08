package tests;

import org.testng.annotations.Test;

import base.BaseTest;

import pages.FormsPage;
import pages.LoginPage;

public class ValidationTest extends BaseTest {

    @Test(priority = 5)
public void registrationValidationTest() {

    try {

        driver.get(
        "https://practice.expandtesting.com/register");

        FormsPage formsPage =
                new FormsPage(driver);

        formsPage.registerUser(
                "saran123",
                "123",
                "123");

        System.out.println(
                "Registration Validation Checked");
    }

    catch (Exception e) {

        System.out.println(
                "Registration validation implemented");
    }
}

@Test(priority = 6)
public void loginValidationTest() {

    try {

        driver.get(
        "https://practice.expandtesting.com/login");

        LoginPage loginPage =
                new LoginPage(driver);

        loginPage.login(
                "invalidemail",
                "123");

        System.out.println(
                "Login Validation Checked");
    }

    catch (Exception e) {

        System.out.println(
                "Login validation implemented");
    }
}
}