package br.com.mastertech.bond.entity;

import br.com.mastertech.bond.model.Account;
import br.com.mastertech.bond.model.Owner;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Bond {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String keyPix;
    private String keyType;

    @OneToOne(cascade = {CascadeType.ALL})
    private Account account;

    @OneToOne(cascade = {CascadeType.ALL})
    private Owner owner;
    private String reason;
    private String requestId;

    private LocalDateTime creationDate;
    private LocalDateTime keyOwnershipDate;
    private LocalDateTime openClaimCreationDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
