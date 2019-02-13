
package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Address implements Serializable
{

    @SerializedName("addressLine1")
    @Expose
    private String addressLine1;
    @SerializedName("addressLine2")
    @Expose
    private String addressLine2;
    @SerializedName("addressLine3")
    @Expose
    private String addressLine3;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("stateOrRegion")
    @Expose
    private String stateOrRegion;
    @SerializedName("countyOrDistrict")
    @Expose
    private String countyOrDistrict;
    @SerializedName("postalCode")
    @Expose
    private String postalCode;
    @SerializedName("countryCode")
    @Expose
    private String countryCode;
    private final static long serialVersionUID = 7933572695880444714L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Address() {
    }

    /**
     * 
     * @param postalCode
     * @param countyOrDistrict
     * @param countryCode
     * @param stateOrRegion
     * @param addressLine3
     * @param addressLine2
     * @param addressLine1
     * @param city
     */
    public Address(String addressLine1, String addressLine2, String addressLine3, String city, String stateOrRegion, String countyOrDistrict, String postalCode, String countryCode) {
        super();
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.city = city;
        this.stateOrRegion = stateOrRegion;
        this.countyOrDistrict = countyOrDistrict;
        this.postalCode = postalCode;
        this.countryCode = countryCode;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateOrRegion() {
        return stateOrRegion;
    }

    public void setStateOrRegion(String stateOrRegion) {
        this.stateOrRegion = stateOrRegion;
    }

    public String getCountyOrDistrict() {
        return countyOrDistrict;
    }

    public void setCountyOrDistrict(String countyOrDistrict) {
        this.countyOrDistrict = countyOrDistrict;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

}
