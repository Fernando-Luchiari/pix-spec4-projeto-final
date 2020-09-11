package br.com.mastertech.bond.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BondRequestPut {

    @JsonProperty("key")
    private String keyPix;

    @JsonProperty("account")
    private Account account;

    @JsonProperty("reason")
    private String reason;

    public String getKeyPix() {
        return keyPix;
    }

    public void setKeyPix(String keyPix) {
        this.keyPix = keyPix;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
