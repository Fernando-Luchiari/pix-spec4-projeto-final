package br.com.mastertech.bond.model;

import java.time.LocalDateTime;

public class BondResponseGet {

    private String key;
    private String keyType;
    private Account account;

    private Owner owner;

    private LocalDateTime creationDate;
    private LocalDateTime keyOwnershipDate;
    private LocalDateTime openClaimCreationDate;

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

    public LocalDateTime getOpenClaimCreationDate() {
        return openClaimCreationDate;
    }

    public void setOpenClaimCreationDate(LocalDateTime openClaimCreationDate) {
        this.openClaimCreationDate = openClaimCreationDate;
    }
}
