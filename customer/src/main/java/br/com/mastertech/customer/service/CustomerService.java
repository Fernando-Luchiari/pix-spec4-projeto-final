package br.com.mastertech.customer.service;

import br.com.mastertech.customer.entity.Customer;
import br.com.mastertech.customer.exception.CustomerNotFoundException;
import br.com.mastertech.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer create(Customer data){
        return customerRepository.save(data);
    }

    public Customer editCustomer(Customer data) {
        Optional<Customer> byCpf = customerRepository.findByCpf(data.getCpf());
        if (byCpf.isPresent()) {
            Customer customer = byCpf.get();
            customer.setName(!data.getName().isEmpty() ? data.getName() : customer.getName());
            customer.setPhoneNumber(!data.getPhoneNumber().isEmpty() ? data.getPhoneNumber() : customer.getPhoneNumber());
            customer.setEmail(!data.getEmail().isEmpty() ? data.getEmail() : customer.getEmail());
            customer.setPassword(!data.getPassword().isEmpty() ? data.getPassword() : customer.getPassword());
            Customer save = customerRepository.save(customer);
            return save;
        } else
            throw new CustomerNotFoundException();
    }

    public Customer getCustomer (Long id) {
        Optional<Customer> byId = customerRepository.findById(id);
        if (byId.isPresent()) {
            return byId.get();
        } else
            throw new CustomerNotFoundException();
    }

    public void deleteCustomer (Long id) {
        Optional<Customer> byId = customerRepository.findById(id);
        if (byId.isPresent()) {
            customerRepository.delete(byId.get());
        } else
            throw new CustomerNotFoundException();
    }

    public Customer logIn(Customer data){

        Optional<Customer> opCustomer=   customerRepository.findByEmailAndPassword(data.getEmail(),data.getPassword());
        if(opCustomer.isPresent()){
            return opCustomer.get();
        }else{
            throw new CustomerNotFoundException();
        }

    }
}
