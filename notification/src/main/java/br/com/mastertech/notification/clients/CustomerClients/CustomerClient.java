package br.com.mastertech.notification.clients.CustomerClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CUSTOMER/customer", configuration = CustomerConfiguration.class)
public interface CustomerClient {

    @GetMapping("/{id}")
    Customer getCustomerById(@PathVariable Long id);

    @GetMapping("/cpf/{cpf}")
    Customer getCustomerByCpf(@PathVariable String id);
}
