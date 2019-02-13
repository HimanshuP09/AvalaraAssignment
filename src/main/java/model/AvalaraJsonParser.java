
package model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AvalaraJsonParser implements Serializable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("contact")
    @Expose
    private Contact contact;
    @SerializedName("businessType")
    @Expose
    private String businessType;
    @SerializedName("registrations")
    @Expose
    private Registrations registrations;
    @SerializedName("createdDate")
    @Expose
    private String createdDate;
    @SerializedName("isTestSeller")
    @Expose
    private boolean isTestSeller;
    @SerializedName("amazonSellerId")
    @Expose
    private String amazonSellerId;
    @SerializedName("amazonSellerKey")
    @Expose
    private String amazonSellerKey;
    private final static long serialVersionUID = -6509951059954330025L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AvalaraJsonParser() {
    }

    /**
     * 
     * @param isTestSeller
     * @param name
     * @param amazonSellerKey
     * @param registrations
     * @param businessType
     * @param createdDate
     * @param contact
     * @param amazonSellerId
     */
    public AvalaraJsonParser(String name, Contact contact, String businessType, Registrations registrations, String createdDate, boolean isTestSeller, String amazonSellerId, String amazonSellerKey) {
        super();
        this.name = name;
        this.contact = contact;
        this.businessType = businessType;
        this.registrations = registrations;
        this.createdDate = createdDate;
        this.isTestSeller = isTestSeller;
        this.amazonSellerId = amazonSellerId;
        this.amazonSellerKey = amazonSellerKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public Registrations getRegistrations() {
        return registrations;
    }

    public void setRegistrations(Registrations registrations) {
        this.registrations = registrations;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isIsTestSeller() {
        return isTestSeller;
    }

    public void setIsTestSeller(boolean isTestSeller) {
        this.isTestSeller = isTestSeller;
    }

    public String getAmazonSellerId() {
        return amazonSellerId;
    }

    public void setAmazonSellerId(String amazonSellerId) {
        this.amazonSellerId = amazonSellerId;
    }

    public String getAmazonSellerKey() {
        return amazonSellerKey;
    }

    public void setAmazonSellerKey(String amazonSellerKey) {
        this.amazonSellerKey = amazonSellerKey;
    }

}
