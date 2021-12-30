package com.spring.examples.CustomerManagement.service;

import java.util.List;

import com.spring.examples.CustomerManagement.model.Customer;


public interface CustomerService {
	
	public List<Customer> getallcustomer();
	public Customer add(Customer customer);
	public String remove(Integer cid);
	


}
