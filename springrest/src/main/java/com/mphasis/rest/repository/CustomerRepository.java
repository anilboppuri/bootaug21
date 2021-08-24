package com.mphasis.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mphasis.rest.model.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Long>{

}
