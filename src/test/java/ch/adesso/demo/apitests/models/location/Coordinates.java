package ch.adesso.demo.apitests.models.location;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "latitude",
        "longitude"
})
public class Coordinates {

    @JsonProperty("latitude")
    private Float latitude;
    @JsonProperty("longitude")
    private Float longitude;

    @JsonProperty("latitude")
    public Float getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public Float getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

}