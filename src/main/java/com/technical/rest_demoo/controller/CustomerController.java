package com.technical.rest_demoo.controller;

import com.technical.rest_demoo.model.Customer;
import com.technical.rest_demoo.service.CustomerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@Tag(name="Customer Service API")
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    // Create Customer
    @PostMapping
    public String createCustomer(@RequestBody Customer customer) {

        customerService.createCustomer(customer);

        return "Customer Created Successfully";
    }

    // Get Single Customer
    @GetMapping("{customerId}")
    public Customer getCustomer(@PathVariable String customerId) {

        return customerService.getCustomer(customerId);
    }

    // Get All Customers
    @GetMapping
    public List<Customer> getAllCustomers() {

        return customerService.getAllCustomers();
    }

    // ------Update Customer--------
    @PutMapping
    public String updateCustomer(@RequestBody Customer customer) {

        customerService.updateCustomer(customer);

        return "Customer Updated Successfully";
    }

    // ------Delete Customer------
    @DeleteMapping("{customerId}")
    public String deleteCustomer(@PathVariable String customerId) {

        customerService.deleteCustomer(customerId);

        return "Customer Deleted Successfully";

    }
}
