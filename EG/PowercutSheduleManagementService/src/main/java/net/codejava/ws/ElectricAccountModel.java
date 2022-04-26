package net.codejava.ws;

import java.util.ArrayList;

public class ElectricAccountModel {
	
	String  district, province, address , fullName, telephoneNumber, NIC, GridArea, CurrentLineType ;

    public ElectricAccountModel(String district, String province, String address, String fullName, String telephoneNumber, String NIC, String GridArea, String CurrentLineType) {
        this.district = district;
        this.province = province;
        this.address = address;
        this.fullName = fullName;
        this.telephoneNumber = telephoneNumber;
        this.NIC = NIC;
        this.GridArea = GridArea;
        this.CurrentLineType = CurrentLineType;
    }

    public ElectricAccountModel() {
    }

    
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getGridArea() {
        return GridArea;
    }

    public void setGridArea(String GridArea) {
        this.GridArea = GridArea;
    }

    public String getCurrentLineType() {
        return CurrentLineType;
    }

    public void setCurrentLineType(String CurrentLineType) {
        this.CurrentLineType = CurrentLineType;
    }


	
	
	
}