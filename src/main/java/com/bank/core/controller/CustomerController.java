package com.bank.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bank.core.bean.Customer;
import com.bank.core.repository.CustomerRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class CustomerController {

	
	@Autowired
	private CustomerRepository repo;
	@GetMapping("/customer/{id}")
	public Customer find(@PathVariable int id) {
		//log.debug("Inside customer controller");
	
		return repo.findById(id).get();
	}
	
}
