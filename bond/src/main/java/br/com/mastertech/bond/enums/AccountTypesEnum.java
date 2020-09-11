package br.com.mastertech.bond.enums;

public enum AccountTypesEnum {

    CACC("CACC"),
    SLRY("SLRY"),
    SVGS("SVGS");

    private final String accountTypes;

    AccountTypesEnum(String accountTypes) {
        this.accountTypes = accountTypes;
    }

    public String getAccountTypes() {
        return accountTypes;
    }
}