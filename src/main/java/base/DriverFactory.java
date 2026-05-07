package base;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import utils.ConfigReader;

public class DriverFactory {

    public static WebDriver driver;

    public static WebDriver initializeDriver() {

        ConfigReader configReader =
                new ConfigReader();

        String browser =
                configReader.getBrowser();

        if (browser.equalsIgnoreCase("chrome")) {

    WebDriverManager.chromedriver().setup();

    ChromeOptions options =
            new ChromeOptions();

    options.addArguments(
            "--remote-allow-origins=*");

    options.addArguments(
            "--disable-notifications");

    options.addArguments(
            "--start-maximized");

    driver = new ChromeDriver(options);
}

else if (browser.equalsIgnoreCase("edge")) {

    WebDriverManager.edgedriver().setup();

    driver = new EdgeDriver();
}

        driver.manage().window().maximize();

        return driver;
    }
}