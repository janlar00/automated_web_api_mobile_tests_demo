package ch.demo.api.models.barcode;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "lastname",
        "firstname",
        "dateOfBirth",
        "reductionDescription",
        "customerNumber",
        "mobileNumber"
})
public class PassengerInformation {

    @JsonProperty("lastname")
    private String lastname;
    @JsonProperty("firstname")
    private String firstname;
    @JsonProperty("dateOfBirth")
    private String dateOfBirth;
    @JsonProperty("reductionDescription")
    private String reductionDescription;
    @JsonProperty("customerNumber")
    private String customerNumber;
    @JsonProperty("mobileNumber")
    private String mobileNumber;

    /**
     * No args constructor for use in serialization
     *
     */
    public PassengerInformation() {
    }

    /**
     *
     * @param reductionDescription
     * @param firstname
     * @param mobileNumber
     * @param dateOfBirth
     * @param customerNumber
     * @param lastname
     */
    public PassengerInformation(String lastname, String firstname, String dateOfBirth, String reductionDescription, String customerNumber, String mobileNumber) {
        super();
        this.lastname = lastname;
        this.firstname = firstname;
        this.dateOfBirth = dateOfBirth;
        this.reductionDescription = reductionDescription;
        this.customerNumber = customerNumber;
        this.mobileNumber = mobileNumber;
    }

    @JsonProperty("lastname")
    public String getLastname() {
        return lastname;
    }

    @JsonProperty("lastname")
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @JsonProperty("firstname")
    public String getFirstname() {
        return firstname;
    }

    @JsonProperty("firstname")
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @JsonProperty("dateOfBirth")
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @JsonProperty("dateOfBirth")
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @JsonProperty("reductionDescription")
    public String getReductionDescription() {
        return reductionDescription;
    }

    @JsonProperty("reductionDescription")
    public void setReductionDescription(String reductionDescription) {
        this.reductionDescription = reductionDescription;
    }

    @JsonProperty("customerNumber")
    public String getCustomerNumber() {
        return customerNumber;
    }

    @JsonProperty("customerNumber")
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    @JsonProperty("mobileNumber")
    public String getMobileNumber() {
        return mobileNumber;
    }

    @JsonProperty("mobileNumber")
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

}