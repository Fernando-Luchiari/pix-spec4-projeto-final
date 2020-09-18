package br.com.mastertech.contact.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ContactUpdateRequest {

    @NotNull(message =  "Id do contato não  pode ser nulo")
    private Long id;

    @NotNull(message =  "Nome do contato não  pode ser nulo")
    @NotBlank(message = "Nome do contato não pode ser vazio")
    private String nickName;


    @NotNull(message =  "Chave de acesso não  pode ser nulo")
    @NotBlank(message = "Chave de Acesso do contato não pode ser vazio")
    private String keyPix;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
