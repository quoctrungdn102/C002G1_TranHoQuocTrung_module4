package com.codegym.service.contract;

import com.codegym.model.contract.AttachFacility;
import com.codegym.model.contract.ContractDetail;
import com.codegym.model.dto.UsingAttachFacility;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IContractDetailService {
    public void createContractDetail(ContractDetail contractDetail);

    List<UsingAttachFacility> attachFacilityUsing(Integer id);


}
