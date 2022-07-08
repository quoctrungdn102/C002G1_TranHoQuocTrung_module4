package com.codegym.service.contract;

import com.codegym.model.contract.AttachFacility;
import com.codegym.model.contract.ContractDetail;
import com.codegym.model.dto.UsingAttachFacility;
import com.codegym.repository.contrac.IContractDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailService implements IContractDetailService {
    @Autowired
    private IContractDetailRepository iContractDetailRepository;
    public void createContractDetail(ContractDetail contractDetail){
        iContractDetailRepository.save(contractDetail);
    }

    @Override
    public List<UsingAttachFacility> attachFacilityUsing(Integer id) {
        return iContractDetailRepository.attachFacilityUsing(id);
    }


}
