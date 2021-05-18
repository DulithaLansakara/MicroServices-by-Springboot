package com.sliit.mtit.microservice.locationservice.controller;


import com.sliit.mtit.microservice.locationservice.dto.LocationRequest;
import com.sliit.mtit.microservice.locationservice.dto.LocationResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/location")
public class LocationController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody LocationResponse createLocation(@RequestBody LocationRequest locationRequest){

        System.out.println("Customer Location Details : "+ locationRequest);


        var locationResponse = new LocationResponse();
        locationResponse.setLocationId(UUID.randomUUID().toString());
        locationResponse.setCustomerAddress(locationRequest.getCustomerAddress());
        locationResponse.setMessage("Successfully created the location");

        return locationResponse;

    }

}
