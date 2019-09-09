package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.model.CustomerMaster;

public interface CustomerJpaRepository extends JpaRepository<CustomerMaster, String> {
	
	CustomerMaster findBycustomerNumber(String customerNumber);
	CustomerMaster findByfirstName(String firstName);
	CustomerMaster findBycustomerContactNo(String contactNo);

}
