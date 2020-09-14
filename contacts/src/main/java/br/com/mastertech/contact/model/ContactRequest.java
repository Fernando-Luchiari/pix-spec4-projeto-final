package br.com.mastertech.contact.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ContactRequest {

    @NotNull(message =  "Codigo do contato não  pode ser nulo")
    private Long idCustomer;

    @NotNull(message =  "Nome do contato não  pode ser nulo")
    @NotBlank(message = "Nome do contato não pode ser vazio")
    private String nickName;


    @NotNull(message =  "Chave de acesso não  pode ser nulo")
    @NotBlank(message = "Chave de Acesso do contato não pode ser vazio")
    private String keyPix;

    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getKeyPix() {
        return keyPix;
    }

    public void setKeyPix(String keyPix) {
        this.keyPix = keyPix;
    }
}
