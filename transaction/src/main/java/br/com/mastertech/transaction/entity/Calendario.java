package br.com.mastertech.transaction.entity;

import java.time.LocalDate;

public class Calendario {
    private LocalDate datavencimento;
    private Boolean recebivelAposvencimento;

    public LocalDate getDatavencimento() {
        return datavencimento;
    }

    public void setDatavencimento(LocalDate datavencimento) {
        this.datavencimento = datavencimento;
    }

    public Boolean getRecebivelAposvencimento() {
        return recebivelAposvencimento;
    }

    public void setRecebivelAposvencimento(Boolean recebivelAposvencimento) {
        this.recebivelAposvencimento = recebivelAposvencimento;
    }
}
