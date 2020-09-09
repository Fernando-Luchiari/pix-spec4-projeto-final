package br.com.mastertech.customer.controller;


import br.com.mastertech.customer.entity.Customer;
import br.com.mastertech.customer.mapper.CustomerMapper;
import br.com.mastertech.customer.model.CustomerEditRequest;
import br.com.mastertech.customer.model.CustomerRequest;
import br.com.mastertech.customer.model.CustomerResponse;
import br.com.mastertech.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @Autowired
    private CustomerMapper mapper;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public CustomerResponse createCustomer(@RequestBody CustomerRequest request){
        Customer customer = service.create(mapper.from(request));
        return mapper.to(customer);
    }

    @PatchMapping
    public CustomerResponse editCustomer(@RequestBody CustomerEditRequest request) {
        Customer customerSave = service.editCustomer(mapper.from(request));
        return mapper.to(customerSave);
    }

    @GetMapping(value = "/{id}")
    public CustomerResponse getCustomerById (@PathVariable Long id) {
        Customer customer = service.getCustomer(id);
        return mapper.to(customer);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus (HttpStatus.NO_CONTENT)
    public void deleteCustomerById (@PathVariable Long id) {
        service.deleteCustomer(id);
    }

}
