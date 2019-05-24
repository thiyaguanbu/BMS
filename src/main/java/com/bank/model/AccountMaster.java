package com.bank.model;



import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


@Entity
@Table(name = "account_master")
//@JsonIgnoreProperties({"branchMaster","customerMaster", "transactionDetails"})
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
	@JoinColumn(name = "branch_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private BranchMaster branchMaster;
	
	@ManyToOne(fetch = FetchType.LAZY)	
	@JoinColumn(name = "customer_number", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private CustomerMaster customerMaster;
	
//	@OneToMany(mappedBy = "accountMaster", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	private Set<TransactionalDetails> transactionDetails;

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

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Long getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(Long openingBalance) {
		this.openingBalance = openingBalance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public Date getAccountOpeningDate() {
		return accountOpeningDate;
	}

	public void setAccountOpeningDate(Date accountOpeningDate) {
		this.accountOpeningDate = accountOpeningDate;
	}

	public BranchMaster getBranchMaster() {
		return branchMaster;
	}

	public void setBranchMaster(BranchMaster branchMaster) {
		this.branchMaster = branchMaster;
	}

	public CustomerMaster getCustomerMaster() {
		return customerMaster;
	}

	public void setCustomerMaster(CustomerMaster customerMaster) {
		this.customerMaster = customerMaster;
	}

//	public Set<TransactionalDetails> getTransactionDetails() {
//		return transactionDetails;
//	}
//
//	public void setTransactionDetails(Set<TransactionalDetails> transactionDetails) {
//		this.transactionDetails = transactionDetails;
//	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof AccountMaster)) return false;
		return accountNumber!=null && accountNumber.equals(((AccountMaster) obj).accountNumber);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 31;
	}
	
}
