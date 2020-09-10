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
        bond.setKeyPix(request.getKeyPix());
        bond.setKeyType(request.getKeyType());
        bond.setAccount(request.getAccount());
        bond.setOwner(request.getOwner());
        bond.setReason(request.getReason());
        bond.setRequestId(request.getRequestId());

        return bond;
    }

    public BondResponsePost toPost (Bond bond) {
        BondResponsePost bondResponsePost = new BondResponsePost();
        bondResponsePost.setKey(bond.getKeyPix());
        bondResponsePost.setKeyType(bond.getKeyType());
        bondResponsePost.setAccount(bond.getAccount());
        bondResponsePost.setOwner(bond.getOwner());
        bondResponsePost.setCreationDate(bond.getCreationDate());
        bondResponsePost.setKeyOwnershipDate(bond.getKeyOwnershipDate());
        return bondResponsePost;
    }

    public BondResponseGet toGet (Bond bond) {
        BondResponseGet bondResponseGet = new BondResponseGet();
        bondResponseGet.setKey(bond.getKeyPix());
        bondResponseGet.setKeyType(bond.getKeyType());
        bondResponseGet.setAccount(bond.getAccount());
        bondResponseGet.setOwner(bond.getOwner());
        bondResponseGet.setCreationDate(bond.getCreationDate());
        bondResponseGet.setKeyOwnershipDate(bond.getKeyOwnershipDate());
        bondResponseGet.setOpenClaimCreationDate(bond.getOpenClaimCreationDate());
        return bondResponseGet;
    }


}
