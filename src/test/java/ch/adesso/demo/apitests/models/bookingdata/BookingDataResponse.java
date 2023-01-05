package ch.adesso.demo.apitests.models.bookingdata;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "bookingId",
        "status",
        "bookings"
})
public class BookingDataResponse {

    @JsonProperty("bookingId")
    private String bookingId;
    @JsonProperty("status")
    private String status;
    @JsonProperty("bookings")
    private List<Booking> bookings = null;

    @JsonProperty("bookingId")
    public String getBookingId() {
        return bookingId;
    }

    @JsonProperty("bookingId")
    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("bookings")
    public List<Booking> getBookings() {
        return bookings;
    }

    @JsonProperty("bookings")
    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

}