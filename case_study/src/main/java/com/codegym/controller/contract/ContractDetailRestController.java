package com.codegym.controller.contract;

import com.codegym.model.contract.AttachFacility;
import com.codegym.model.contract.ContractDetail;
import com.codegym.model.dto.UsingAttachFacility;
import com.codegym.service.contract.IContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ContractDetailRestController")
public class ContractDetailRestController {
    @Autowired
    IContractDetailService iContractDetailService;
    @PostMapping("/create")
    public ResponseEntity<?> creat(@RequestBody ContractDetail contractDetail){
        iContractDetailService.createContractDetail(contractDetail);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/AttachFacilityUsing/{id}")
    public ResponseEntity<?> AttachFacilityUsing(@PathVariable("id") Integer id){
        List<UsingAttachFacility> list = iContractDetailService.attachFacilityUsing(id);
        return new ResponseEntity<>( list,HttpStatus.OK);
    }
}
