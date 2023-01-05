package ch.adesso.demo.apitests.specs;

import static ch.adesso.demo.apitests.filters.CustomApiListener.withCustomTemplates;
import static io.restassured.RestAssured.with;
import static io.restassured.filter.log.LogDetail.BODY;
import static io.restassured.filter.log.LogDetail.STATUS;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.notNullValue;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class RefundBookingSpec {
    public static RequestSpecification refundBookingRequestSpec = with()
            .filter(withCustomTemplates())
            .headers("X-Conversation-Id", "cafebabe-ba55-c001-d00d-decaf0bad",
                    "X-Contract-Id", "ACP1024")
            .baseUri("https://b2p.app.sbb.ch")
            .basePath("/api/refunds")
            .log().all()
            .contentType(JSON);

    public static ResponseSpecification refundBookingResponseSpec = new ResponseSpecBuilder()
            .log(STATUS)
            .log(BODY)
            .expectStatusCode(201)
            .expectBody("bookingId", notNullValue())
            .build();
}