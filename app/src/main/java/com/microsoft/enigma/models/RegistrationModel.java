package com.microsoft.enigma.models;

public class RegistrationModel {

    public final String electionId;
    public final String epicNumber;
    public final String constituency;

    public RegistrationModel(String electionId, String epicNumber, String constituency) {
        this.electionId = electionId;
        this.epicNumber = epicNumber;
        this.constituency = constituency;
    }
}
