package br.com.mastertech.bond.controller;

import br.com.mastertech.bond.entity.Bond;
import br.com.mastertech.bond.mapper.BondMapper;
import br.com.mastertech.bond.model.*;
import br.com.mastertech.bond.service.BondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
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

    @GetMapping("/verify/{key}")
    public boolean verifyBond(@PathVariable String key){
        return bondService.verifyBond(key);
    }

    @GetMapping("/{cpf}")
    public List<Bond> getListBond(@PathVariable String cpf){
        return bondService.getListBond(cpf);
    }

    @PutMapping("/{key}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public BondResponsePut updateBond(@RequestBody @Valid BondRequestPut bondRequestPut, @PathVariable String key) {

        Bond bond = mapper.toBond(bondRequestPut);
        bond = bondService.updateBond(bond);
        return mapper.toBondResponsePut(bond);
    }

    @DeleteMapping("/{key}/delete")
    @Transactional
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public BondResponseDelete deleteBond(@RequestBody @Valid BondRequestDelete bondRequestDelete, @PathVariable String key){

        bondService.deleteBond(mapper.toBond(bondRequestDelete));

        return mapper.toBondResponseDelete(bondRequestDelete);
    }
}
