package com.bank.core.repository;

import org.springframework.data.repository.CrudRepository;

import com.bank.core.bean.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
