package com.microsoft.enigma.models;

import java.util.Map;

public class UserModel {

    private static String id;
    private static String epicNumber;
    private static String name;
    private static String gender;
    private static String age;
    private static String fatherName;
    private static String state;
    private static String district;
    private static String assemblyConstituencyName;
    private static String assemblyConstituencyNumber;
    private static String parliamentaryConstituencyName;
    private static String pollingStationName;
    private static String pollingStationLocation;
    private static String partNumber;
    private static String partName;
    private static String serialNumber;
    private static String lastUpdatedOn;

    // When data is fetched from National Voter's Portal
    public static void populateBySignUp(Map<String, String> userDataMap) {
        id = userDataMap.get("id");
        epicNumber = userDataMap.get("epic_no");
        name = userDataMap.get("name");
        gender = userDataMap.get("gender");
        age = userDataMap.get("age");
        fatherName = userDataMap.get("rln_name");
        state = userDataMap.get("state");
        district = userDataMap.get("district");
        assemblyConstituencyName = userDataMap.get("ac_name");
        assemblyConstituencyNumber = userDataMap.get("ac_no");
        parliamentaryConstituencyName = userDataMap.get("pc_name");
        pollingStationName = userDataMap.get("ps_name");
        pollingStationLocation = userDataMap.get("ps_lat_long");
        partNumber = userDataMap.get("part_no");
        partName = userDataMap.get("part_name");
        serialNumber = userDataMap.get("slno_inpart");
        lastUpdatedOn = userDataMap.get("last_update");
    }

    // When data is fetched from node.js backend
    public static void populateByLogin(Map<String, String> userDataMap) {
    }

    public static String getId() {
        return id;
    }

    public static String getEpicNumber() {
        return epicNumber;
    }

    public static String getName() {
        return name;
    }

    public static String getGender() {
        return gender;
    }

    public static String getAge() {
        return age;
    }

    public static String getFatherName() {
        return fatherName;
    }

    public static String getState() {
        return state;
    }

    public static String getDistrict() {
        return district;
    }

    public static String getAssemblyConstituencyName() {
        return assemblyConstituencyName;
    }

    public static String getAssemblyConstituencyNumber() {
        return assemblyConstituencyNumber;
    }

    public static String getParliamentaryConstituencyName() {
        return parliamentaryConstituencyName;
    }

    public static String getPollingStationName() {
        return pollingStationName;
    }

    public static String getPollingStationLocation() {
        return pollingStationLocation;
    }

    public static String getPartNumber() {
        return partNumber;
    }

    public static String getPartName() {
        return partName;
    }

    public static String getSerialNumber() {
        return serialNumber;
    }

    public static String getLastUpdatedOn() {
        return lastUpdatedOn;
    }
}
