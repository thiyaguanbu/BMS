package com.bank.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "transactional_details")
public class TransactionalDetails {
	
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transaction_number")
	private long transactionNumber;
	
	@Column(name = "date_of_transaction")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateOfTrasaction;
	
	@Column(name = "medium_of_transaction")
	private String mediumOfTransaction;

	@Column(name = "transaction_type")
	private String transactionType;
	
	@Column(name = "transaction_amount")
	private long transactionAmount;
	
	@Column(name = "account_master")
	private AccountMaster accountMaster;

	public long getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(long transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public Date getDateOfTrasaction() {
		return dateOfTrasaction;
	}

	public void setDateOfTrasaction(Date dateOfTrasaction) {
		this.dateOfTrasaction = dateOfTrasaction;
	}

	public String getMediumOfTransaction() {
		return mediumOfTransaction;
	}

	public void setMediumOfTransaction(String mediumOfTransaction) {
		this.mediumOfTransaction = mediumOfTransaction;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public long getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(long transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public AccountMaster getAccountMaster() {
		return accountMaster;
	}

	public void setAccountMaster(AccountMaster accountMaster) {
		this.accountMaster = accountMaster;
	}
	
	
	

}
