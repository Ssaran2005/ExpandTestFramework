package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class NotesPage extends BasePage {

    WebDriver driver;

    public NotesPage(WebDriver driver) {

        super(driver);

        this.driver = driver;
    }

    By addButton =
            By.id("add-note");

    By titleField =
            By.id("note-title");

    By descriptionField =
            By.id("note-description");

    By saveButton =
            By.id("save-note");

    public void createNote(String title,
                           String description) {

        click(addButton);

        type(titleField, title);

        type(descriptionField, description);

        click(saveButton);
    }
}