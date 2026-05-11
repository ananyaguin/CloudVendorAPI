
package com.technical.rest_demoo.repository;

import com.technical.rest_demoo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}