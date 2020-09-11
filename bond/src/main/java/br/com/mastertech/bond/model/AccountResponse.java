package br.com.mastertech.bond.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class AccountResponse {
    @JsonProperty("participant")
    private String participant;

    @JsonProperty("branch")
    private String branch;

    @JsonProperty("account_number")
    private String accountNumber;

    @JsonProperty("account_type")
    private String accountTYpe;

    @JsonProperty("opening_date")
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
