package ch.adesso.demo.apitests.models.bookingdata;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "type",
        "onlyIndividuallyRefundable",
        "refundReasons"
})
public class RefundData {

    @JsonProperty("type")
    private String type;
    @JsonProperty("onlyIndividuallyRefundable")
    private Boolean onlyIndividuallyRefundable;
    @JsonProperty("refundReasons")
    private List<RefundReason> refundReasons = null;

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("onlyIndividuallyRefundable")
    public Boolean getOnlyIndividuallyRefundable() {
        return onlyIndividuallyRefundable;
    }

    @JsonProperty("onlyIndividuallyRefundable")
    public void setOnlyIndividuallyRefundable(Boolean onlyIndividuallyRefundable) {
        this.onlyIndividuallyRefundable = onlyIndividuallyRefundable;
    }

    @JsonProperty("refundReasons")
    public List<RefundReason> getRefundReasons() {
        return refundReasons;
    }

    @JsonProperty("refundReasons")
    public void setRefundReasons(List<RefundReason> refundReasons) {
        this.refundReasons = refundReasons;
    }

}