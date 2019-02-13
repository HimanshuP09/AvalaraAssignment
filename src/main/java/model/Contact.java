
package model;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Contact implements Serializable
{

    @SerializedName("fullName")
    @Expose
    private String fullName;
    @SerializedName("attentionName")
    @Expose
    private String attentionName;
    @SerializedName("companyName")
    @Expose
    private String companyName;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("countryCode")
    @Expose
    private String countryCode;
    @SerializedName("phoneNumbers")
    @Expose
    private List<String> phoneNumbers = null;
    @SerializedName("emailAddresses")
    @Expose
    private Object emailAddresses;
    private final static long serialVersionUID = 3501003376652072879L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Contact() {
    }

    /**
     * 
     * @param attentionName
     * @param address
     * @param countryCode
     * @param phoneNumbers
     * @param fullName
     * @param companyName
     * @param emailAddresses
     */
    public Contact(String fullName, String attentionName, String companyName, Address address, String countryCode, List<String> phoneNumbers, Object emailAddresses) {
        super();
        this.fullName = fullName;
        this.attentionName = attentionName;
        this.companyName = companyName;
        this.address = address;
        this.countryCode = countryCode;
        this.phoneNumbers = phoneNumbers;
        this.emailAddresses = emailAddresses;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAttentionName() {
        return attentionName;
    }

    public void setAttentionName(String attentionName) {
        this.attentionName = attentionName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Object getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(Object emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

}
