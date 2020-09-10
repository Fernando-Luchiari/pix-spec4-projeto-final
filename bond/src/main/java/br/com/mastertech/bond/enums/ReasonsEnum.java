package br.com.mastertech.bond.enums;

public enum ReasonsEnum {

    USER_REQUESTED("USER_REQUESTED"),
    ACCOUNT_CLOSURE("ACCOUNT_CLOSURE"),
    BRANCH_TRANSFER("BRANCH_TRANSFER"),
    ENTRY_INACTIVITY("ENTRY_INACTIVITY"),
    FRAUD("FRAUD"),
    RECONCILIATION("RECONCILIATION");

    private final String reasons;

    ReasonsEnum(String reasons) {
        this.reasons = reasons;
    }

    public String getReasons() {
        return reasons;
    }
}