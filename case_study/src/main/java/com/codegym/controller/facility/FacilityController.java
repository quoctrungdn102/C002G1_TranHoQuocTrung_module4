package com.codegym.controller.facility;

import com.codegym.model.facility.Facility;
import com.codegym.service.facility.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/facility")
public class FacilityController {
    @Autowired
    private IFacilityService facilityService;

    @GetMapping("")
    public String displayFacility(Model model, @RequestParam(name = "page", defaultValue = "0") int page) {
        model.addAttribute("facilityType", facilityService.listFacilityType());
        model.addAttribute("rentType", facilityService.listRentType());
        model.addAttribute("listFacility", facilityService.findAll(PageRequest.of(page, 5)));
        return "facility/home";
    }

    @GetMapping("/create")
    public String goCreateFacility(Model model) {
        model.addAttribute("facility", new Facility());
        model.addAttribute("facilityType", facilityService.listFacilityType());
        model.addAttribute("rentType", facilityService.listRentType());
        return "facility/creat";
    }

    @PostMapping("/create")
    public String CreateFacility(Facility facility, Model mode) {
//        mode.addAttribute("facility",new Facility());
        facilityService.saveFacility(facility);

        return "redirect:/facility";
    }

    @GetMapping("edit/{id}")
    public String goEdit(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("facility", facilityService.findById(id));
        model.addAttribute("facilityType", facilityService.listFacilityType());
        model.addAttribute("rentType", facilityService.listRentType());
        return "facility/creat";
    }

    @GetMapping("/delete")
    public String deleteFacility(@RequestParam("idFacility") Integer id) {
        facilityService.deleteFacility(facilityService.findById(id));
        return "redirect:/facility";
    }
}
