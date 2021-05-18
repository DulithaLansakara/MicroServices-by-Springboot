package com.mtit.micoservice.payementservice.controller;

import com.mtit.micoservice.payementservice.dto.paymentResponse;
import com.mtit.micoservice.payementservice.dto.paymentRequest;
import com.mtit.micoservice.payementservice.service.paymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/payment")

public class paymentController {

    @Autowired
    private paymentServiceImpl paymentService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody paymentResponse CreatePayment(@RequestBody paymentRequest request) {

        System.out.println("Payment Details =" + request);


        return paymentService.createPayement(request);


    }
}
