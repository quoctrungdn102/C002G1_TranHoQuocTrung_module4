package com.codegym.controller.contract;

import com.codegym.service.contract.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    IContractService iContractService;

    @GetMapping("")
    public String displayContract(@RequestParam(value = "page", defaultValue = "0") int page, Model model) {
        model.addAttribute("listAttach", iContractService.displayAttachFacility());
        model.addAttribute("listContract", iContractService.displayContract(PageRequest.of(page, 5)));

        return "contract/home";
    }

}
