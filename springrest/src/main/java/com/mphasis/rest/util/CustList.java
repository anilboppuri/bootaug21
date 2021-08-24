package com.mphasis.rest.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mphasis.rest.model.Customer;
@Component
public class CustList {
       
	   List<Customer> custList = new ArrayList<>();

	public List<Customer> getCustList() {
		return custList;
	}

	public void setCustList(List<Customer> custList) {
		this.custList = custList;
	} 

           
}
