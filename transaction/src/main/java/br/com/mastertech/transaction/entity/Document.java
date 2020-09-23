package br.com.mastertech.transaction.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
@Entity
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate datavencimento;
    private Boolean recebivelAposvencimento;
    private String cpfPagador;
    private String nomePagador;
    private BigDecimal valor;
    private String chave;
    private String solicitacaoPagador;
    private String idUnicoDocumento;

    @JoinColumn(name="idDocument")
    private List<InfoAdicionais> infoAdicionais;
    private String revisao;
    private String payloadURL;
    private String txid;

    private LocalDateTime dataCriacao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public String getCpfPagador() {
        return cpfPagador;
    }

    public void setCpfPagador(String cpfPagador) {
        this.cpfPagador = cpfPagador;
    }

    public String getNomePagador() {
        return nomePagador;
    }

    public void setNomePagador(String nomePagador) {
        this.nomePagador = nomePagador;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getSolicitacaoPagador() {
        return solicitacaoPagador;
    }

    public void setSolicitacaoPagador(String solicitacaoPagador) {
        this.solicitacaoPagador = solicitacaoPagador;
    }

    public String getIdUnicoDocumento() {
        return idUnicoDocumento;
    }

    public void setIdUnicoDocumento(String idUnicoDocumento) {
        this.idUnicoDocumento = idUnicoDocumento;
    }

    public List<InfoAdicionais> getInfoAdicionais() {
        return infoAdicionais;
    }

    public void setInfoAdicionais(List<InfoAdicionais> infoAdicionais) {
        this.infoAdicionais = infoAdicionais;
    }

    public String getRevisao() {
        return revisao;
    }

    public void setRevisao(String revisao) {
        this.revisao = revisao;
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
