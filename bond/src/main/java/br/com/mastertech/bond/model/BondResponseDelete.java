package br.com.mastertech.bond.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BondResponseDelete {

    @JsonProperty("key")
    private String keyPix;

    public String getKeyPix() {
        return keyPix;
    }

    public void setKeyPix(String keyPix) {
        this.keyPix = keyPix;
    }
}
