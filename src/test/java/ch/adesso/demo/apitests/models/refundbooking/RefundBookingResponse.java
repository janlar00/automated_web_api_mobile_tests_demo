package ch.adesso.demo.apitests.models.refundbooking;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "bookingId",
        "savBookingId",
        "savTicketId"
})
public class RefundBookingResponse {

    @JsonProperty("bookingId")
    private Long bookingId;
    @JsonProperty("savBookingId")
    private Long savBookingId;
    @JsonProperty("savTicketId")
    private Long savTicketId;

    @JsonProperty("bookingId")
    public Long getBookingId() {
        return bookingId;
    }

    @JsonProperty("bookingId")
    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    @JsonProperty("savBookingId")
    public Long getSavBookingId() {
        return savBookingId;
    }

    @JsonProperty("savBookingId")
    public void setSavBookingId(Long savBookingId) {
        this.savBookingId = savBookingId;
    }

    @JsonProperty("savTicketId")
    public Long getSavTicketId() {
        return savTicketId;
    }

    @JsonProperty("savTicketId")
    public void setSavTicketId(Long savTicketId) {
        this.savTicketId = savTicketId;
    }

}
