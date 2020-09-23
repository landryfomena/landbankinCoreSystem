package com.example.landbanking.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdTransaction;
	
	private String transactionType;
	
	@ManyToOne
	private Account Sender;
	@ManyToOne
	private Account Receiver;
	@ManyToOne
	private Fees fees;
	@ManyToOne
	private Commission commission;
	private Date transactionDate;
	private String transactionStatus;
	
	public Transaction(Long idTransaction, String transactionType, Account sender, Account receiver, Fees fees,
			Commission commission, Date transactionDate, String transactionStatus) {
		super();
		IdTransaction = idTransaction;
		this.transactionType = transactionType;
		Sender = sender;
		Receiver = receiver;
		this.fees = fees;
		this.commission = commission;
		this.transactionDate = transactionDate;
		this.transactionStatus = transactionStatus;
	}

	public Transaction() {
		super();
	}

	public Long getIdTransaction() {
		return IdTransaction;
	}

	public void setIdTransaction(Long idTransaction) {
		IdTransaction = idTransaction;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public Account getSender() {
		return Sender;
	}

	public void setSender(Account sender) {
		Sender = sender;
	}

	public Account getReceiver() {
		return Receiver;
	}

	public void setReceiver(Account receiver) {
		Receiver = receiver;
	}

	public Fees getFees() {
		return fees;
	}

	public void setFees(Fees fees) {
		this.fees = fees;
	}

	public Commission getCommission() {
		return commission;
	}

	public void setCommission(Commission commission) {
		this.commission = commission;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
	
	

}
