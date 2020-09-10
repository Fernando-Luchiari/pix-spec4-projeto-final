package br.com.mastertech.customer.controller;

import br.com.mastertech.customer.mapper.CustomerMapper;
import br.com.mastertech.customer.model.CustomerLoginRequest;
import br.com.mastertech.customer.model.CustomerRequest;
import br.com.mastertech.customer.model.CustomerResponse;
import br.com.mastertech.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private CustomerService service;

    @Autowired
    private CustomerMapper mapper;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    private CustomerResponse logIn(@RequestBody @Valid CustomerLoginRequest request){
        return mapper.to(service.logIn(mapper.fromLogin(request)));
    }

}
