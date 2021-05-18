package com.sliit.mtit.microservice.deliveryservice.service;


import com.sliit.mtit.microservice.deliveryservice.dto.DeliveryRequest;
import com.sliit.mtit.microservice.deliveryservice.dto.DeliveryResponse;
import com.sliit.mtit.microservice.deliveryservice.dto.LocationCreationRequest;
import com.sliit.mtit.microservice.deliveryservice.dto.LocationCreationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class DeliveryServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

   public DeliveryResponse createDelivery(DeliveryRequest deliveryRequest){

       var locationCreationRequest = new LocationCreationRequest();
       locationCreationRequest.setCustomerName(deliveryRequest.getCustomerName());
       locationCreationRequest.setCustomerNIC(deliveryRequest.getCustomerNIC());

       ResponseEntity<LocationCreationResponse> locationCreationResponse = restTemplate.postForEntity("http://localhost:8080/location",locationCreationRequest, LocationCreationResponse.class);

       var deliveryResponse = new DeliveryResponse();
       deliveryResponse.setDeliveryId(UUID.randomUUID().toString());
       deliveryResponse.setLocationId(locationCreationResponse.getBody().getLocationId());
       deliveryResponse.setMessage("Successfully created the delivery");

       return deliveryResponse;

   }

   @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
       return builder.build();
   }
}
