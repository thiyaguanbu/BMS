package com.bank.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "account_master")
public class AccountMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "account_number")
	private Long accountNumber;
	
	@Column(name = "opening_balance")
	private Long openingBalance;

	@Column(name = "account_type")
	private String accountType;
	
	@Column(name = "account_status")
	private String accountStatus;
	
	@Column(name = "account_opening_date")
	private Date accountOpeningDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "branch_id")
	private BranchMaster branchMaster;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_number")
	private CustomerMaster customerMaster;

	public AccountMaster(Long openingBalance, String accountType, String accountStatus, Date accountOpeningDate,
			BranchMaster branchMaster, CustomerMaster customerMaster) {
		super();
		this.openingBalance = openingBalance;
		this.accountType = accountType;
		this.accountStatus = accountStatus;
		this.accountOpeningDate = accountOpeningDate;
		this.branchMaster = branchMaster;
		this.customerMaster = customerMaster;
	}
	
	public AccountMaster() {
		
	}
	
	

	
}
