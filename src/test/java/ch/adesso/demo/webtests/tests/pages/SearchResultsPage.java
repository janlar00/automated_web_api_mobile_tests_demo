package ch.adesso.demo.webtests.tests.pages;

import static com.codeborne.selenide.Selenide.$$;

import com.codeborne.selenide.ElementsCollection;

public class SearchResultsPage {
    // Elements
    private final ElementsCollection searchResultsElementsCollection = $$(".adesso-serach-result-elem");

    // Actions

    public ElementsCollection searchResultCollection() {
        return searchResultsElementsCollection;
    }
}
