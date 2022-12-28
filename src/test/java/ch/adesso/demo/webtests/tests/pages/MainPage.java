package ch.adesso.demo.webtests.tests.pages;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.SelenideElement;

public class MainPage {
    // Elements
    private final SelenideElement searchField = $("input.form-control.adesso-header-search-field.flexdatalist-alias");

    // Actions
    public MainPage openPage(String url) {
        open(url);
        return this;
    }
    public SelenideElement findElementWithText(String text) {
        return $(withText(text));
    }
    public MainPage performSearch(String searchQuery) {
        searchField.setValue(searchQuery).pressEnter();
        return this;
    }
}