package ch.adesso.demo.apitests.assertions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.assertj.core.api.AbstractAssert;

import ch.adesso.demo.apitests.models.bookingdata.Booking;
import ch.adesso.demo.apitests.models.bookingdata.BookingDataResponse;

public class BookingDataResponseAsserts extends AbstractAssert<BookingDataResponseAsserts, BookingDataResponse> {

    public BookingDataResponseAsserts(final BookingDataResponse bookingDataResponse, final Class<?> selfType) {
        super(bookingDataResponse, selfType);
    }

    public void arePassengersExist() {
        boolean passengersExist = false;
        List<Booking> booking = actual.getBookings();
        if (booking.get(0).getPassenger().getName().contains("Darwin") && booking.get(1).getPassenger().getName().contains("Einstein")) {
            passengersExist = true;
        }
        if (!passengersExist)
            System.out.println("\u001B[41m" + "Passengers have not been found" + "\u001B[0m");
        assertTrue(passengersExist);
    }
}
