package com.mphasis.rest.resources;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.rest.model.Customer;
import com.mphasis.rest.services.CustomerService;
import com.mphasis.rest.util.CustList;

@RestController
public class CustomerResource {

	  @Autowired 
	  CustomerService service;
	
	// CRUD  create - POST, retrieve - GET, update - PUT and delete - DELETE 
	
	@GetMapping("/fetch/{id}")
       public Customer fetchCustomer(@PathVariable(value="id") Long custid) {
		
		return  service.getCustomer(custid);
	}	
	@GetMapping("/fetchall")
	public List<Customer> fetchCustomers(){
		
		             return service.getCustomers();
	}
	
	@PostMapping("/add")
	public void addCustomer(@RequestBody Customer cust) {
		
		         service.addCustomer(cust);
	}
	
	@PutMapping("/modify")
	public Customer modifyCustomer(@RequestBody Customer cust) { //@PathVariable(value="id") Long custid) {
		
		return service.updateCustomer(cust);
				
	}
	
	@DeleteMapping("/remove/{id}")
	 public void removeCustomer(@PathVariable(value ="id") Long custid) {
		
		             service.deleteCustomer(custid);
	}
}
