package com.microsoft.enigma.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class CandidateModel {

    @SerializedName("_id")
    @Expose
    private String id;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("qualifications")
    @Expose
    private List<String> qualifications = new ArrayList<>();

    @SerializedName("criminalRecord")
    @Expose
    private List<String> criminalRecord = new ArrayList<>();

    @SerializedName("party")
    @Expose
    private String party;

    @SerializedName("age")
    @Expose
    private long age;

    @SerializedName("constituency")
    @Expose
    private String constituency;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getQualifications() {
        return qualifications;
    }

    public void setQualifications(List<String> qualifications) {
        this.qualifications = qualifications;
    }

    public List<String> getCriminalRecord() {
        return criminalRecord;
    }

    public void setCriminalRecord(List<String> criminalRecord) {
        this.criminalRecord = criminalRecord;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getConstituency() {
        return constituency;
    }

    public void setConstituency(String constituency) {
        this.constituency = constituency;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
