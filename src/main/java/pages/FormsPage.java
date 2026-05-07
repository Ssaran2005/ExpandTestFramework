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

    By inputField =
            By.name("input-number");

    By button =
            By.xpath("//button[contains(text(),'Display')]");

    public void enterFormData(String value) {

        type(inputField, value);

        click(button);
    }
}