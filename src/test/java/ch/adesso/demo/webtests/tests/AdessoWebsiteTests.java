package ch.adesso.demo.webtests.tests;

import java.io.IOException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import ch.adesso.demo.webtests.steps.Steps;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class AdessoWebsiteTests extends BaseTest {

    Steps steps = new Steps();

    @Test
    @Tag("Web")
    @DisplayName("Check title on the main page")
    void checkTitle() {
        steps.openStartPage();
        steps.checkTitle();
    }

    @Test
    @Tag("Web")
    @DisplayName("Check the top menu items test")
    void checkTopMenuItems() {
        steps.openStartPage();
        steps.checkTopMenuItems();
    }

    @Test
    @Tag("Web")
    @Feature("Issue XYZ")
    @Story("Implement issue XYZ")
    @Owner("JL")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "Testing", url = "https://adesso.ch")
    @DisplayName("Search on the main page test")
    void checkSearchOnTheMainPage() {
        steps.openStartPage();
        steps.enterSearchQuery();
        steps.mainPageSearchResult();
    }

    @Test
    @Tag("Web")
    @Feature("Issue XYZ")
    @Story("Implement issue XYZ")
    @Owner("JL")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "Testing", url = "https://adesso.ch")
    @DisplayName("Spreadsheet FTTH-DB download test")
    void pdfSpreadsheetTest() throws IOException {
        steps.openStartPage();
        steps.openAdessoEntdeckenTelecom();
        steps.openFtthDbProject();
        steps.saveAndCheckPdfSpreadsheet();
   }

    @Disabled
    @Test
    @Tag("Web")
    @Feature("Issue XYZ")
    @Story("Implement issue XYZ")
    @Owner("JL")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "Testing", url = "https://adesso.ch")
    @DisplayName("Arbeitswelt bei Adesso prüfen")
    void vacancyCheck()  {
        steps.openStartPage();
        //steps.openAdessoEntdeckenTelecom();
        //steps.openFtthDbProject();
        //steps.saveAndCheckPdfSpreadsheet();
    }
}
