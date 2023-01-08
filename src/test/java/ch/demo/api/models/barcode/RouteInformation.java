package ch.demo.api.models.barcode;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "description"
})
public class RouteInformation {

    @JsonProperty("description")
    private Description__1 description;

    /**
     * No args constructor for use in serialization
     *
     */
    public RouteInformation() {
    }

    /**
     *
     * @param description
     */
    public RouteInformation(Description__1 description) {
        super();
        this.description = description;
    }

    @JsonProperty("description")
    public Description__1 getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Description__1 description) {
        this.description = description;
    }

}