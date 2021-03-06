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

    private Long idCustomer;

    private String nickName;

    private String keyPix;

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

    public String getKeyPix() {
        return keyPix;
    }

    public void setKeyPix(String keyPix) {
        this.keyPix = keyPix;
    }

}