//package com.project.hubspot.controller;
//
//import com.project.hubspot.model.Partner;
//import com.project.hubspot.service.PartnerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import javax.servlet.http.HttpServletResponse;
//import javax.validation.Valid;
//import java.util.List;
//
///**
// * Created by Francisco Neto on 07/2018.
// */
//@RestController
//@RequestMapping("/partners")
//public class PartnerController {
//
//    @Autowired
//    PartnerService partnerService;
//
//    @GetMapping
//    public List<Partner> gerPartners(){
//        return partnerService.gerPartners();
//    }
//
//    @PostMapping
//    public ResponseEntity<Partner> add(@Valid @RequestBody Partner partner, HttpServletResponse response) {
//       return null;
//    }
//}
