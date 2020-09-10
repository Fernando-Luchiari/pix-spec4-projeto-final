package br.com.mastertech.bond.entity;

import br.com.mastertech.bond.enums.ReasonsEnum;
import br.com.mastertech.bond.model.Account;
import br.com.mastertech.bond.model.Owner;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Bond {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String key;
    private String keyType;
    private Account account;

    private Owner owner;
    private ReasonsEnum reasonsEnum;
    private String requestId;

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
