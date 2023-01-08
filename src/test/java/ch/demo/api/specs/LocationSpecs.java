package ch.demo.api.specs;

import static ch.demo.api.filters.CustomApiListener.withCustomTemplates;
import static io.restassured.RestAssured.with;
import static io.restassured.filter.log.LogDetail.BODY;
import static io.restassured.filter.log.LogDetail.STATUS;
import static io.restassured.http.ContentType.JSON;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class LocationSpecs {
    public static RequestSpecification locationRequestSpec = with()
            .filter(withCustomTemplates())
            .headers("accept", "*/*",
                    "X-Conversation-Id", "cafebabe-ba55-c001-d00d-decaf0bad",
                    "X-Contract-Id", "ACP1024", "Accept-Language", "de")
            .queryParam("country","CH")
            .queryParam("Page-size", "10")
            .queryParam("page", "0")
            .queryParam("order", "NAME")
            .queryParam("date", "2023-01-10")
            .baseUri("https://b2p.app.sbb.ch")
            .basePath("/api/stations")
            .log().all()
            .contentType(JSON);
    public static ResponseSpecification locationResponseSpec = new ResponseSpecBuilder()
            .log(STATUS)
            .log(BODY)
            .expectStatusCode(200)
            //.expectBody("data.findAll { it.id < 9 }.last_name", hasItems("Lawson", "Ferguson"))
            .build();

}
