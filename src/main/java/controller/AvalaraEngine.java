package controller;

import model.AvalaraJsonParser;
import model.JurisdictionData;
import model.JurisdictionISOCode;
import model.Registrations;
import utilities.FileHandlingUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class AvalaraEngine {

    public static void main(String[] args) {

        String sysdir = System.getProperty("user.dir").replace("\\","/");
        String FILENAME = "Seller-Json.json";
        String path = sysdir.concat("/src/main/resources/").concat(FILENAME);
        System.out.println(path);
        FileHandlingUtility fileHandlingUtility = new FileHandlingUtility();
        AvalaraJsonParser avalaraJsonParser = fileHandlingUtility.getAvalaraJson(path);
        System.out.println("AddressLine1: "+avalaraJsonParser.getContact().getAddress().getAddressLine1());
        System.out.println("PhoneNumbers: " + avalaraJsonParser.getContact().getPhoneNumbers());
        System.out.println("Total Juridiction Count: " + avalaraJsonParser.getRegistrations().getJurisdictionISOCode().getJurisdictionData().size());

        List<JurisdictionData> jurisdictionDataList = avalaraJsonParser.getRegistrations().getJurisdictionISOCode().getJurisdictionData();
        String pattern = "yyyy-MM-dd";
        String dateInString = new SimpleDateFormat(pattern).format(new Date());
        for(JurisdictionData jurisdictionData:jurisdictionDataList){
            System.out.println("***************************************************");
            System.out.println("Juridiction: " + jurisdictionData.getJurisdiction());
            System.out.println("Is Visa Country: " + jurisdictionData.isIsVISACountries());
            System.out.println("ECL Branch Number: " + jurisdictionData.getEclBranchNumber());
            System.out.println("Complete Juridiction Object: " + jurisdictionData);
            System.out.println("___________________________________________________________________________");
            System.out.println("VISA Registration Date Before: " + jurisdictionData.getVisaRegistrationDate());
            // Setting VISA Registration Date As Todays Date
            jurisdictionData.setVisaRegistrationDate(dateInString);
            System.out.println("VISA Registration Date After: " + jurisdictionData.getVisaRegistrationDate());

            try {
                // Setting Registration Date To One Month Behind
                Date registrationDate = new SimpleDateFormat(pattern).parse(jurisdictionData.getRegistrationDate());
                Calendar cal = Calendar.getInstance();
                cal.setTime(registrationDate);
                cal.add(Calendar.MONTH, -1);
                registrationDate = cal.getTime();
                jurisdictionData.setRegistrationDate(new SimpleDateFormat(pattern).format(registrationDate));
                System.out.println("Updated Registration Date: " + new SimpleDateFormat(pattern).format(registrationDate));
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Amazon Seller Key: " + avalaraJsonParser.getAmazonSellerKey());
        }

        JurisdictionISOCode jurisdictionISOCode = avalaraJsonParser.getRegistrations().getJurisdictionISOCode();
        jurisdictionISOCode.setJurisdictionData(jurisdictionDataList);
        Registrations registrations = avalaraJsonParser.getRegistrations();
        registrations.setJurisdictionISOCode(jurisdictionISOCode);
        avalaraJsonParser.setRegistrations(registrations);
        // Save tp File
        fileHandlingUtility.saveAvalaraJson(avalaraJsonParser, path);
        System.out.println(fileHandlingUtility.isFileNameHybrid(FILENAME));
    }
}
