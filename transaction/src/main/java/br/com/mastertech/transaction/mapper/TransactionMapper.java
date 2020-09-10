package br.com.mastertech.transaction.mapper;

import br.com.mastertech.transaction.entity.Document;
import br.com.mastertech.transaction.model.DocumentRequest;
import br.com.mastertech.transaction.model.DocumentResponse;
import br.com.mastertech.transaction.model.DocumentResponseCustomer;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

@Component
public class TransactionMapper {

    private TransactionMapper() {}

    public Document requestToEntity(DocumentRequest request) {
        Document document = new Document();
        document.setDatavencimento(request.getDadosCalendario().getDataVencimento());
        document.setRecebivelAposvencimento(request.getDadosCalendario().getRecebivelAposVencimento());
        document.setCpfPagador(request.getDadosPagador().getCpf());
        document.setNomePagador(request.getDadosPagador().getNome());
        document.setValor(request.getDadosValor().getOriginal());
        document.setChave(request.getChave());
        document.setSolicitacaoPagador(request.getSolicitacaoPagador());
        document.setIdUnicoDocumento(String.valueOf(new Random().nextInt(100000000)));
        document.setInfoAdicionais(request.getListaInfo());
        document.setRevisao("0");
        document.setPayloadURL("1234");
        document.setTxid(UUID.randomUUID().toString());
        document.setDataCriacao(LocalDateTime.now());

        return document;
    }

    public DocumentResponse entityToResponse(Document document) {
        DocumentResponse response = new DocumentResponse();
        response.setIdDocumento(document.getIdUnicoDocumento());
        response.setDataCriacao(document.getDataCriacao());
        response.setPayloadURL(document.getPayloadURL());
        response.setRevisao(document.getRevisao());
        response.setTxid(document.getTxid());
        response.setValor(document.getValor());

        return response;
    }

    public DocumentResponseCustomer entityToResponseList (Document document) {
        DocumentResponseCustomer responseList = new DocumentResponseCustomer();
        responseList.setDataCriacao(document.getDataCriacao());
        responseList.setDataVencimento(document.getDatavencimento());
        responseList.setSolicitacaoPagador(document.getSolicitacaoPagador());
        responseList.setValor(document.getValor());
        responseList.setChave(document.getChave());
        responseList.setTxid(document.getTxid());
        return responseList;
    }
}
