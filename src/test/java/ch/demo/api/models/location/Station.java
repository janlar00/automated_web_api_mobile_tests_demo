package ch.demo.api.models.location;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "countryCode",
        "name",
        "stationType",
        "coordinates",
        "tariffBorder",
        "weight",
        "vehicleTypes"
})
public class Station {

    @JsonProperty("id")
    private Id id;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("name")
    private String name;
    @JsonProperty("stationType")
    private String stationType;
    @JsonProperty("coordinates")
    private Coordinates coordinates;
    @JsonProperty("tariffBorder")
    private Boolean tariffBorder;
    @JsonProperty("weight")
    private Long weight;
    @JsonProperty("vehicleTypes")
    private List<String> vehicleTypes = null;

    @JsonProperty("id")
    public Id getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Id id) {
        this.id = id;
    }

    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("stationType")
    public String getStationType() {
        return stationType;
    }

    @JsonProperty("stationType")
    public void setStationType(String stationType) {
        this.stationType = stationType;
    }

    @JsonProperty("coordinates")
    public Coordinates getCoordinates() {
        return coordinates;
    }

    @JsonProperty("coordinates")
    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    @JsonProperty("tariffBorder")
    public Boolean getTariffBorder() {
        return tariffBorder;
    }

    @JsonProperty("tariffBorder")
    public void setTariffBorder(Boolean tariffBorder) {
        this.tariffBorder = tariffBorder;
    }

    @JsonProperty("weight")
    public Long getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Long weight) {
        this.weight = weight;
    }

    @JsonProperty("vehicleTypes")
    public List<String> getVehicleTypes() {
        return vehicleTypes;
    }

    @JsonProperty("vehicleTypes")
    public void setVehicleTypes(List<String> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

}