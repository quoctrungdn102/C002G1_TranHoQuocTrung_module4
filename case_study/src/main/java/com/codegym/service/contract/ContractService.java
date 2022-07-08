package com.codegym.service.contract;

import com.codegym.model.contract.AttachFacility;
import com.codegym.model.contract.Contract;
import com.codegym.repository.contrac.IAttachFacility;
import com.codegym.repository.contrac.IContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService implements IContractService {
    @Autowired
    private IContractRepository iContractRepository;
    @Autowired
    private IAttachFacility iAttachFacility;

    @Override
    public Page<Contract> displayContract(Pageable pageable) {
        return iContractRepository.findAll(pageable);
    }

    public List<AttachFacility> displayAttachFacility() {
        return iAttachFacility.findAll();
    }

    @Override
    public Contract findContractById(Integer id) {
        return iContractRepository.findById(id).get();
    }
}
