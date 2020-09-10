package br.com.mastertech.bond.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BondRequest {

    @JsonProperty("key")
    private String keyPix;

    @JsonProperty("key_type")
    private String keyType;

    @JsonProperty("account")
    private Account account;

    @JsonProperty("owner")
    private Owner owner;

    @JsonProperty("reason")
    private String reason;

    @JsonProperty("request_id")
    private String requestId;

    public String getKeyPix() {
        return keyPix;
    }

    public void setKeyPix(String keyPix) {
        this.keyPix = keyPix;
    }

    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
