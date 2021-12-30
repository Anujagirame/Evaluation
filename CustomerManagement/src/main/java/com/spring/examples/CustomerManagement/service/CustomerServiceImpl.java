package com.spring.examples.CustomerManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.examples.CustomerManagement.model.Customer;
import com.spring.examples.CustomerManagement.repo.CustomerRepo;

public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepo repo;

	@Override
	public List<Customer> getallcustomer() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Customer add(Customer customer) {
		// TODO Auto-generated method stub
		return repo.save(customer);
	}

	@Override
	public String remove(Integer cid) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}
	


