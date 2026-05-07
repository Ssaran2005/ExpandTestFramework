package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class NotesDashboardPage extends BasePage {

    WebDriver driver;

    public NotesDashboardPage(WebDriver driver) {

        super(driver);

        this.driver = driver;
    }

    By addNoteButton =
        By.cssSelector("button[data-testid='add-new-note']");

    By titleField =
            By.id("title");

    By descriptionField =
            By.id("description");

    By createButton =
            By.xpath("//button[contains(text(),'Create')]");

    public void createNote(
            String title,
            String description) {

        click(addNoteButton);

        type(titleField, title);

        type(descriptionField, description);

        click(createButton);
    }
}   