package ch.demo.web.tests.pages;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;

public class FtthDbPage {
    //Elements

    //Actions
    public SelenideElement findElementWithText(String text) {
        return $(withText(text));
    }
}