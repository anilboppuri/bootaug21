package com.mphasis.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Anil Boppuri
 *
 */
/**
 * @author Anil Boppuri
 *
 */

@Entity
//@Table(name="")
public class Customer {
      @Id
      @GeneratedValue
	  private long custid;
	  private String fullname;
	  private double balance;
	  
	  public Customer() {
		// TODO Auto-generated constructor stub
	}



	public long getCustid() {
		return custid;
	}



	public void setCustid(long custid) {
		this.custid = custid;
	}



	public String getFullname() {
		return fullname;
	}



	public void setFullname(String fullname) {
		this.fullname = fullname;
	}



	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custid + ", fullName=" + fullname + ", balance=" + balance + "]";
	}
	  
	  
}
