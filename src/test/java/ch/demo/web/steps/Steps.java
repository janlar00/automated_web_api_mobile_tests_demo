package ch.demo.web.steps;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.timeout;
import static com.codeborne.selenide.Selenide.title;
import static com.codeborne.selenide.files.FileFilters.withExtension;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.io.IOException;

import ch.demo.web.tests.pages.FtthDbPage;
import ch.demo.web.tests.pages.MainPage;
import ch.demo.web.tests.pages.SearchResultsPage;
import ch.demo.web.tests.pages.TelecomPage;
import io.qameta.allure.Step;

public class Steps {
    MainPage mainPage = new MainPage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();
    TelecomPage telecomPage = new TelecomPage();
    FtthDbPage ftthDbPage = new FtthDbPage();

    @Step("Open home page")
    public void openStartPage() {
        mainPage.openPage("/");
    }
    @Step("Check main page title")
    public void checkTitle() {
        String expectedTitle = "adesso Schweiz AG - IT-Dienstleister - Kerngeschäftsprozesse optimieren durch gezielten Einsatz moderner IT";
        String actualTitle = title();
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }
    @Step("Check top menu items exist")
    public void checkTopMenuItems() {
        String[] menuItems = {"adesso entdecken", "Jobs & Karriere", "Gespeicherte Seiten"};
        for (String menuItem : menuItems) {
            mainPage.findElementWithText(menuItem).shouldHave(text(menuItem));
        }
    }
    @Step("Enter the search query and press enter")
    public void enterSearchQuery() {
        final String SEARCHSTRING = "SBB";
        mainPage.performSearch(SEARCHSTRING);
    }

    @Step("Check main page search result")
    public void mainPageSearchResult() {
        searchResultsPage.searchResultCollection().shouldHave(size(2));

    }
    @Step("Open Telecom page")
    public void openAdessoEntdeckenTelecom() {
        mainPage.findElementWithText("adesso entdecken").click();
        mainPage.findElementWithText("Branchen").click();
        mainPage.findElementWithText("Telecom").click();
    }
    @Step("Open FTTH-Db project page")
    public void openFtthDbProject() {
        telecomPage.findElementWithHref("referenzen/swisscom-ftth.jsp").
                scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}").click();
    }
    @Step("Download PDF spreadsheet and check the name")
    public void saveAndCheckPdfSpreadsheet() throws IOException {

        File downloadedFile = ftthDbPage.findElementWithText("Download Sheet").download(timeout, withExtension("pdf"));
        //PDF pdf = new PDF(new File(downloadedFile.toURI()));
        assertThat(downloadedFile.getName()).matches("swisscom-ftth.pdf");
    }
}
