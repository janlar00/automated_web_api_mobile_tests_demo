package ch.demo.api.models.barcode;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "description",
        "productNumber",
        "qualityOfService",
        "reduced",
        "origin",
        "destination",
        "routeInformations",
        "fqCode",
        "direction",
        "validFromDate",
        "validToDate",
        "returnJourneyFromDate",
        "returnJourneyToDate",
        "customerSegment"
})
public class TariffInformation {

    @JsonProperty("description")
    private Description description;
    @JsonProperty("productNumber")
    private Integer productNumber;
    @JsonProperty("qualityOfService")
    private Integer qualityOfService;
    @JsonProperty("reduced")
    private Boolean reduced;
    @JsonProperty("origin")
    private Origin origin;
    @JsonProperty("destination")
    private Destination destination;
    @JsonProperty("routeInformations")
    private List<RouteInformation> routeInformations = null;
    @JsonProperty("fqCode")
    private String fqCode;
    @JsonProperty("direction")
    private String direction;
    @JsonProperty("validFromDate")
    private String validFromDate;
    @JsonProperty("validToDate")
    private String validToDate;
    @JsonProperty("returnJourneyFromDate")
    private String returnJourneyFromDate;
    @JsonProperty("returnJourneyToDate")
    private String returnJourneyToDate;
    @JsonProperty("customerSegment")
    private CustomerSegment customerSegment;

    /**
     * No args constructor for use in serialization
     *
     */
    public TariffInformation() {
    }

    /**
     *
     * @param origin
     * @param destination
     * @param description
     * @param reduced
     * @param productNumber
     * @param returnJourneyToDate
     * @param routeInformations
     * @param returnJourneyFromDate
     * @param customerSegment
     * @param validFromDate
     * @param qualityOfService
     * @param fqCode
     * @param validToDate
     * @param direction
     */
    public TariffInformation(Description description, Integer productNumber, Integer qualityOfService, Boolean reduced, Origin origin, Destination destination, List<RouteInformation> routeInformations, String fqCode, String direction, String validFromDate, String validToDate, String returnJourneyFromDate, String returnJourneyToDate, CustomerSegment customerSegment) {
        super();
        this.description = description;
        this.productNumber = productNumber;
        this.qualityOfService = qualityOfService;
        this.reduced = reduced;
        this.origin = origin;
        this.destination = destination;
        this.routeInformations = routeInformations;
        this.fqCode = fqCode;
        this.direction = direction;
        this.validFromDate = validFromDate;
        this.validToDate = validToDate;
        this.returnJourneyFromDate = returnJourneyFromDate;
        this.returnJourneyToDate = returnJourneyToDate;
        this.customerSegment = customerSegment;
    }

    public TariffInformation(final Description description, final int productNumber, final int qualityOfService, final boolean reduced, final Origin origin,
            final List<RouteInformation> routeInformations, final String s, final String outward,
            final String direction, final String validFromDate, final Destination destination, final String returnJourneyFromDate, final String returnJourneyToDate, final CustomerSegment customerSegment) {
        super();
        this.description = description;
        this.productNumber = productNumber;
        this.qualityOfService = qualityOfService;
        this.reduced = reduced;
        this.origin = origin;
        this.destination = destination;
        this.routeInformations = routeInformations;
        this.fqCode = fqCode;
        this.direction = direction;
        this.validFromDate = validFromDate;
        this.validToDate = validToDate;
        this.returnJourneyFromDate = returnJourneyFromDate;
        this.returnJourneyToDate = returnJourneyToDate;
        this.customerSegment = customerSegment;
    }

    @JsonProperty("description")
    public Description getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Description description) {
        this.description = description;
    }

    @JsonProperty("productNumber")
    public Integer getProductNumber() {
        return productNumber;
    }

    @JsonProperty("productNumber")
    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }

    @JsonProperty("qualityOfService")
    public Integer getQualityOfService() {
        return qualityOfService;
    }

    @JsonProperty("qualityOfService")
    public void setQualityOfService(Integer qualityOfService) {
        this.qualityOfService = qualityOfService;
    }

    @JsonProperty("reduced")
    public Boolean getReduced() {
        return reduced;
    }

    @JsonProperty("reduced")
    public void setReduced(Boolean reduced) {
        this.reduced = reduced;
    }

    @JsonProperty("origin")
    public Origin getOrigin() {
        return origin;
    }

    @JsonProperty("origin")
    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    @JsonProperty("destination")
    public Destination getDestination() {
        return destination;
    }

    @JsonProperty("destination")
    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    @JsonProperty("routeInformations")
    public List<RouteInformation> getRouteInformations() {
        return routeInformations;
    }

    @JsonProperty("routeInformations")
    public void setRouteInformations(List<RouteInformation> routeInformations) {
        this.routeInformations = routeInformations;
    }

    @JsonProperty("fqCode")
    public String getFqCode() {
        return fqCode;
    }

    @JsonProperty("fqCode")
    public void setFqCode(String fqCode) {
        this.fqCode = fqCode;
    }

    @JsonProperty("direction")
    public String getDirection() {
        return direction;
    }

    @JsonProperty("direction")
    public void setDirection(String direction) {
        this.direction = direction;
    }

    @JsonProperty("validFromDate")
    public String getValidFromDate() {
        return validFromDate;
    }

    @JsonProperty("validFromDate")
    public void setValidFromDate(String validFromDate) {
        this.validFromDate = validFromDate;
    }

    @JsonProperty("validToDate")
    public String getValidToDate() {
        return validToDate;
    }

    @JsonProperty("validToDate")
    public void setValidToDate(String validToDate) {
        this.validToDate = validToDate;
    }

    @JsonProperty("returnJourneyFromDate")
    public String getReturnJourneyFromDate() {
        return returnJourneyFromDate;
    }

    @JsonProperty("returnJourneyFromDate")
    public void setReturnJourneyFromDate(String returnJourneyFromDate) {
        this.returnJourneyFromDate = returnJourneyFromDate;
    }

    @JsonProperty("returnJourneyToDate")
    public String getReturnJourneyToDate() {
        return returnJourneyToDate;
    }

    @JsonProperty("returnJourneyToDate")
    public void setReturnJourneyToDate(String returnJourneyToDate) {
        this.returnJourneyToDate = returnJourneyToDate;
    }

    @JsonProperty("customerSegment")
    public CustomerSegment getCustomerSegment() {
        return customerSegment;
    }

    @JsonProperty("customerSegment")
    public void setCustomerSegment(CustomerSegment customerSegment) {
        this.customerSegment = customerSegment;
    }

}