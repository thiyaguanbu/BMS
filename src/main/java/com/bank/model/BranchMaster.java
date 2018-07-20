package com.bank.model;

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

@Entity
@Table(name = "branch_master",uniqueConstraints = @UniqueConstraint(columnNames = "branch_name"))
public class BranchMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "branch_id")
	private String branchId;
	
	@Column(name = "branch_name")
	@NotNull
	private String branchName;
	
	@Column(name = "branch_city")
	@NotNull
	private String branchCity;

	@OneToMany(mappedBy = "branchMaster", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<AccountMaster> accountMasters;
	
	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchCity() {
		return branchCity;
	}

	public void setBranchCity(String branchCity) {
		this.branchCity = branchCity;
	}

	public Set<AccountMaster> getAccountMasters() {
		return accountMasters;
	}

	public void setAccountMasters(Set<AccountMaster> accountMasters) {
		this.accountMasters = accountMasters;
	}

	public BranchMaster() {
		
	}
	
	
	public BranchMaster(@NotNull String branchName, @NotNull String branchCity) {
		super();
		this.branchName = branchName;
		this.branchCity = branchCity;
	}

	public BranchMaster(@NotNull String branchName, @NotNull String branchCity, Set<AccountMaster> accountMasters) {
		super();
		this.branchName = branchName;
		this.branchCity = branchCity;
		this.accountMasters = accountMasters;
	}

	@Override
	public String toString() {
		return "BranchMaster [branchId=" + branchId + ", branchName=" + branchName + ", branchCity=" + branchCity + "]";
	}

	
	
		
	
	

}
