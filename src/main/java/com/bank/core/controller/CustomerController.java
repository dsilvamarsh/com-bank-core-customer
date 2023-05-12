package com.bank.core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bank.core.bean.Customer;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class CustomerController {

	@GetMapping("/customer/{id}")
	public Customer find(@PathVariable int id) {
		log.debug("Inside customer controller");
		return Customer.builder().id(1000).name("marsh").address("Canary wharf").build();
	}
	
}
