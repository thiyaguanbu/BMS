package com.bank.model;

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
@Table(name = "loan_details")
public class LoanDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "loan_number")
	private long loanNumber;
	
	@Column(name = "loan_amount")
	private long loanAmount;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_number")
	private CustomerMaster customerMaster;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="branch_id")
	private BranchMaster branchMaster;

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

	public CustomerMaster getCustomerMaster() {
		return customerMaster;
	}

	public void setCustomerMaster(CustomerMaster customerMaster) {
		this.customerMaster = customerMaster;
	}

	public BranchMaster getBranchMaster() {
		return branchMaster;
	}

	public void setBranchMaster(BranchMaster branchMaster) {
		this.branchMaster = branchMaster;
	}

	public LoanDetails(long loanAmount, CustomerMaster customerMaster, BranchMaster branchMaster) {
		super();
		this.loanAmount = loanAmount;
		this.customerMaster = customerMaster;
		this.branchMaster = branchMaster;
	}

	public LoanDetails(){
	
	}

	@Override
	public String toString() {
		return "LoanDetails [loanNumber=" + loanNumber + ", loanAmount=" + loanAmount + ", customerMaster="
				+ customerMaster.getCustomerNumber() + ", branchMaster=" + branchMaster.getBranchId() + "]";
	}

}
