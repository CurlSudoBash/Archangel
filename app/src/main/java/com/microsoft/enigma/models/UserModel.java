package com.microsoft.enigma.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class UserModel {

    private static UserModel UserInstance;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("epicNumber")
    @Expose
    private String epicNumber;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("gender")
    @Expose
    private String gender;

    @SerializedName("age")
    @Expose
    private String age;

    @SerializedName("fatherName")
    @Expose
    private String fatherName;

    @SerializedName("state")
    @Expose
    private String state;

    @SerializedName("district")
    @Expose
    private String district;

    @SerializedName("assemblyConstituencyName")
    @Expose
    private String assemblyConstituencyName;

    @SerializedName("assemblyConstituencyNumber")
    @Expose
    private String assemblyConstituencyNumber;

    @SerializedName("parliamentaryConstituencyName")
    @Expose
    private String parliamentaryConstituencyName;

    @SerializedName("pollingStationName")
    @Expose
    private String pollingStationName;

    @SerializedName("pollingStationLocation")
    @Expose
    private String pollingStationLocation;

    @SerializedName("partNumber")
    @Expose
    private String partNumber;

    @SerializedName("partName")
    @Expose
    private String partName;

    @SerializedName("serialNumber")
    @Expose
    private String serialNumber;

    @SerializedName("lastUpdatedOn")
    @Expose
    private String lastUpdatedOn;


    public UserModel(String id, String epicNumber, String name, String gender, String age, String fatherName, String state, String district, String assemblyConstituencyName, String assemblyConstituencyNumber, String parliamentaryConstituencyName, String pollingStationName, String pollingStationLocation, String partNumber, String partName, String serialNumber, String lastUpdatedOn) {
        this.id = id;
        this.epicNumber = epicNumber;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.fatherName = fatherName;
        this.state = state;
        this.district = district;
        this.assemblyConstituencyName = assemblyConstituencyName;
        this.assemblyConstituencyNumber = assemblyConstituencyNumber;
        this.parliamentaryConstituencyName = parliamentaryConstituencyName;
        this.pollingStationName = pollingStationName;
        this.pollingStationLocation = pollingStationLocation;
        this.partNumber = partNumber;
        this.partName = partName;
        this.serialNumber = serialNumber;
        this.lastUpdatedOn = lastUpdatedOn;
    }

    // When data is fetched from National Voter's Portal
    public static void populateBySignUp(Map<String, String> userDataMap) {
        UserInstance = new UserModel(
            userDataMap.get("id"),
            userDataMap.get("epic_no"),
            userDataMap.get("name"),
            userDataMap.get("gender"),
            userDataMap.get("age"),
            userDataMap.get("rln_name"),
            userDataMap.get("state"),
            userDataMap.get("district"),
            userDataMap.get("ac_name"),
            userDataMap.get("ac_no"),
            userDataMap.get("pc_name"),
            userDataMap.get("ps_name"),
            userDataMap.get("ps_lat_long"),
            userDataMap.get("part_no"),
            userDataMap.get("part_name"),
            userDataMap.get("slno_inpart"),
            userDataMap.get("last_update")
        );
    }

    // When data is fetched from node.js backend
    public static void populateByLogin(UserModel user) {
        UserInstance = user;
    }

    public static UserModel getUserInstance() {
        return UserInstance;
    }

    public String getId() {
        return id;
    }

    public String getEpicNumber() {
        return epicNumber;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getState() {
        return state;
    }

    public String getDistrict() {
        return district;
    }

    public String getAssemblyConstituencyName() {
        return assemblyConstituencyName;
    }

    public String getAssemblyConstituencyNumber() {
        return assemblyConstituencyNumber;
    }

    public String getParliamentaryConstituencyName() {
        return parliamentaryConstituencyName;
    }

    public String getPollingStationName() {
        return pollingStationName;
    }

    public String getPollingStationLocation() {
        return pollingStationLocation;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartName() {
        return partName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public static void setUserInstance(UserModel userInstance) {
        UserInstance = userInstance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEpicNumber(String epicNumber) {
        this.epicNumber = epicNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setAssemblyConstituencyName(String assemblyConstituencyName) {
        this.assemblyConstituencyName = assemblyConstituencyName;
    }

    public void setAssemblyConstituencyNumber(String assemblyConstituencyNumber) {
        this.assemblyConstituencyNumber = assemblyConstituencyNumber;
    }

    public void setParliamentaryConstituencyName(String parliamentaryConstituencyName) {
        this.parliamentaryConstituencyName = parliamentaryConstituencyName;
    }

    public void setPollingStationName(String pollingStationName) {
        this.pollingStationName = pollingStationName;
    }

    public void setPollingStationLocation(String pollingStationLocation) {
        this.pollingStationLocation = pollingStationLocation;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setLastUpdatedOn(String lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }
}
