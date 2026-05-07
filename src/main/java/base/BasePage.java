package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver) {

        this.driver = driver;
    }

    public void click(By locator) {

    WebElement element = driver.findElement(locator);

    JavascriptExecutor js = (JavascriptExecutor) driver;

    js.executeScript("arguments[0].click();", element);
}

    public void type(By locator, String text) {

        driver.findElement(locator).sendKeys(text);
    }

    public String getText(By locator) {

        return driver.findElement(locator).getText();
    }

    public boolean isDisplayed(By locator) {

        return driver.findElement(locator).isDisplayed();
    }
}