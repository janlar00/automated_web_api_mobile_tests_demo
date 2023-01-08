package ch.demo.api.tests;

import static ch.demo.api.specs.DeleteBarcodeSpec.deleteBarcodeRequestSpec;
import static ch.demo.api.specs.DeleteBarcodeSpec.deleteBarcodeResponseSpec;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import ch.demo.api.assertions.BookingDataResponseAsserts;
import ch.demo.api.assertions.CreateBarcodeResponseAsserts;
import ch.demo.api.assertions.LocationResponseAsserts;
import ch.demo.api.models.barcode.CreateBarcodeRequest;
import ch.demo.api.models.barcode.CreateBarcodeResponse;
import ch.demo.api.models.barcode.CustomerSegment;
import ch.demo.api.models.barcode.Description;
import ch.demo.api.models.barcode.Description__1;
import ch.demo.api.models.barcode.Destination;
import ch.demo.api.models.barcode.ModeOfTransportInformation;
import ch.demo.api.models.barcode.Origin;
import ch.demo.api.models.barcode.PassengerInformation;
import ch.demo.api.models.barcode.RouteInformation;
import ch.demo.api.models.barcode.TariffInformation;
import ch.demo.api.models.bookingdata.BookingDataResponse;
import ch.demo.api.models.refundbooking.RefundBookingRequest;
import ch.demo.api.models.refundbooking.RefundBookingResponse;
import ch.demo.api.models.location.LocationResponse;
import ch.demo.api.specs.BookingDataSpecs;
import ch.demo.api.specs.CreateBarcodeSpec;
import ch.demo.api.specs.LocationSpecs;
import ch.demo.api.specs.RefundBookingSpec;
import io.restassured.common.mapper.TypeRef;

public class SBBModelTests {

    @Test
    @Tag("Api")
    void bookingDataTest() {

        BookingDataResponse bookingDataResponse = given()
                .spec(BookingDataSpecs.bookingDataRequestSpec)
                .when()
                .get()
                .then()
                .spec(BookingDataSpecs.bookingDataResponseSpec)
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
                .spec(LocationSpecs.locationRequestSpec)
                .when()
                .get()
                .then()
                .spec(LocationSpecs.locationResponseSpec)
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
                .spec(RefundBookingSpec.refundBookingRequestSpec)
                .body(refundBookingRequest)
                .when()
                .post()
                .then()
                .spec(RefundBookingSpec.refundBookingResponseSpec)
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
                        .spec(CreateBarcodeSpec.createBarcodeRequestSpec)
                        .body(createBarcodeRequest)
                        .when()
                        .post()
                        .then()
                        .spec(CreateBarcodeSpec.createBarcodeResponseSpec)
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
