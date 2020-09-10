package br.com.mastertech.bond.model;

import br.com.mastertech.bond.enums.ReasonsEnum;

public class BondRequest {

    private String key;
    private String keyType;
    private Account account;

    private Owner owner;
    private ReasonsEnum reasonsEnum;
    private String requestId;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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

    public ReasonsEnum getReasonsEnum() {
        return reasonsEnum;
    }

    public void setReasonsEnum(ReasonsEnum reasonsEnum) {
        this.reasonsEnum = reasonsEnum;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
