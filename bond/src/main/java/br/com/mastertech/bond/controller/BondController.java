package br.com.mastertech.bond.controller;

import br.com.mastertech.bond.entity.Bond;
import br.com.mastertech.bond.mapper.BondMapper;
import br.com.mastertech.bond.model.BondRequest;
import br.com.mastertech.bond.model.BondResponseGet;
import br.com.mastertech.bond.model.BondResponsePost;
import br.com.mastertech.bond.service.BondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/entries")
public class BondController {

    @Autowired
    private BondService bondService;

    @Autowired
    private BondMapper mapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BondResponsePost createBond (@RequestBody @Valid BondRequest bondRequest) {
        Bond bond = bondService.createBond(mapper.from(bondRequest));
        return mapper.toPost(bond);

    }

    @GetMapping("/{key}")
    @ResponseStatus(HttpStatus.OK)
    public BondResponseGet getBond(@PathVariable String key) {
        Bond bond = bondService.getBond(key);
        return mapper.toGet(bond);

    }

//    @PutMapping("/{key}")
//    @ResponseStatus(HttpStatus.ACCEPTED)
//    public BondResponse updateBond(@RequestBody @Valid Bond bond) {
//        bondService.updateBond(bond);
//
//    }

//    @DeleteMapping("/{key}/delete")
//    @Transactional
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void deleteBond(@PathVariable String key){
//        bondService.deleteBond();
//
//    }
}
