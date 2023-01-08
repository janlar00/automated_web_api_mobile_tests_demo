package ch.demo.api.specs;

import static io.restassured.RestAssured.with;
import static io.restassured.filter.log.LogDetail.ALL;
import static io.restassured.http.ContentType.JSON;

import ch.demo.api.filters.CustomApiListener;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class DeleteBarcodeSpec {
    public static RequestSpecification deleteBarcodeRequestSpec = with()
            .filter(CustomApiListener.withCustomTemplates())
            .headers("X-Conversation-Id", "cafebabe-ba55-c001-d00d-decaf0bad",
                    "X-Contract-Id", "ACP1024")
            .baseUri("https://b2p.app.sbb.ch")
            .basePath("/api/barcodes/600717423181")
            .log().all()
            .contentType(JSON);

    public static ResponseSpecification deleteBarcodeResponseSpec = new ResponseSpecBuilder()
            .log(ALL)
            .expectStatusCode(200)
            .build();
}