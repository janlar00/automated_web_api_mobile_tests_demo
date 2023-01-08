package ch.demo.api.models.barcode;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "courseNumber",
        "carNumber",
        "placeNumbers",
        "modeOfTransportCategory"
})
public class ModeOfTransportInformation {

    @JsonProperty("courseNumber")
    private String courseNumber;
    @JsonProperty("carNumber")
    private String carNumber;
    @JsonProperty("placeNumbers")
    private List<String> placeNumbers = null;
    @JsonProperty("modeOfTransportCategory")
    private String modeOfTransportCategory;

    /**
     * No args constructor for use in serialization
     *
     */
    public ModeOfTransportInformation() {
    }

    /**
     *
     * @param carNumber
     * @param placeNumbers
     * @param courseNumber
     * @param modeOfTransportCategory
     */
    public ModeOfTransportInformation(String courseNumber, String carNumber, List<String> placeNumbers, String modeOfTransportCategory) {
        super();
        this.courseNumber = courseNumber;
        this.carNumber = carNumber;
        this.placeNumbers = placeNumbers;
        this.modeOfTransportCategory = modeOfTransportCategory;
    }

    @JsonProperty("courseNumber")
    public String getCourseNumber() {
        return courseNumber;
    }

    @JsonProperty("courseNumber")
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    @JsonProperty("carNumber")
    public String getCarNumber() {
        return carNumber;
    }

    @JsonProperty("carNumber")
    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @JsonProperty("placeNumbers")
    public List<String> getPlaceNumbers() {
        return placeNumbers;
    }

    @JsonProperty("placeNumbers")
    public void setPlaceNumbers(List<String> placeNumbers) {
        this.placeNumbers = placeNumbers;
    }

    @JsonProperty("modeOfTransportCategory")
    public String getModeOfTransportCategory() {
        return modeOfTransportCategory;
    }

    @JsonProperty("modeOfTransportCategory")
    public void setModeOfTransportCategory(String modeOfTransportCategory) {
        this.modeOfTransportCategory = modeOfTransportCategory;
    }

}