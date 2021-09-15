package com.example.helloworld.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "organizationinfo")
public class OrganizationInfo {
    @Id
    private String contact;
    private String designation;
    private String employeeGroup;
    private String band;
    private String subBand;
    private String reportingManager;
    private String groupHorizontalBusinessUnit;
    private String horizontalBusinessUnit;
    private String superDeliveryUnit;
    private String deliveryUnit;
    private String personalArea;
    private String location;
    private String CWL;

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmployeeGroup() {
        return employeeGroup;
    }

    public void setEmployeeGroup(String employeeGroup) {
        this.employeeGroup = employeeGroup;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getSubBand() {
        return subBand;
    }

    public void setSubBand(String subBand) {
        this.subBand = subBand;
    }

    public String getReportingManager() {
        return reportingManager;
    }

    public void setReportingManager(String reportingManager) {
        this.reportingManager = reportingManager;
    }

    public String getGroupHorizontalBusinessUnit() {
        return groupHorizontalBusinessUnit;
    }

    public void setGroupHorizontalBusinessUnit(String groupHorizontalBusinessUnit) {
        this.groupHorizontalBusinessUnit = groupHorizontalBusinessUnit;
    }

    public String getHorizontalBusinessUnit() {
        return horizontalBusinessUnit;
    }

    public void setHorizontalBusinessUnit(String horizontalBusinessUnit) {
        this.horizontalBusinessUnit = horizontalBusinessUnit;
    }

    public String getSuperDeliveryUnit() {
        return superDeliveryUnit;
    }

    public void setSuperDeliveryUnit(String superDeliveryUnit) {
        this.superDeliveryUnit = superDeliveryUnit;
    }

    public String getDeliveryUnit() {
        return deliveryUnit;
    }

    public void setDeliveryUnit(String deliveryUnit) {
        this.deliveryUnit = deliveryUnit;
    }

    public String getPersonalArea() {
        return personalArea;
    }

    public void setPersonalArea(String personalArea) {
        this.personalArea = personalArea;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCWL() {
        return CWL;
    }

    public void setCWL(String CWL) {
        this.CWL = CWL;
    }

    @Override
    public String toString() {
        return "OrganizationInfo{" +
                "contact='" + contact + '\'' +
                ", designation='" + designation + '\'' +
                ", employeeGroup='" + employeeGroup + '\'' +
                ", band='" + band + '\'' +
                ", subBand='" + subBand + '\'' +
                ", reportingManager='" + reportingManager + '\'' +
                ", groupHorizontalBusinessUnit='" + groupHorizontalBusinessUnit + '\'' +
                ", horizontalBusinessUnit='" + horizontalBusinessUnit + '\'' +
                ", superDeliveryUnit='" + superDeliveryUnit + '\'' +
                ", deliveryUnit='" + deliveryUnit + '\'' +
                ", personalArea='" + personalArea + '\'' +
                ", location='" + location + '\'' +
                ", CWL='" + CWL + '\'' +
                '}';
    }
}
