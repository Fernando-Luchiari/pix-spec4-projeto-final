package br.com.mastertech.transaction.model;

import br.com.mastertech.transaction.entity.Calendario;
import br.com.mastertech.transaction.entity.InfoAdicionais;
import br.com.mastertech.transaction.entity.Pagador;
import br.com.mastertech.transaction.entity.Valor;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import java.util.List;

public class DocumentRequest {

    @JsonProperty(value = "calendario")
    private Calendario dadosCalendario;
    @JsonProperty(value = "pagador")
    private Pagador dadosPagador;
    @JsonProperty(value = "valor")
    private Valor dadosValor;
    private String chave;
    private String solicitacaoPagador;
    @JsonProperty(value = "infoAdicionais")
    private List<InfoAdicionais> listaInfo;


    public Calendario getDadosCalendario() {
        return dadosCalendario;
    }

    public void setDadosCalendario(Calendario dadosCalendario) {
        this.dadosCalendario = dadosCalendario;
    }

    public Pagador getDadosPagador() {
        return dadosPagador;
    }

    public void setDadosPagador(Pagador dadosPagador) {
        this.dadosPagador = dadosPagador;
    }

    public Valor getDadosValor() {
        return dadosValor;
    }

    public void setDadosValor(Valor dadosValor) {
        this.dadosValor = dadosValor;
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

    public List<InfoAdicionais> getListaInfo() {
        return listaInfo;
    }

    public void setListaInfo(List<InfoAdicionais> listaInfo) {
        this.listaInfo = listaInfo;
    }
}
