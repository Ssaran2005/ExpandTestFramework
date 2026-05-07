package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class LoginPage extends BasePage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {

        super(driver);

        this.driver = driver;
    }

    By username = By.id("username");

    By password = By.id("password");

    By loginButton = By.xpath("//button[@type='submit']");

    By successMessage = By.id("flash");

    public void login(String user, String pass) {

        type(username, user);

        type(password, pass);

        click(loginButton);
    }

    public String getSuccessMessage() {

        return getText(successMessage);
    }
}