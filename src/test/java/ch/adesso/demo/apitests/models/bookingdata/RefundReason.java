package ch.adesso.demo.apitests.models.bookingdata;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "description",
        "reasonId",
        "onlyIndividuallyRefundable"
})
public class RefundReason {

    @JsonProperty("description")
    private String description;
    @JsonProperty("reasonId")
    private String reasonId;
    @JsonProperty("onlyIndividuallyRefundable")
    private Boolean onlyIndividuallyRefundable;

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("reasonId")
    public String getReasonId() {
        return reasonId;
    }

    @JsonProperty("reasonId")
    public void setReasonId(String reasonId) {
        this.reasonId = reasonId;
    }

    @JsonProperty("onlyIndividuallyRefundable")
    public Boolean getOnlyIndividuallyRefundable() {
        return onlyIndividuallyRefundable;
    }

    @JsonProperty("onlyIndividuallyRefundable")
    public void setOnlyIndividuallyRefundable(Boolean onlyIndividuallyRefundable) {
        this.onlyIndividuallyRefundable = onlyIndividuallyRefundable;
    }

}