
package model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Registrations implements Serializable
{

    @SerializedName("jurisdictionISOCode")
    @Expose
    private JurisdictionISOCode jurisdictionISOCode;
    private final static long serialVersionUID = -5855864850027623232L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Registrations() {
    }

    /**
     * 
     * @param jurisdictionISOCode
     */
    public Registrations(JurisdictionISOCode jurisdictionISOCode) {
        super();
        this.jurisdictionISOCode = jurisdictionISOCode;
    }

    public JurisdictionISOCode getJurisdictionISOCode() {
        return jurisdictionISOCode;
    }

    public void setJurisdictionISOCode(JurisdictionISOCode jurisdictionISOCode) {
        this.jurisdictionISOCode = jurisdictionISOCode;
    }

}
