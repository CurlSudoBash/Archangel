package com.microsoft.enigma.models;

public class VoteModel {

    public final String candidate;
    public final String voter;

    public VoteModel(String candidate, String voter) {
        this.candidate = candidate;
        this.voter = voter;
    }
}
