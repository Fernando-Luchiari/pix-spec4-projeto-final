package br.com.mastertech.customer.mapper;

import br.com.mastertech.customer.entity.Customer;
import br.com.mastertech.customer.model.CustomerEditRequest;
import br.com.mastertech.customer.model.CustomerRequest;
import br.com.mastertech.customer.model.CustomerResponse;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    private CustomerMapper (){}

    public Customer from (CustomerRequest request) {
        Customer customer = new Customer();
        customer.setName(request.getName());
        customer.setCpf(request.getCpf());
        customer.setEmail(request.getEmail());
        customer.setPassword(request.getPassword());
        customer.setPhoneNumber(request.getPhoneNumber());

        return customer;
    }

    public Customer from (CustomerEditRequest request) {
        Customer customer = new Customer();
        customer.setName(request.getName());
        customer.setCpf(request.getCpf());
        customer.setEmail(request.getEmail());
        customer.setPassword(request.getPassword());
        customer.setPhoneNumber(request.getPhoneNumber());
        return customer;
    }

    public CustomerResponse to (Customer customer) {
        CustomerResponse response = new CustomerResponse();
        response.setId(customer.getId());
        response.setName(customer.getName());
        response.setCpf(customer.getCpf());
        response.setEmail(customer.getEmail());
        response.setPhoneNumber(customer.getPhoneNumber());
        return response;
    }

}
