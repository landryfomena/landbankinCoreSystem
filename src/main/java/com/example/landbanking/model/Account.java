package com.example.landbanking.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long AccountId;
	
	private String AccountName;
	
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
	private User AccuntOwner;
	
	private Date AccountCreationDate;
	
	@ManyToAny(metaColumn = @Column)
	private List<Transaction> transactions;
	
	
	private String accountStatus;


	public Account(Long accountId, String accountName, User accuntOwner, Date accountCreationDate,
			List<Transaction> transactions, String accountStatus) {
		super();
		AccountId = accountId;
		AccountName = accountName;
		AccuntOwner = accuntOwner;
		AccountCreationDate = accountCreationDate;
		this.transactions = transactions;
		this.accountStatus = accountStatus;
	}


	public Account() {
		super();
	}


	public Long getAccountId() {
		return AccountId;
	}


	public void setAccountId(Long accountId) {
		AccountId = accountId;
	}


	public String getAccountName() {
		return AccountName;
	}


	public void setAccountName(String accountName) {
		AccountName = accountName;
	}


	public User getAccuntOwner() {
		return AccuntOwner;
	}


	public void setAccuntOwner(User accuntOwner) {
		AccuntOwner = accuntOwner;
	}


	public Date getAccountCreationDate() {
		return AccountCreationDate;
	}


	public void setAccountCreationDate(Date accountCreationDate) {
		AccountCreationDate = accountCreationDate;
	}


	public List<Transaction> getTransactions() {
		return transactions;
	}


	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}


	public String getAccountStatus() {
		return accountStatus;
	}


	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	
	
	
	

}
