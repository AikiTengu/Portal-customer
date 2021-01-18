package com.mytona.Portalcustomer.Controller;

import com.mytona.Portalcustomer.Model.Entity.Customer;
import com.mytona.Portalcustomer.Model.DAO.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerDAO customerDAO;

    @GetMapping("/{customerId}")
    public Customer get(@PathVariable("customerId") long customerId) {
        return customerDAO.findCustomer(customerId);
    }

    @GetMapping("/all")
    public List<Customer> getAll(){
        return customerDAO.findAll();
    }

    @PostMapping
    public Customer save(@RequestBody Customer customer){
        return customerDAO.save(customer);
    }

    @DeleteMapping("/{customerId}")
    public String remove(@PathVariable("customerId") long customerId){
        return customerDAO.deleteCustomer(customerId);
    }
}
