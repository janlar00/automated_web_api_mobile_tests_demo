package ch.demo.web.tests.pages;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;

public class TelecomPage {
    //Elements

    //Actions
    public SelenideElement findElementWithHref(String text) {
        String formattedString = String.format("[href='%s']", text);
        return $(formattedString);
    }
}
