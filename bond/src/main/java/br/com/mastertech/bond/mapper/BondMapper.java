package br.com.mastertech.bond.mapper;

import br.com.mastertech.bond.entity.Bond;
import br.com.mastertech.bond.model.*;
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
        AccountResponse accountResponse = new AccountResponse();
        OwnerResponse ownerResponse = new OwnerResponse();

        bondResponsePost.setKey(bond.getKeyPix());
        bondResponsePost.setKeyType(bond.getKeyType());

        accountResponse.setAccountNumber(bond.getAccount().getAccountNumber());
        accountResponse.setAccountTYpe(bond.getAccount().getAccountTYpe());
        accountResponse.setBranch(bond.getAccount().getBranch());
        accountResponse.setParticipant(bond.getAccount().getParticipant());
        accountResponse.setOpeningDate(bond.getAccount().getOpeningDate());
        bondResponsePost.setAccount(accountResponse);

        ownerResponse.setName(bond.getOwner().getName());
        ownerResponse.setTaxIdNumber(bond.getOwner().getTaxIdNumber());
        ownerResponse.setType(bond.getOwner().getType());
        bondResponsePost.setOwner(ownerResponse);

        bondResponsePost.setCreationDate(bond.getCreationDate());
        bondResponsePost.setKeyOwnershipDate(bond.getKeyOwnershipDate());
        return bondResponsePost;
    }

    public BondResponseGet toGet (Bond bond) {
        BondResponseGet bondResponseGet = new BondResponseGet();
        AccountResponse accountResponse = new AccountResponse();
        OwnerResponse ownerResponse = new OwnerResponse();

        bondResponseGet.setKey(bond.getKeyPix());
        bondResponseGet.setKeyType(bond.getKeyType());

        accountResponse.setAccountNumber(bond.getAccount().getAccountNumber());
        accountResponse.setAccountTYpe(bond.getAccount().getAccountTYpe());
        accountResponse.setBranch(bond.getAccount().getBranch());
        accountResponse.setParticipant(bond.getAccount().getParticipant());
        accountResponse.setOpeningDate(bond.getAccount().getOpeningDate());
        bondResponseGet.setAccount(accountResponse);

        ownerResponse.setName(bond.getOwner().getName());
        ownerResponse.setTaxIdNumber(bond.getOwner().getTaxIdNumber());
        ownerResponse.setType(bond.getOwner().getType());
        bondResponseGet.setOwner(ownerResponse);

        bondResponseGet.setCreationDate(bond.getCreationDate());
        bondResponseGet.setKeyOwnershipDate(bond.getKeyOwnershipDate());
        bondResponseGet.setOpenClaimCreationDate(bond.getOpenClaimCreationDate());
        return bondResponseGet;
    }


}
