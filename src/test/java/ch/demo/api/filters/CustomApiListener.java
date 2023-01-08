package ch.demo.api.filters;

import io.qameta.allure.restassured.AllureRestAssured;

public class CustomApiListener {

    private static final AllureRestAssured FILTER = new AllureRestAssured();

    private CustomApiListener() {
    }

    public static CustomApiListener customLogFilter() {
        return InitLogFilter.logFilter;
    }

    public static AllureRestAssured withCustomTemplates() {
        FILTER.setRequestTemplate("request.ftl");
        FILTER.setResponseTemplate("response.ftl");
        return FILTER;

    }

    private static class InitLogFilter {
        private static final CustomApiListener logFilter = new CustomApiListener();
    }
}
