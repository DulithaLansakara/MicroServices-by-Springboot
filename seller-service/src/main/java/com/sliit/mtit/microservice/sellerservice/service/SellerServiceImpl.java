package com.sliit.mtit.microservice.sellerservice.service;


import com.sliit.mtit.microservice.sellerservice.dbo.BuyerCreationRequest;
import com.sliit.mtit.microservice.sellerservice.dbo.BuyerCreationResponse;
import com.sliit.mtit.microservice.sellerservice.dbo.SellerRequest;
import com.sliit.mtit.microservice.sellerservice.dbo.SellerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;
import java.util.UUID;

@Service
public class SellerServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public SellerResponse createSeller(SellerRequest sellerRequest){

        var buyerCreationRequest = new BuyerCreationRequest();
        buyerCreationRequest.setBuyerId(sellerRequest.getSellerId());
        buyerCreationRequest.setBuyerName(sellerRequest.getSellerName());
        buyerCreationRequest.setBuyerDetails(sellerRequest.getSellerDetails());
        ResponseEntity<BuyerCreationResponse> buyerCreationResponse =  restTemplate.postForEntity("http://localhost:8080/buyers",buyerCreationRequest, BuyerCreationResponse.class);

        var sellerResponse = new SellerResponse();
        sellerResponse.setSellerId(UUID.randomUUID().toString());
        sellerResponse.setBuyerId(buyerCreationResponse.getBody().getBuyerId());
        sellerResponse.setMessage("Successfully created");

        return sellerResponse;
    }


    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
