package br.com.mastertech.bond.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BondRequestDelete {

    @JsonProperty("key")
    private String keyPix;

    @JsonProperty("participant")
    private String participant;

    @JsonProperty("reason")
    private String reason;

    public String getKeyPix() {
        return keyPix;
    }

    public void setKeyPix(String keyPix) {
        this.keyPix = keyPix;
    }

    public String getParticipant() {
        return participant;
    }

    public void setParticipant(String participant) {
        this.participant = participant;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
