package br.com.mastertech.bond.enums;

public enum KeyTypesEnum {

    PHONE("PHONE"),
    CPF("CPF"),
    EMAIL("EMAIL");

    private final String keyTypes;

    KeyTypesEnum(String keyTypes) {
        this.keyTypes = keyTypes;
    }

    public String getKeyTypes() {
        return keyTypes;
    }
}
