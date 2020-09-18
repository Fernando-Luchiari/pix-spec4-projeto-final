package br.com.mastertech.transaction.model;

import br.com.mastertech.transaction.exception.BondErrorException;

public class BondClientFallback implements BondClient {

    @Override
    public boolean verifyBond(String key) {
        throw new BondErrorException();
    }
}
