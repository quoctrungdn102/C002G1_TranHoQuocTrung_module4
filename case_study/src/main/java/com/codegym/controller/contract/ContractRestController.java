package com.codegym.controller.contract;

import com.codegym.model.contract.ContractDetail;
import com.codegym.service.contract.IContractDetailService;
import com.codegym.service.contract.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/restContract")
public class ContractRestController {
    @Autowired
    private IContractService iContractService;

    @GetMapping("/findContract/{id}")
    public ResponseEntity<?> findContractById(@PathVariable("id") Integer id) {
        Set<ContractDetail> contractDetailSet = iContractService.findContractById(id).getContractSets();
        return new ResponseEntity<>(contractDetailSet, HttpStatus.OK);

    }

}
