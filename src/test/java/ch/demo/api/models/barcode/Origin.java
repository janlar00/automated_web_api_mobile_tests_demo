package ch.demo.api.models.barcode;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "uicCode",
        "name"
})
public class Origin {

    @JsonProperty("uicCode")
    private String uicCode;
    @JsonProperty("name")
    private String name;

    /**
     * No args constructor for use in serialization
     *
     */
    public Origin() {
    }

    /**
     *
     * @param uicCode
     * @param name
     */
    public Origin(String uicCode, String name) {
        super();
        this.uicCode = uicCode;
        this.name = name;
    }

    @JsonProperty("uicCode")
    public String getUicCode() {
        return uicCode;
    }

    @JsonProperty("uicCode")
    public void setUicCode(String uicCode) {
        this.uicCode = uicCode;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

}