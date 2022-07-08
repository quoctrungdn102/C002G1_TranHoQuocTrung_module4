package com.codegym.controller.facility;

import com.codegym.model.facility.Facility;
import com.codegym.service.facility.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resFacility")
public class FacilityRestController {
    @Autowired
    IFacilityService iFacilityService;
    @GetMapping("")
    public ResponseEntity<?> displayFacility(@RequestParam( name = "page",defaultValue ="0" ) int page ){
        List<Facility> facilityList = iFacilityService.findAll(PageRequest.of(page,5)).getContent();
        return new ResponseEntity<>(facilityList,HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<?> creatFacility(@RequestBody Facility facility){
        Facility facility1 = facility;
        iFacilityService.saveFacility(facility);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<?>findById(@PathVariable("id") Integer id){
     return new ResponseEntity<>(iFacilityService.findById(id),HttpStatus.OK)   ;
    }
}
