
package model;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JurisdictionData implements Serializable
{

    @SerializedName("jurisdiction")
    @Expose
    private String jurisdiction;
    @SerializedName("vatNumber")
    @Expose
    private String vatNumber;
    @SerializedName("registrationDate")
    @Expose
    private String registrationDate;
    @SerializedName("visaRegistrationDate")
    @Expose
    private String visaRegistrationDate;
    @SerializedName("staggerGroup")
    @Expose
    private Object staggerGroup;
    @SerializedName("filingFrequencies")
    @Expose
    private FilingFrequencies filingFrequencies;
    @SerializedName("taxOfficeDetails")
    @Expose
    private TaxOfficeDetails taxOfficeDetails;
    @SerializedName("activityCode")
    @Expose
    private String activityCode;
    @SerializedName("periodStart")
    @Expose
    private String periodStart;
    @SerializedName("periodEnd")
    @Expose
    private String periodEnd;
    @SerializedName("isIntrastatDThresholdReached")
    @Expose
    private boolean isIntrastatDThresholdReached;
    @SerializedName("isIntrastatAThresholdReached")
    @Expose
    private boolean isIntrastatAThresholdReached;
    @SerializedName("isECLThresholdReached")
    @Expose
    private boolean isECLThresholdReached;
    @SerializedName("isVISACountries")
    @Expose
    private boolean isVISACountries;
    @SerializedName("paymentInfoID")
    @Expose
    private long paymentInfoID;
    @SerializedName("importRegime")
    @Expose
    private List<String> importRegime = null;
    @SerializedName("authorisedTaxOffice")
    @Expose
    private String authorisedTaxOffice;
    @SerializedName("taxOfficeCode")
    @Expose
    private String taxOfficeCode;
    @SerializedName("eclRegistrationId")
    @Expose
    private String eclRegistrationId;
    @SerializedName("eclTransmissionId")
    @Expose
    private String eclTransmissionId;
    @SerializedName("taxId")
    @Expose
    private String taxId;
    @SerializedName("login")
    @Expose
    private Login login;
    @SerializedName("taxOffice")
    @Expose
    private TaxOffice taxOffice;
    @SerializedName("eclBranchNumber")
    @Expose
    private String eclBranchNumber;
    private final static long serialVersionUID = 3511623379384026384L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public JurisdictionData() {
    }

    /**
     * 
     * @param activityCode
     * @param eclRegistrationId
     * @param periodStart
     * @param eclTransmissionId
     * @param jurisdiction
     * @param isECLThresholdReached
     * @param eclBranchNumber
     * @param importRegime
     * @param taxOfficeDetails
     * @param isIntrastatDThresholdReached
     * @param isIntrastatAThresholdReached
     * @param taxOfficeCode
     * @param paymentInfoID
     * @param isVISACountries
     * @param registrationDate
     * @param authorisedTaxOffice
     * @param taxId
     * @param periodEnd
     * @param filingFrequencies
     * @param taxOffice
     * @param login
     * @param visaRegistrationDate
     * @param vatNumber
     * @param staggerGroup
     */
    public JurisdictionData(String jurisdiction, String vatNumber, String registrationDate, String visaRegistrationDate, Object staggerGroup, FilingFrequencies filingFrequencies, TaxOfficeDetails taxOfficeDetails, String activityCode, String periodStart, String periodEnd, boolean isIntrastatDThresholdReached, boolean isIntrastatAThresholdReached, boolean isECLThresholdReached, boolean isVISACountries, long paymentInfoID, List<String> importRegime, String authorisedTaxOffice, String taxOfficeCode, String eclRegistrationId, String eclTransmissionId, String taxId, Login login, TaxOffice taxOffice, String eclBranchNumber) {
        super();
        this.jurisdiction = jurisdiction;
        this.vatNumber = vatNumber;
        this.registrationDate = registrationDate;
        this.visaRegistrationDate = visaRegistrationDate;
        this.staggerGroup = staggerGroup;
        this.filingFrequencies = filingFrequencies;
        this.taxOfficeDetails = taxOfficeDetails;
        this.activityCode = activityCode;
        this.periodStart = periodStart;
        this.periodEnd = periodEnd;
        this.isIntrastatDThresholdReached = isIntrastatDThresholdReached;
        this.isIntrastatAThresholdReached = isIntrastatAThresholdReached;
        this.isECLThresholdReached = isECLThresholdReached;
        this.isVISACountries = isVISACountries;
        this.paymentInfoID = paymentInfoID;
        this.importRegime = importRegime;
        this.authorisedTaxOffice = authorisedTaxOffice;
        this.taxOfficeCode = taxOfficeCode;
        this.eclRegistrationId = eclRegistrationId;
        this.eclTransmissionId = eclTransmissionId;
        this.taxId = taxId;
        this.login = login;
        this.taxOffice = taxOffice;
        this.eclBranchNumber = eclBranchNumber;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getVisaRegistrationDate() {
        return visaRegistrationDate;
    }

    public void setVisaRegistrationDate(String visaRegistrationDate) {
        this.visaRegistrationDate = visaRegistrationDate;
    }

    public Object getStaggerGroup() {
        return staggerGroup;
    }

    public void setStaggerGroup(Object staggerGroup) {
        this.staggerGroup = staggerGroup;
    }

    public FilingFrequencies getFilingFrequencies() {
        return filingFrequencies;
    }

    public void setFilingFrequencies(FilingFrequencies filingFrequencies) {
        this.filingFrequencies = filingFrequencies;
    }

    public TaxOfficeDetails getTaxOfficeDetails() {
        return taxOfficeDetails;
    }

    public void setTaxOfficeDetails(TaxOfficeDetails taxOfficeDetails) {
        this.taxOfficeDetails = taxOfficeDetails;
    }

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public String getPeriodStart() {
        return periodStart;
    }

    public void setPeriodStart(String periodStart) {
        this.periodStart = periodStart;
    }

    public String getPeriodEnd() {
        return periodEnd;
    }

    public void setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
    }

    public boolean isIsIntrastatDThresholdReached() {
        return isIntrastatDThresholdReached;
    }

    public void setIsIntrastatDThresholdReached(boolean isIntrastatDThresholdReached) {
        this.isIntrastatDThresholdReached = isIntrastatDThresholdReached;
    }

    public boolean isIsIntrastatAThresholdReached() {
        return isIntrastatAThresholdReached;
    }

    public void setIsIntrastatAThresholdReached(boolean isIntrastatAThresholdReached) {
        this.isIntrastatAThresholdReached = isIntrastatAThresholdReached;
    }

    public boolean isIsECLThresholdReached() {
        return isECLThresholdReached;
    }

    public void setIsECLThresholdReached(boolean isECLThresholdReached) {
        this.isECLThresholdReached = isECLThresholdReached;
    }

    public boolean isIsVISACountries() {
        return isVISACountries;
    }

    public void setIsVISACountries(boolean isVISACountries) {
        this.isVISACountries = isVISACountries;
    }

    public long getPaymentInfoID() {
        return paymentInfoID;
    }

    public void setPaymentInfoID(long paymentInfoID) {
        this.paymentInfoID = paymentInfoID;
    }

    public List<String> getImportRegime() {
        return importRegime;
    }

    public void setImportRegime(List<String> importRegime) {
        this.importRegime = importRegime;
    }

    public String getAuthorisedTaxOffice() {
        return authorisedTaxOffice;
    }

    public void setAuthorisedTaxOffice(String authorisedTaxOffice) {
        this.authorisedTaxOffice = authorisedTaxOffice;
    }

    public String getTaxOfficeCode() {
        return taxOfficeCode;
    }

    public void setTaxOfficeCode(String taxOfficeCode) {
        this.taxOfficeCode = taxOfficeCode;
    }

    public String getEclRegistrationId() {
        return eclRegistrationId;
    }

    public void setEclRegistrationId(String eclRegistrationId) {
        this.eclRegistrationId = eclRegistrationId;
    }

    public String getEclTransmissionId() {
        return eclTransmissionId;
    }

    public void setEclTransmissionId(String eclTransmissionId) {
        this.eclTransmissionId = eclTransmissionId;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public TaxOffice getTaxOffice() {
        return taxOffice;
    }

    public void setTaxOffice(TaxOffice taxOffice) {
        this.taxOffice = taxOffice;
    }

    public String getEclBranchNumber() {
        return eclBranchNumber;
    }

    public void setEclBranchNumber(String eclBranchNumber) {
        this.eclBranchNumber = eclBranchNumber;
    }

}
