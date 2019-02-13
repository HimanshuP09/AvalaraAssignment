
package model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TaxOfficeDetails implements Serializable
{

    @SerializedName("name")
    @Expose
    private String name;
    private final static long serialVersionUID = -8604606856730121080L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TaxOfficeDetails() {
    }

    /**
     * 
     * @param name
     */
    public TaxOfficeDetails(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
