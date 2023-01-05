package ch.adesso.demo.apitests.models.location;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "stations",
        "nextPageAvailable",
        "hasNextPage"
})
public class LocationResponse {

    @JsonProperty("stations")
    private List<Station> stations = null;
    @JsonProperty("nextPageAvailable")
    private Boolean nextPageAvailable;
    @JsonProperty("hasNextPage")
    private Boolean hasNextPage;

    @JsonProperty("stations")
    public List<Station> getStations() {
        return stations;
    }

    @JsonProperty("stations")
    public void setStations(List<Station> stations) {
        this.stations = stations;
    }

    @JsonProperty("nextPageAvailable")
    public Boolean getNextPageAvailable() {
        return nextPageAvailable;
    }

    @JsonProperty("nextPageAvailable")
    public void setNextPageAvailable(Boolean nextPageAvailable) {
        this.nextPageAvailable = nextPageAvailable;
    }

    @JsonProperty("hasNextPage")
    public Boolean getHasNextPage() {
        return hasNextPage;
    }

    @JsonProperty("hasNextPage")
    public void setHasNextPage(Boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

}