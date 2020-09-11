package br.com.mastertech.bond.model;

import java.time.LocalDateTime;

public class BondResponsePost {

    private String key;
    private String keyType;
    private AccountResponse account;

    private OwnerResponse owner;

    private LocalDateTime creationDate;
    private LocalDateTime keyOwnershipDate;

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

    public AccountResponse getAccount() {
        return account;
    }

    public void setAccount(AccountResponse account) {
        this.account = account;
    }

    public OwnerResponse getOwner() {
        return owner;
    }

    public void setOwner(OwnerResponse owner) {
        this.owner = owner;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getKeyOwnershipDate() {
        return keyOwnershipDate;
    }

    public void setKeyOwnershipDate(LocalDateTime keyOwnershipDate) {
        this.keyOwnershipDate = keyOwnershipDate;
    }
}