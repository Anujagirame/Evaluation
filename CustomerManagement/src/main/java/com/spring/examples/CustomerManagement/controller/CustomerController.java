package com.spring.examples.CustomerManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.examples.CustomerManagement.model.Customer;
import com.spring.examples.CustomerManagement.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService service;
	
	
	@GetMapping("/customer/all")
	public List<Customer> getAll(){
		return service.getallcustomer();
		
	}
	
	@PostMapping("/customer/add")
	public Customer add(@RequestBody Customer customer) {
		return service.add(customer);
	}
	
	
	@DeleteMapping("/customer/delete/{cid}")
		public String remove(@PathVariable("cid") Integer cid)
		{
			return service.remove(cid);
		}
	
	
}
