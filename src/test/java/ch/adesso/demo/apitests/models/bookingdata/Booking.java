package ch.adesso.demo.apitests.models.bookingdata;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ticketId",
        "externalTicketId",
        "externalTicketReference",
        "status",
        "salesDate",
        "productDescription",
        "productId",
        "travelDate",
        "tripType",
        "qualityOfService",
        "passenger",
        "price",
        "vat",
        "currency",
        "fareReference",
        "paymentMethodDetails",
        "refundData"
})
public class Booking {

    @JsonProperty("ticketId")
    private String ticketId;
    @JsonProperty("externalTicketId")
    private String externalTicketId;
    @JsonProperty("externalTicketReference")
    private String externalTicketReference;
    @JsonProperty("status")
    private String status;
    @JsonProperty("salesDate")
    private String salesDate;
    @JsonProperty("productDescription")
    private String productDescription;
    @JsonProperty("productId")
    private String productId;
    @JsonProperty("travelDate")
    private String travelDate;
    @JsonProperty("tripType")
    private String tripType;
    @JsonProperty("qualityOfService")
    private String qualityOfService;
    @JsonProperty("passenger")
    private Passenger passenger;
    @JsonProperty("price")
    private Long price;
    @JsonProperty("vat")
    private Long vat;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("fareReference")
    private String fareReference;
    @JsonProperty("paymentMethodDetails")
    private PaymentMethodDetails paymentMethodDetails;
    @JsonProperty("refundData")
    private RefundData refundData;

    @JsonProperty("ticketId")
    public String getTicketId() {
        return ticketId;
    }

    @JsonProperty("ticketId")
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    @JsonProperty("externalTicketId")
    public String getExternalTicketId() {
        return externalTicketId;
    }

    @JsonProperty("externalTicketId")
    public void setExternalTicketId(String externalTicketId) {
        this.externalTicketId = externalTicketId;
    }

    @JsonProperty("externalTicketReference")
    public String getExternalTicketReference() {
        return externalTicketReference;
    }

    @JsonProperty("externalTicketReference")
    public void setExternalTicketReference(String externalTicketReference) {
        this.externalTicketReference = externalTicketReference;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("salesDate")
    public String getSalesDate() {
        return salesDate;
    }

    @JsonProperty("salesDate")
    public void setSalesDate(String salesDate) {
        this.salesDate = salesDate;
    }

    @JsonProperty("productDescription")
    public String getProductDescription() {
        return productDescription;
    }

    @JsonProperty("productDescription")
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @JsonProperty("productId")
    public String getProductId() {
        return productId;
    }

    @JsonProperty("productId")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @JsonProperty("travelDate")
    public String getTravelDate() {
        return travelDate;
    }

    @JsonProperty("travelDate")
    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    @JsonProperty("tripType")
    public String getTripType() {
        return tripType;
    }

    @JsonProperty("tripType")
    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    @JsonProperty("qualityOfService")
    public String getQualityOfService() {
        return qualityOfService;
    }

    @JsonProperty("qualityOfService")
    public void setQualityOfService(String qualityOfService) {
        this.qualityOfService = qualityOfService;
    }

    @JsonProperty("passenger")
    public Passenger getPassenger() {
        return passenger;
    }

    @JsonProperty("passenger")
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    @JsonProperty("price")
    public Long getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Long price) {
        this.price = price;
    }

    @JsonProperty("vat")
    public Long getVat() {
        return vat;
    }

    @JsonProperty("vat")
    public void setVat(Long vat) {
        this.vat = vat;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("fareReference")
    public String getFareReference() {
        return fareReference;
    }

    @JsonProperty("fareReference")
    public void setFareReference(String fareReference) {
        this.fareReference = fareReference;
    }

    @JsonProperty("paymentMethodDetails")
    public PaymentMethodDetails getPaymentMethodDetails() {
        return paymentMethodDetails;
    }

    @JsonProperty("paymentMethodDetails")
    public void setPaymentMethodDetails(PaymentMethodDetails paymentMethodDetails) {
        this.paymentMethodDetails = paymentMethodDetails;
    }

    @JsonProperty("refundData")
    public RefundData getRefundData() {
        return refundData;
    }

    @JsonProperty("refundData")
    public void setRefundData(RefundData refundData) {
        this.refundData = refundData;
    }

}