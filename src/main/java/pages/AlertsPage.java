package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class AlertsPage extends BasePage {

    WebDriver driver;

    public AlertsPage(WebDriver driver) {

        super(driver);

        this.driver = driver;
    }

    By jsAlertButton =
            By.xpath("//button[contains(text(),'JS Alert')]");

    By jsConfirmButton =
            By.xpath("//button[contains(text(),'JS Confirm')]");

    By jsPromptButton =
            By.xpath("//button[contains(text(),'JS Prompt')]");

    public void clickJSAlert() {

        click(jsAlertButton);
    }

    public void clickJSConfirm() {

        click(jsConfirmButton);
    }

    public void clickJSPrompt() {

        click(jsPromptButton);
    }
}