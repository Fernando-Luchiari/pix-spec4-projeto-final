package br.com.mastertech.customer.service;

import br.com.mastertech.customer.entity.Customer;
import br.com.mastertech.customer.exception.CustomerNotFoundException;
import br.com.mastertech.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private BCryptPasswordEncoder encoder;


    public Customer create(Customer data){
        data.setPassword(encoder.encode(data.getPassword()));
        return customerRepository.save(data);
    }

    public Customer editCustomer(Customer data) {
        Optional<Customer> byCpf = customerRepository.findByCpf(data.getCpf());
        if (byCpf.isPresent()) {
            Customer customer = byCpf.get();
            customer.setName(!data.getName().isEmpty() ? data.getName() : customer.getName());
            customer.setPhoneNumber(!data.getPhoneNumber().isEmpty() ? data.getPhoneNumber() : customer.getPhoneNumber());
            customer.setEmail(!data.getEmail().isEmpty() ? data.getEmail() : customer.getEmail());
            customer.setPassword(!data.getPassword().isEmpty() ? encoder.encode(data.getPassword()): customer.getPassword());
            customer.setBranch(!data.getBranch().isEmpty() ? data.getBranch() : customer.getBranch());
            customer.setAccountnumber(!data.getAccountnumber().isEmpty() ? data.getAccountnumber() : customer.getAccountnumber());
            customer.setAccounttype(!data.getAccounttype().isEmpty() ? data.getAccounttype() : customer.getAccounttype());

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
