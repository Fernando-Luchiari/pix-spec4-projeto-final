package br.com.mastertech.bond.mapper;

import br.com.mastertech.bond.entity.Bond;
import br.com.mastertech.bond.model.BondRequest;
import br.com.mastertech.bond.model.BondResponseGet;
import br.com.mastertech.bond.model.BondResponsePost;
import org.springframework.stereotype.Component;

@Component
public class BondMapper {

    private BondMapper (){}

    public Bond from (BondRequest request) {
        Bond bond = new Bond();
        bond.setKey(request.getKey());
        bond.setKeyType(request.getKeyType());
        bond.setAccount(request.getAccount());
        bond.setOwner(request.getOwner());
        bond.setReasonsEnum(request.getReasonsEnum());
        bond.setRequestId(request.getRequestId());

        return bond;
    }

    public BondResponsePost toPost (Bond bond) {
        BondResponsePost bondResponsePost = new BondResponsePost();
        bondResponsePost.setKey(bond.getKey());
        bondResponsePost.setKeyType(bond.getKeyType());
        bondResponsePost.setAccount(bond.getAccount());
        bondResponsePost.setOwner(bond.getOwner());
        bondResponsePost.setCreationDate(bond.getCreationDate());
        bondResponsePost.setKeyOwnershipDate(bond.getKeyOwnershipDate());
        return bondResponsePost;
    }

    public BondResponseGet toGet (Bond bond) {
        BondResponseGet bondResponseGet = new BondResponseGet();
        bondResponseGet.setKey(bond.getKey());
        bondResponseGet.setKeyType(bond.getKeyType());
        bondResponseGet.setAccount(bond.getAccount());
        bondResponseGet.setOwner(bond.getOwner());
        bondResponseGet.setCreationDate(bond.getCreationDate());
        bondResponseGet.setKeyOwnershipDate(bond.getKeyOwnershipDate());
        bondResponseGet.setOpenClaimCreationDate(bond.getOpenClaimCreationDate());
        return bondResponseGet;
    }


}
