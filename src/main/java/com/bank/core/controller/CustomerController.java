package com.bank.core.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.core.bean.Customer;
import com.bank.core.repository.CustomerRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@AllArgsConstructor
public class CustomerController {

	

	private final CustomerRepository repo;
	
	@GetMapping("/customer/{id}")
	public ResponseEntity<Customer> find(@PathVariable int id) {
		log.debug("Inside customer controller");
	
		return ResponseEntity.ok().body(repo.findById(id).orElse(null));
				
	}
	
	
	@PostMapping("/customer")
	public Customer save(@RequestBody Customer cust) {
		//log.debug("Inside customer controller");
	
		return repo.save(cust);
	}
	
		
}
