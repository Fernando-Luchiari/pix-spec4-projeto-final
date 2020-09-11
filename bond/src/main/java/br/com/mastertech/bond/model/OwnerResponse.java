package br.com.mastertech.bond.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OwnerResponse {

    @JsonProperty("type")
    private String type;

    @JsonProperty("tax_id_number")
    private String taxIdNumber;

    @JsonProperty("name")
    private String name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public void setTaxIdNumber(String taxIdNumber) {
        this.taxIdNumber = taxIdNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
