package ch.demo.api.models.barcode;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "png",
        "raw",
        "barcodeId"
})
public class CreateBarcodeResponse {

    @JsonProperty("png")
    private String png;
    @JsonProperty("raw")
    private String raw;
    @JsonProperty("barcodeId")
    private String barcodeId;

    /**
     * No args constructor for use in serialization
     *
     */
    public CreateBarcodeResponse() {
    }

    /**
     *
     * @param png
     * @param raw
     * @param barcodeId
     */
    public CreateBarcodeResponse(String png, String raw, String barcodeId) {
        super();
        this.png = png;
        this.raw = raw;
        this.barcodeId = barcodeId;
    }

    @JsonProperty("png")
    public String getPng() {
        return png;
    }

    @JsonProperty("png")
    public void setPng(String png) {
        this.png = png;
    }

    @JsonProperty("raw")
    public String getRaw() {
        return raw;
    }

    @JsonProperty("raw")
    public void setRaw(String raw) {
        this.raw = raw;
    }

    @JsonProperty("barcodeId")
    public String getBarcodeId() {
        return barcodeId;
    }

    @JsonProperty("barcodeId")
    public void setBarcodeId(String barcodeId) {
        this.barcodeId = barcodeId;
    }

}