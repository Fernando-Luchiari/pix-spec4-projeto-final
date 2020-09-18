package br.com.mastertech.customer.model;

import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.*;
import java.util.Date;

public class CustomerRequest {

    @NotNull(message = "Nome não pode ser em Branco")
    @NotBlank(message = "Nome não pode ser vazio")
    @Size(min = 3, message = "Nome mínimo com 3 caracteres")
    private String name;

    @NotEmpty(message = "Informe o número do telefone.")
    @Size(min = 16, max = 16, message = "O telefone deve ter o formato +11 11 11111-1111.")
    private String phoneNumber;

    @Email(message = "Informe o email")
    private String email;

    @CPF(message = "Informe o CPF")
    @Size(min = 11, max = 11, message = "informe o cpf")
    private String cpf;

    @NotEmpty(message = "Informe uma senha")
    private String password;

    @NotNull
    @NotBlank(message = "banco não pode ser vazio")
    private String branch;

    @NotNull
    @NotBlank(message = "Número da conta não pode ser vazio")
    private String accountnumber;

    @NotEmpty
    @NotBlank(message = "Tipo de conta não pode ser vazio")
    private String accounttype;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype;
    }
}
