package com.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loan_details")
public class LoanDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "loan_number")
	private long loanNumber;
	
	@Column(name = "loan_amount")
	private long loanAmount;
	
//	@Column(name = "customer_number")
//	private CustomerMaster customerMaster;
//	
//	@Column(name = "branch_id")
//	private BranchMaster branchMaster;

	public long getLoanNumber() {
		return loanNumber;
	}

	public void setLoanNumber(long loanNumber) {
		this.loanNumber = loanNumber;
	}

	public long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}

//	public CustomerMaster getCustomerMaster() {
//		return customerMaster;
//	}
//
//	public void setCustomerMaster(CustomerMaster customerMaster) {
//		this.customerMaster = customerMaster;
//	}
//
//	public BranchMaster getBranchMaster() {
//		return branchMaster;
//	}
//
//	public void setBranchMaster(BranchMaster branchMaster) {
//		this.branchMaster = branchMaster;
//	}
	
	
	

}
