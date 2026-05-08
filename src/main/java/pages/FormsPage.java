package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class FormsPage extends BasePage {

    WebDriver driver;

    public FormsPage(WebDriver driver) {

        super(driver);

        this.driver = driver;
    }

    By usernameField =
            By.id("username");

    By passwordField =
            By.id("password");

    By confirmPasswordField =
            By.id("confirmPassword");

    By registerButton =
            By.xpath("//button[contains(text(),'Register')]");

    public void registerUser(
            String username,
            String password,
            String confirmPassword) {

        type(usernameField, username);

        type(passwordField, password);

        type(confirmPasswordField,
                confirmPassword);

        click(registerButton);
    }
}