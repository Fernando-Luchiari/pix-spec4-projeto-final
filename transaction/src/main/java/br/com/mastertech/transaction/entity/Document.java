package br.com.mastertech.transaction.entity;

import java.time.LocalDateTime;
import java.util.List;

public class Document {

    private Calendario dadosCalendario;
    private Pagador dadosPagador;
    private Valor dadosValor;
    private String chave;
    private String solicitacaoPagador;
    private List<InfoAdicionais> listaInfo;

    private IdDocumento idDocumento;
    private String payloadURL;
    private String txid;
    private LocalDateTime dataCriacao;




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
