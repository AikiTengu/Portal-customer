package com.mytona.Portalcustomer.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// TODO: CRUD customers

@RestController
@RequestMapping("/customers")

public class CustomerController {

    @GetMapping("/{customerId}")
    public String getCustomer(@PathVariable("customerId") String customerId) {
        return "Successfully retrieved a customer:" + " " + customerId;
    }
}
