package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class NotesLoginPage extends BasePage {

    WebDriver driver;

    public NotesLoginPage(WebDriver driver) {

        super(driver);

        this.driver = driver;
    }

    By loginButton =
        By.xpath("//a[contains(text(),'Login')]");

    By emailField =
            By.id("email");

    By passwordField =
            By.id("password");

    By submitButton =
            By.xpath("//button[@type='submit']");

    public void loginToNotesApp(
            String email,
            String password) {

        click(loginButton);

        type(emailField, email);

        type(passwordField, password);

        click(submitButton);
    }
}