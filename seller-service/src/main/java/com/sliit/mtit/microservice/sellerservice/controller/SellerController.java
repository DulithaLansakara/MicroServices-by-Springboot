package com.sliit.mtit.microservice.sellerservice.controller;

import com.sliit.mtit.microservice.sellerservice.dbo.SellerRequest;
import com.sliit.mtit.microservice.sellerservice.dbo.SellerResponse;
import com.sliit.mtit.microservice.sellerservice.service.SellerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/sellers")
public class SellerController {
    @Autowired
    private SellerServiceImpl sellerService;

    @PostMapping(consumes = "application/json" ,produces = "application/json" )
    public @ResponseBody
    SellerResponse createOrder(@RequestBody SellerRequest request) {

        System.out.println("Seller Details : " + request);

        return sellerService.createSeller(request);

    }

    }
