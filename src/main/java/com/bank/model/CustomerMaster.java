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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "customer_master",uniqueConstraints = @UniqueConstraint(columnNames = {"first_name","customer_contact_no"}))
public class CustomerMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_number")
	private String customerNumber;
	
	@Column(name = "first_name")
	@NotNull
	private String firstName;
	
	@Column(name = "middle_name")
	private String middleName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "customer_city")
	private String customerCity;
	
	@Column(name = "customer_contact_no")
	@NotNull
	private String customerContactNo;
	
	@Column(name = "occupation")
	private String occupation;
	
	@Column(name = "date_of_birth")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateOfBirth;

//	@OneToMany(mappedBy = "customerMaster", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	private Set<AccountMaster> accountMasters;
//
//	@OneToMany(mappedBy = "customerMaster", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	private Set<LoanDetails> loanDetails;
	
	
	
	public CustomerMaster() {
		
	}
	
	public CustomerMaster(@NotNull String firstName, String middleName, String lastName, String customerCity,
			@NotNull String customerContactNo, String occupation, Date dateOfBirth) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.customerCity = customerCity;
		this.customerContactNo = customerContactNo;
		this.occupation = occupation;
		this.dateOfBirth = dateOfBirth;
	}

//	public CustomerMaster(@NotNull String firstName, String middleName, String lastName, String customerCity,
//			@NotNull String customerContactNo, String occupation, Date dateOfBirth, Set<AccountMaster> accountMasters) {
//		super();
//		this.firstName = firstName;
//		this.middleName = middleName;
//		this.lastName = lastName;
//		this.customerCity = customerCity;
//		this.customerContactNo = customerContactNo;
//		this.occupation = occupation;
//		this.dateOfBirth = dateOfBirth;
//		this.accountMasters = accountMasters;
//	}

//	public Set<AccountMaster> getAccountMasters() {
//		return accountMasters;
//	}
//
//	public void setAccountMasters(Set<AccountMaster> accountMasters) {
//		this.accountMasters = accountMasters;
//	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public String getCustomerContactNo() {
		return customerContactNo;
	}

	public void setCustomerContactNo(String customerContactNo) {
		this.customerContactNo = customerContactNo;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "CustomerMaster [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", customerCity=" + customerCity + ", customerContactNo=" + customerContactNo + ", occupation="
				+ occupation + ", dateOfBirth=" + dateOfBirth + "]";
	}

//	public Set<LoanDetails> getLoanDetails() {
//		return loanDetails;
//	}
//
//	public void setLoanDetails(Set<LoanDetails> loanDetails) {
//		this.loanDetails = loanDetails;
//	}
	
	
	
}
