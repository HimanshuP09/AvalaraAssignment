
package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class TaxOffice implements Serializable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("address")
    @Expose
    private Address address;
    private final static long serialVersionUID = -7857954190264683901L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TaxOffice() {
    }

    /**
     * 
     * @param address
     * @param name
     */
    public TaxOffice(String name, Address address) {
        super();
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
