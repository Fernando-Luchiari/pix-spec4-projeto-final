package br.com.mastertech.bond.model;

import java.time.LocalDate;

public class Account {

    private String participant;
    private String branch;
    private String accountNumber;
    private String accountTYpe;
    private LocalDate openingDate;

    public String getParticipant() {
        return participant;
    }

    public void setParticipant(String participant) {
        this.participant = participant;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountTYpe() {
        return accountTYpe;
    }

    public void setAccountTYpe(String accountTYpe) {
        this.accountTYpe = accountTYpe;
    }

    public LocalDate getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(LocalDate openingDate) {
        this.openingDate = openingDate;
    }
}
