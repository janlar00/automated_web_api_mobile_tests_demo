package ch.adesso.demo.apitests.specs;

import static ch.adesso.demo.apitests.filters.CustomApiListener.withCustomTemplates;
import static io.restassured.RestAssured.with;
import static io.restassured.filter.log.LogDetail.BODY;
import static io.restassured.filter.log.LogDetail.STATUS;
import static io.restassured.http.ContentType.JSON;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BookingDataSpecs {
    public static RequestSpecification bookingDataRequestSpec = with()
            .filter(withCustomTemplates())
            .headers("accept", "*/*",
                    "X-Conversation-Id", "cafebabe-ba55-c001-d00d-decaf0bad",
                    "X-Contract-Id", "ACP1024", "Accept-Language", "de")
            .queryParam("onlineTicketId","164676613230")
            .baseUri("https://b2p.app.sbb.ch")
            .basePath("/api/v2/bookings")
            .log().all()
            .contentType(JSON);
    public static ResponseSpecification bookingDataResponseSpec = new ResponseSpecBuilder()
            .log(STATUS)
            .log(BODY)
            .expectStatusCode(200)
            //.expectBody("data.findAll { it.id < 9 }.last_name", hasItems("Lawson", "Ferguson"))
            .build();

}
