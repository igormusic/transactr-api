package com.transactRules.runtime.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	
	private String accountNumber;
	
	public Account() {}
	
	public Account(String accountNumber){
		this.accountNumber = accountNumber;
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setName(String accountNumber) {
		this.accountNumber = accountNumber;
	}

}
