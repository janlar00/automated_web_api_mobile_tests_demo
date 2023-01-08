package ch.demo.api.models.location;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "value",
        "type",
        "externalId"
})
public class Id {

    @JsonProperty("value")
    private String value;
    @JsonProperty("type")
    private String type;
    @JsonProperty("externalId")
    private Object externalId;

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("externalId")
    public Object getExternalId() {
        return externalId;
    }

    @JsonProperty("externalId")
    public void setExternalId(Object externalId) {
        this.externalId = externalId;
    }

}