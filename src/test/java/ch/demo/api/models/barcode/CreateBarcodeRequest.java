package ch.demo.api.models.barcode;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "originalSystem",
        "originalId",
        "tariffInformation",
        "passengerInformations",
        "additionalInformation",
        "modeOfTransportInformations",
        "specimen"
})
public class CreateBarcodeRequest {

    @JsonProperty("originalSystem")
    private String originalSystem;
    @JsonProperty("originalId")
    private String originalId;
    @JsonProperty("tariffInformation")
    private TariffInformation tariffInformation;
    @JsonProperty("passengerInformations")
    private List<PassengerInformation> passengerInformations = null;
    @JsonProperty("additionalInformation")
    private String additionalInformation;
    @JsonProperty("modeOfTransportInformations")
    private List<ModeOfTransportInformation> modeOfTransportInformations = null;
    @JsonProperty("specimen")
    private Boolean specimen;

    /**
     * No args constructor for use in serialization
     *
     */
    public CreateBarcodeRequest() {
    }

    /**
     *
     * @param additionalInformation
     * @param passengerInformations
     * @param specimen
     * @param originalId
     * @param modeOfTransportInformations
     * @param originalSystem
     * @param tariffInformation
     */
    public CreateBarcodeRequest(String originalSystem, String originalId, TariffInformation tariffInformation, List<PassengerInformation> passengerInformations, String additionalInformation, List<ModeOfTransportInformation> modeOfTransportInformations, Boolean specimen) {
        super();
        this.originalSystem = originalSystem;
        this.originalId = originalId;
        this.tariffInformation = tariffInformation;
        this.passengerInformations = passengerInformations;
        this.additionalInformation = additionalInformation;
        this.modeOfTransportInformations = modeOfTransportInformations;
        this.specimen = specimen;
    }

    @JsonProperty("originalSystem")
    public String getOriginalSystem() {
        return originalSystem;
    }

    @JsonProperty("originalSystem")
    public void setOriginalSystem(String originalSystem) {
        this.originalSystem = originalSystem;
    }

    @JsonProperty("originalId")
    public String getOriginalId() {
        return originalId;
    }

    @JsonProperty("originalId")
    public void setOriginalId(String originalId) {
        this.originalId = originalId;
    }

    @JsonProperty("tariffInformation")
    public TariffInformation getTariffInformation() {
        return tariffInformation;
    }

    @JsonProperty("tariffInformation")
    public void setTariffInformation(TariffInformation tariffInformation) {
        this.tariffInformation = tariffInformation;
    }

    @JsonProperty("passengerInformations")
    public List<PassengerInformation> getPassengerInformations() {
        return passengerInformations;
    }

    @JsonProperty("passengerInformations")
    public void setPassengerInformations(List<PassengerInformation> passengerInformations) {
        this.passengerInformations = passengerInformations;
    }

    @JsonProperty("additionalInformation")
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    @JsonProperty("additionalInformation")
    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    @JsonProperty("modeOfTransportInformations")
    public List<ModeOfTransportInformation> getModeOfTransportInformations() {
        return modeOfTransportInformations;
    }

    @JsonProperty("modeOfTransportInformations")
    public void setModeOfTransportInformations(List<ModeOfTransportInformation> modeOfTransportInformations) {
        this.modeOfTransportInformations = modeOfTransportInformations;
    }

    @JsonProperty("specimen")
    public Boolean getSpecimen() {
        return specimen;
    }

    @JsonProperty("specimen")
    public void setSpecimen(Boolean specimen) {
        this.specimen = specimen;
    }

}