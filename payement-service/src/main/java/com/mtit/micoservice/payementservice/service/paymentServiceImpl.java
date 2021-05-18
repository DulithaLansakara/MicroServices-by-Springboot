package com.mtit.micoservice.payementservice.service;


import com.mtit.micoservice.payementservice.dto.CartCreationRequest;
import com.mtit.micoservice.payementservice.dto.cartCreationResponse;
import com.mtit.micoservice.payementservice.dto.paymentRequest;
import com.mtit.micoservice.payementservice.dto.paymentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class paymentServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public paymentResponse createPayement(paymentRequest paymentRequest){

        var cartCreationRequest = new CartCreationRequest();
        cartCreationRequest.setItemId(paymentRequest.getPaymentId());
        cartCreationRequest.setItemDescription(paymentRequest.getPaymentType());
        cartCreationRequest.setAmount(paymentRequest.getAmount());

        ResponseEntity<cartCreationResponse> cartCreationResponse = restTemplate.postForEntity("http://localhost:8080/cart",cartCreationRequest,cartCreationResponse.class);

        var paymentResponse = new paymentResponse();
        paymentResponse.setPaymentId(UUID.randomUUID().toString());
        paymentResponse.setMessage("payment successfully ");
        paymentResponse.setItemId(cartCreationResponse.getBody().getItemId());

        return paymentResponse;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
