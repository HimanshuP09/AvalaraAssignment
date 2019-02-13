
package model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FilingFrequencies implements Serializable
{

    @SerializedName("vatReturn")
    @Expose
    private long vatReturn;
    @SerializedName("vatMonthlyPayment")
    @Expose
    private Object vatMonthlyPayment;
    @SerializedName("ecl")
    @Expose
    private long ecl;
    @SerializedName("intrastatAcquisitions")
    @Expose
    private long intrastatAcquisitions;
    @SerializedName("intrastatDispatches")
    @Expose
    private long intrastatDispatches;
    private final static long serialVersionUID = -4124754375046427146L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FilingFrequencies() {
    }

    /**
     * 
     * @param ecl
     * @param vatReturn
     * @param intrastatDispatches
     * @param intrastatAcquisitions
     * @param vatMonthlyPayment
     */
    public FilingFrequencies(long vatReturn, Object vatMonthlyPayment, long ecl, long intrastatAcquisitions, long intrastatDispatches) {
        super();
        this.vatReturn = vatReturn;
        this.vatMonthlyPayment = vatMonthlyPayment;
        this.ecl = ecl;
        this.intrastatAcquisitions = intrastatAcquisitions;
        this.intrastatDispatches = intrastatDispatches;
    }

    public long getVatReturn() {
        return vatReturn;
    }

    public void setVatReturn(long vatReturn) {
        this.vatReturn = vatReturn;
    }

    public Object getVatMonthlyPayment() {
        return vatMonthlyPayment;
    }

    public void setVatMonthlyPayment(Object vatMonthlyPayment) {
        this.vatMonthlyPayment = vatMonthlyPayment;
    }

    public long getEcl() {
        return ecl;
    }

    public void setEcl(long ecl) {
        this.ecl = ecl;
    }

    public long getIntrastatAcquisitions() {
        return intrastatAcquisitions;
    }

    public void setIntrastatAcquisitions(long intrastatAcquisitions) {
        this.intrastatAcquisitions = intrastatAcquisitions;
    }

    public long getIntrastatDispatches() {
        return intrastatDispatches;
    }

    public void setIntrastatDispatches(long intrastatDispatches) {
        this.intrastatDispatches = intrastatDispatches;
    }

}
