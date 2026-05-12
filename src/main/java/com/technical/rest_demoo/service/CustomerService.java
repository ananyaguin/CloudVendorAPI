
package com.technical.rest_demoo.service;

import com.technical.rest_demoo.model.Customer;

import java.util.List;

public interface CustomerService {

    String createCustomer(Customer customer);

    String updateCustomer(Customer customer);

    String deleteCustomer(String customerId);

    Customer getCustomer(String customerId);

    List<Customer> getAllCustomers();
}


