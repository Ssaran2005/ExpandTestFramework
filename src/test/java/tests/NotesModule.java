package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseTest;

import listeners.TestListener;

import pages.NotesPage;

@Listeners(TestListener.class)

public class NotesModule extends BaseTest {

    @Test(enabled = false)
    public void createNoteTest() {

        driver.get(
                "https://practice.expandtesting.com/notes");

        NotesPage notesPage =
                new NotesPage(driver);

        notesPage.createNote(
                "Hackathon Note",
                "Framework automation testing");

        System.out.println(
                "Notes Test Executed");
    }
}