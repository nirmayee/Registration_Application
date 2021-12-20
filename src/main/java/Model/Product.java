/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import javax.swing.Icon;

/**
 *
 * @author nemod
 */
public class Product {
    
    private String name;
    private String geographicdata;
    private Date date;
    private Long telephone;
    private Long fax;
    private String email;
    private Long ssn;
    private Long medicalnumber;
    private Long healthplannumber;         
    private String bankaccount;
    private String license;             // should include characters and letter
    private String vehicleidentifier;  // should include characters and letter
    private String deviceidentifiers;  // should include characters and letter
    private String linkedIn;           // should include characters and letter
    private String ipaddress;           
    private Icon filename;
    private String uniquecode;            // should include characters and letter
    

    public Icon getFilename() {
        return filename;
    }

    public void setFilename(Icon filename) {
        this.filename = filename;
    }
      
    
      public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    //getter and setter Alt + Insert 
   //

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

      public String getDeviceidentifiers() {
        return deviceidentifiers;
    }

    public void setDeviceidentifiers(String deviceidentifiers) {
        this.deviceidentifiers = deviceidentifiers;
    }
    
    public String getGeographicdata() {
        return geographicdata;
    }

    public void setGeographicdata(String geographicdata) {
        this.geographicdata = geographicdata;
    }

    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }

    public Long getFax() {
        return fax;
    }

    public void setFax(Long fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getSsn() {
        return ssn;
    }

    public void setSsn(Long ssn) {
        this.ssn = ssn;
    }

    public Long getMedicalnumber() {
        return medicalnumber;
    }

    public void setMedicalnumber(Long medicalnumber) {
        this.medicalnumber = medicalnumber;
    }

    public Long getHealthplannumber() {
        return healthplannumber;
    }

    public void setHealthplannumber(Long healthplannumber) {
        this.healthplannumber = healthplannumber;
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getVehicleidentifier() {
        return vehicleidentifier;
    }

    public void setVehicleidentifier(String vehicleidentifier) {
        this.vehicleidentifier = vehicleidentifier;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public String getUniquecode() {
        return uniquecode;
    }

    public void setUniquecode(String uniquecode) {
        this.uniquecode = uniquecode;
    }
            
    
}
