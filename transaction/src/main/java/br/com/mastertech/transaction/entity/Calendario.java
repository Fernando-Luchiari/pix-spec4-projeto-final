package br.com.mastertech.transaction.entity;

import java.time.LocalDate;

public class Calendario {
    private LocalDate dataVencimento;
    private Boolean recebivelAposVencimento;

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Boolean getRecebivelAposVencimento() {
        return recebivelAposVencimento;
    }

    public void setRecebivelAposVencimento(Boolean recebivelAposVencimento) {
        this.recebivelAposVencimento = recebivelAposVencimento;
    }
}
