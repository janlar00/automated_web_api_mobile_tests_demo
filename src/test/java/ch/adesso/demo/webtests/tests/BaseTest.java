package ch.adesso.demo.webtests.tests;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;

import ch.adesso.demo.webtests.config.WebDriverProvider;
import ch.adesso.demo.webtests.helpers.AddAttachments;
import io.qameta.allure.junit5.AllureJunit5;
import io.qameta.allure.selenide.AllureSelenide;

@ExtendWith({ AllureJunit5.class})
public class BaseTest {

    @BeforeAll
    public static void beforeAll() {
        WebDriverProvider.config();
    }

    @BeforeAll
    public static void acceptCookies() {
        open("/");
        $("#ppms_cm_reject-all").click();
    }

    @BeforeEach
    void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        AddAttachments.screenshotAs("Last screenshot");
        AddAttachments.addVideo();
        AddAttachments.browserConsoleLogs();
        AddAttachments.pageSource();
    }

    @AfterEach
    void clearBrowserCookies() {
        Selenide.clearBrowserCookies();
    }
}
