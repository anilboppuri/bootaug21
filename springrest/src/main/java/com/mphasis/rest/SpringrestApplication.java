package com.mphasis.rest;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.mphasis.rest.model.Customer;
import com.mphasis.rest.repository.CustomerRepository;
import com.mphasis.rest.util.CustList;


@SpringBootApplication()
//@ComponentScan(basePackages = {, })
public class SpringrestApplication implements CommandLineRunner {

	 @Autowired 
	 CustomerRepository repo;
	 @Autowired
	  CustList list;
	 
	public static void main(String[] args) {
		SpringApplication.run(SpringrestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		
	    java.util.List<Customer>    list2= repo.findAll();
	    list.setCustList(list2);
	    //list.setCustList(repo.findAll());
		
	}

}
@Configuration // Java configuration
class MakeCustList{
	@Bean
	@Primary
	public static CustList makeList() {
		
		return new CustList();
	}
	 
}
	
	
	
	

