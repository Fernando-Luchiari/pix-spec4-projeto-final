package br.com.mastertech.transaction.model;

import br.com.mastertech.transaction.configuration.BondClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "bond", configuration = BondClientConfiguration.class)
public interface BondClient {

    @GetMapping("/entries/verify/{key}")
    boolean verifyBond(@PathVariable String key);

}
