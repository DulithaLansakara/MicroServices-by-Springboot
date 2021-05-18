package com.mtit.micoservice.Cartservice.Controller;


import com.mtit.micoservice.Cartservice.dto.CartRequest;
import com.mtit.micoservice.Cartservice.dto.CartResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/cart")

public class CartController {
    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody CartResponse CreateCart(@RequestBody CartRequest cartequest) {

        System.out.println("Cart Details =" +cartequest);

        var CartResponse = new CartResponse();
        CartResponse.setItemId(UUID.randomUUID().toString());
        CartResponse.setMessage("Successully Added to the cart");
        return CartResponse;


    }
}
