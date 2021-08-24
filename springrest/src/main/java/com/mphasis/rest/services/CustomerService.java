package com.mphasis.rest.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.mphasis.rest.model.Customer;
import com.mphasis.rest.repository.CustomerRepository;
import com.mphasis.rest.util.CustList;

@Service
public class CustomerService {
      @Autowired
	  CustomerRepository repo;
	  
      @Autowired
       CustList custList;
      
	   public Customer getCustomer(Long custid) {
		   Optional<Customer> cust = repo.findById(custid);
		    if(cust.isPresent())
		   return cust.get();
		    else
		    	return null;
	   }
	   
	/*
	 * public List<Customer> getCustomers() {
	 * 
	 * return repo.findAll();
	 * 
	 * }
	 */
	   

		  public List<Customer> getCustomers() { 
			  
			  return custList.getCustList();
		  
		  }
		
	 
	   
	   public void addCustomer(Customer newCustomer) {
		             repo.save(newCustomer);
	   }
	
	   public Customer updateCustomer(Customer customer) {
		         
		         return repo.save(customer);
		             // return true;
	   }
	   
	   public void deleteCustomer(Long id) {
		   
		            repo.deleteById(id);
	   }
}
