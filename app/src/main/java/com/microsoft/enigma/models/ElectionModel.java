package com.microsoft.enigma.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ElectionModel {

    @SerializedName("_id")
    @Expose
    private String id;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("candidates")
    @Expose
    private List<CandidateModel> candidates = new ArrayList<>();

    @SerializedName("voterRegistrationStartTime")
    @Expose
    private String voterRegistrationStartTime;

    @SerializedName("voterRegistrationStopTime")
    @Expose
    private String voterRegistrationStopTime;

    @SerializedName("pollingStartTime")
    @Expose
    private String pollingStartTime;

    @SerializedName("pollingEndTime")
    @Expose
    private String pollingEndTime;

    @SerializedName("authenticationAddress")
    @Expose
    private String authenticationAddress;

    @SerializedName("votingAddress")
    @Expose
    private String votingAddress;

    @SerializedName("description")
    @Expose
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoterRegistrationStartTime() {
        return voterRegistrationStartTime;
    }

    public void setVoterRegistrationStartTime(String voterRegistrationStartTime) {
        this.voterRegistrationStartTime = voterRegistrationStartTime;
    }

    public String getVoterRegistrationStopTime() {
        return voterRegistrationStopTime;
    }

    public void setVoterRegistrationStopTime(String voterRegistrationStopTime) {
        this.voterRegistrationStopTime = voterRegistrationStopTime;
    }

    public String getPollingStartTime() {
        return pollingStartTime;
    }

    public void setPollingStartTime(String pollingStartTime) {
        this.pollingStartTime = pollingStartTime;
    }

    public String getPollingEndTime() {
        return pollingEndTime;
    }

    public void setPollingEndTime(String pollingEndTime) {
        this.pollingEndTime = pollingEndTime;
    }

    public String getAuthenticationAddress() {
        return authenticationAddress;
    }

    public void setAuthenticationAddress(String authenticationAddress) {
        this.authenticationAddress = authenticationAddress;
    }

    public String getVotingAddress() {
        return votingAddress;
    }

    public void setVotingAddress(String votingAddress) {
        this.votingAddress = votingAddress;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<CandidateModel> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<CandidateModel> candidates) {
        this.candidates = candidates;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
