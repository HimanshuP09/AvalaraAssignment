
package model;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JurisdictionISOCode implements Serializable
{

    @SerializedName("jurisdictionData")
    @Expose
    private List<JurisdictionData> jurisdictionData = null;
    private final static long serialVersionUID = 8818432507758820531L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public JurisdictionISOCode() {
    }

    /**
     * 
     * @param jurisdictionData
     */
    public JurisdictionISOCode(List<JurisdictionData> jurisdictionData) {
        super();
        this.jurisdictionData = jurisdictionData;
    }

    public List<JurisdictionData> getJurisdictionData() {
        return jurisdictionData;
    }

    public void setJurisdictionData(List<JurisdictionData> jurisdictionData) {
        this.jurisdictionData = jurisdictionData;
    }

}
