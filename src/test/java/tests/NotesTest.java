package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseTest;

import listeners.TestListener;

import pages.NotesDashboardPage;
import pages.NotesLoginPage;

@Listeners(TestListener.class)

public class NotesTest extends BaseTest {

    @Test
    public void createNoteTest() {

        driver.get(
        "https://practice.expandtesting.com/notes/app");

        NotesLoginPage loginPage =
                new NotesLoginPage(driver);

        loginPage.loginToNotesApp(
                "saransakthivel2005@gmail.com",
                "Saran@");

        NotesDashboardPage dashboardPage =
                new NotesDashboardPage(driver);

        dashboardPage.createNote(
                "Hackathon Note",
                "Automation testing framework");

        System.out.println(
                "Note Created Successfully");
    }
}