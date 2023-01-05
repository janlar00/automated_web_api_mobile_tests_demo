package ch.adesso.demo.apitests.tests;

import static ch.adesso.demo.apitests.specs.CreateBarcodeSpec.createBarcodeRequestSpec;
import static ch.adesso.demo.apitests.specs.CreateBarcodeSpec.createBarcodeResponseSpec;
import static ch.adesso.demo.apitests.specs.RefundBookingSpec.refundBookingRequestSpec;
import static ch.adesso.demo.apitests.specs.RefundBookingSpec.refundBookingResponseSpec;
import static ch.adesso.demo.apitests.specs.DeleteBarcodeSpec.deleteBarcodeRequestSpec;
import static ch.adesso.demo.apitests.specs.DeleteBarcodeSpec.deleteBarcodeResponseSpec;
import static ch.adesso.demo.apitests.specs.BookingDataSpecs.bookingDataRequestSpec;
import static ch.adesso.demo.apitests.specs.BookingDataSpecs.bookingDataResponseSpec;
import static ch.adesso.demo.apitests.specs.LocationSpecs.locationRequestSpec;
import static ch.adesso.demo.apitests.specs.LocationSpecs.locationResponseSpec;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import ch.adesso.demo.apitests.assertions.BookingDataResponseAsserts;
import ch.adesso.demo.apitests.assertions.CreateBarcodeResponseAsserts;
import ch.adesso.demo.apitests.assertions.LocationResponseAsserts;
import ch.adesso.demo.apitests.models.barcode.CreateBarcodeRequest;
import ch.adesso.demo.apitests.models.barcode.CreateBarcodeResponse;
import ch.adesso.demo.apitests.models.barcode.CustomerSegment;
import ch.adesso.demo.apitests.models.barcode.Description;
import ch.adesso.demo.apitests.models.barcode.Description__1;
import ch.adesso.demo.apitests.models.barcode.Destination;
import ch.adesso.demo.apitests.models.barcode.ModeOfTransportInformation;
import ch.adesso.demo.apitests.models.barcode.Origin;
import ch.adesso.demo.apitests.models.barcode.PassengerInformation;
import ch.adesso.demo.apitests.models.barcode.RouteInformation;
import ch.adesso.demo.apitests.models.barcode.TariffInformation;
import ch.adesso.demo.apitests.models.bookingdata.BookingDataResponse;
import ch.adesso.demo.apitests.models.refundbooking.RefundBookingRequest;
import ch.adesso.demo.apitests.models.refundbooking.RefundBookingResponse;
import ch.adesso.demo.apitests.models.location.LocationResponse;
import io.restassured.common.mapper.TypeRef;

public class SBBModelTests {

    @Test
    @Tag("Api")
    void bookingDataTest() {

        BookingDataResponse bookingDataResponse = given()
                .spec(bookingDataRequestSpec)
                .when()
                .get()
                .then()
                .spec(bookingDataResponseSpec)
                .extract().as(BookingDataResponse.class);

        new BookingDataResponseAsserts(bookingDataResponse, BookingDataResponseAsserts.class)
                .arePassengersExist();

        assertThat(bookingDataResponse.getBookingId()).isNotBlank();
        assertThat(bookingDataResponse.getStatus()).isEqualTo("COMMITTED");
        assertThat(bookingDataResponse.getBookings().get(0).getStatus()).isEqualTo("OK");
                //.body("data.findAll { it.id < 9 }.last_name", hasItems("Darwin", "Einstein"));
    }

    @Test
    @Tag("Api")
    void locationTest() {

        LocationResponse locationResponse = given()
                .spec(locationRequestSpec)
                .when()
                .get()
                .then()
                .spec(locationResponseSpec)
                .extract().as(LocationResponse.class);

        new LocationResponseAsserts(locationResponse, LocationResponseAsserts.class)
                .hasStationCorrectLatitude();

        assertThat(locationResponse.getHasNextPage()).isTrue();
        assertThat(locationResponse.getNextPageAvailable()).isTrue();
    }

    @Test
    @Tag("Api")
    void refundBookingTest() {
        RefundBookingRequest refundBookingRequest = new RefundBookingRequest();
        refundBookingRequest.setRefundOfferIds(new ArrayList<Long>(Arrays.asList(1L, 2L)));

        List<RefundBookingResponse> refundBookingResponse =
        given()
                .spec(refundBookingRequestSpec)
                .body(refundBookingRequest)
                .when()
                .post()
                .then()
                .spec(refundBookingResponseSpec)
                .extract().as(new TypeRef<List<RefundBookingResponse>>() {});

        assertThat(refundBookingResponse.get(0).getBookingId()).isEqualTo(318587448);
        assertThat(refundBookingResponse.get(0).getSavBookingId()).isEqualTo(352191434);
        assertThat(refundBookingResponse.get(0).getSavTicketId()).isEqualTo(18398966);
    }

    @Test
    @Tag("Api")
    void createBarcodeTest() {
        Description description = new Description("Allgemeine Beschreibung","string","string","string");
        Origin origin = new Origin("8507000", "Bern");
        Destination destination = new Destination("8507000", "Bern");
        CustomerSegment customerSegment = new CustomerSegment("Allgemeine Beschreibung","","","");
        Description__1 description__1 = new Description__1("Allgemeine Beschreibung","","","");
        RouteInformation routeInformation = new RouteInformation(description__1);
        List<RouteInformation> routeInformations = new ArrayList<>();
        routeInformations.add(routeInformation);
        TariffInformation tariffInformation = new TariffInformation(description, 125, 1, true, origin, destination, routeInformations,
                "(1.)(V)(HA)", "outward", "2022-12-31T13:29:32", "2022-12-31T13:29:32",
                "2022-12-31T13:29:32", "2022-12-31T13:29:32", customerSegment);
        PassengerInformation passengerInformation = new PassengerInformation("Mustermann", "Hans", "2020-11-27", "string", "string", "string");
        List<PassengerInformation> passengerInformations = new ArrayList<>();
        passengerInformations.add(passengerInformation);
        ModeOfTransportInformation modeOfTransportInformation = new ModeOfTransportInformation("IC6", "1", Arrays.asList(
                "string"), "TRAIN");
        List<ModeOfTransportInformation> modeOfTransportInformations = new ArrayList<>();
        modeOfTransportInformations.add(modeOfTransportInformation);

        CreateBarcodeRequest createBarcodeRequest = new CreateBarcodeRequest("string", "string", tariffInformation,
                passengerInformations, "incl. Fondue", modeOfTransportInformations, true);


        CreateBarcodeResponse createBarcodeResponse =
                given()
                        .spec(createBarcodeRequestSpec)
                        .body(createBarcodeRequest)
                        .when()
                        .post()
                        .then()
                        .spec(createBarcodeResponseSpec)
                        .extract().as(CreateBarcodeResponse.class);

        new CreateBarcodeResponseAsserts(createBarcodeResponse, CreateBarcodeResponseAsserts.class)
                .isBarcodeReceivedAndOK();
    }

    @Test
    @Tag("Api")
    void deleteBarcodeTest() {
        given()
                .spec(deleteBarcodeRequestSpec)
                .when()
                .delete()
                .then()
                .spec(deleteBarcodeResponseSpec);
    }
}
