package ch.demo.api.models.refundbooking;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "refundOfferIds"
})
public class RefundBookingRequest {

    @JsonProperty("refundOfferIds")
    private List<Long> refundOfferIds = null;

    @JsonProperty("refundOfferIds")
    public List<Long> getRefundOfferIds() {
        return refundOfferIds;
    }

    @JsonProperty("refundOfferIds")
    public void setRefundOfferIds(List<Long> refundOfferIds) {
        this.refundOfferIds = refundOfferIds;
    }

}