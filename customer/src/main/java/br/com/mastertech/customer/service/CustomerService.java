package br.com.mastertech.customer.service;

import br.com.mastertech.customer.entity.Customer;
import br.com.mastertech.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer create(Customer data){
        return customerRepository.save(data);
    }
}
