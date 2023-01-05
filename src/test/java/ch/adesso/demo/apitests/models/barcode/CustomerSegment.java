package ch.adesso.demo.apitests.models.barcode;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "de",
        "en",
        "fr",
        "it"
})
public class CustomerSegment {

    @JsonProperty("de")
    private String de;
    @JsonProperty("en")
    private String en;
    @JsonProperty("fr")
    private String fr;
    @JsonProperty("it")
    private String it;

    /**
     * No args constructor for use in serialization
     *
     */
    public CustomerSegment() {
    }

    /**
     *
     * @param de
     * @param en
     * @param it
     * @param fr
     */
    public CustomerSegment(String de, String en, String fr, String it) {
        super();
        this.de = de;
        this.en = en;
        this.fr = fr;
        this.it = it;
    }

    @JsonProperty("de")
    public String getDe() {
        return de;
    }

    @JsonProperty("de")
    public void setDe(String de) {
        this.de = de;
    }

    @JsonProperty("en")
    public String getEn() {
        return en;
    }

    @JsonProperty("en")
    public void setEn(String en) {
        this.en = en;
    }

    @JsonProperty("fr")
    public String getFr() {
        return fr;
    }

    @JsonProperty("fr")
    public void setFr(String fr) {
        this.fr = fr;
    }

    @JsonProperty("it")
    public String getIt() {
        return it;
    }

    @JsonProperty("it")
    public void setIt(String it) {
        this.it = it;
    }

}