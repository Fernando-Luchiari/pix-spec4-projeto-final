package br.com.mastertech.contact.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Contact
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message =  "Codigo do contato não  pode ser nulo")
    @NotBlank(message = "Codigo do contato não pode ser vazio")
    private Long idCustomer;

    @NotNull(message =  "Nome do contato não  pode ser nulo")
    @NotBlank(message = "Nome do contato não pode ser vazio")
    private String nickName;

    @NotNull(message =  "Chave de acesso não  pode ser nulo")
    @NotBlank(message = "Chave de Acesso do contato não pode ser vazio")
    private String key;

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }


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
    public String getKey() {

        return key;
    }

    public void setKey(String key) {

        this.key = key;
    }

    public Contact() {
    }
}