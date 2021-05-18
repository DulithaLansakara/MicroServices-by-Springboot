package com.sliit.mtit.microservice.buyerservice.controller;


import com.sliit.mtit.microservice.buyerservice.dbo.BuyerRequest;
import com.sliit.mtit.microservice.buyerservice.dbo.BuyerResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/buyers")
public class BuyerController {
@PostMapping(consumes = "application/json" ,produces = "application/json" )
public @ResponseBody BuyerResponse createBuyer(@RequestBody BuyerRequest request){

        System.out.println("Buyer Details : " + request);

        var buyerResponse =  new BuyerResponse();
        buyerResponse.setBuyerId(UUID.randomUUID().toString());
        buyerResponse.setMessage("Successfully created");
        return buyerResponse;


        }
}
