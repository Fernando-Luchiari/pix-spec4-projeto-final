//package br.com.mastertech.bond.client;
//
//import br.com.mastertech.bond.model.BondRequest;
//import br.com.mastertech.bond.model.BondResponseGet;
//import br.com.mastertech.bond.model.BondResponsePost;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@FeignClient(name = "BACEN", configuration = BacenBondConfiguration.class)
//public interface BacenBond {
//
//    @GetMapping("/entries/{key}")
//    BondResponseGet getBondBacen(@PathVariable(name = "key") String key);
//
//    @PostMapping("/entries")
//    BondResponsePost createBond(BondRequest bond);
//}