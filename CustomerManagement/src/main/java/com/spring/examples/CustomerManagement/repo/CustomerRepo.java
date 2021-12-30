package com.spring.examples.CustomerManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.examples.CustomerManagement.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
