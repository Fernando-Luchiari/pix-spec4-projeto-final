package br.com.mastertech.transaction.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class DocumentResponse {

    private String idDocumento;
    private String revisao;
    private String payloadURL;
    private String txid;
    private LocalDateTime dataCriacao;
    private BigDecimal valor;

    public String getRevisao() {
        return revisao;
    }

    public void setRevisao(String revisao) {
        this.revisao = revisao;
    }

    public String getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(String idDocumento) {
        this.idDocumento = idDocumento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
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
