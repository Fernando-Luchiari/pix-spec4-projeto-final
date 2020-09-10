package br.com.mastertech.transaction.model;

import br.com.mastertech.transaction.entity.IdDocumento;

import java.time.LocalDateTime;

public class DocumentResponse {

    private IdDocumento idDocumento;
    private String payloadURL;
    private String txid;
    private LocalDateTime dataCriacao;


    public IdDocumento getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(IdDocumento idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getPayloadURL() {
        return payloadURL;
    }

    public void setPayloadURL(String payloadURL) {
        this.payloadURL = payloadURL;
    }

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
