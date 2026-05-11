package com.technical.rest_demoo.service.impl;

import com.technical.rest_demoo.model.Customer;
import com.technical.rest_demoo.repository.CustomerRepository;
import com.technical.rest_demoo.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public String createCustomer(Customer customer) {

        customerRepository.save(customer);

        return "Customer Created Successfully";
    }

    @Override
    public String updateCustomer(Customer customer) {

        customerRepository.save(customer);

        return "Customer Updated Successfully";
    }

    @Override
    public String deleteCustomer(String customerId) {

        customerRepository.deleteById(customerId);

        return "Customer Deleted Successfully";
    }

    @Override
    public Customer getCustomer(String customerId) {

        return customerRepository.findById(customerId).orElse(null);
    }

    @Override
    public List<Customer> getAllCustomers() {

        return customerRepository.findAll();
    }
}