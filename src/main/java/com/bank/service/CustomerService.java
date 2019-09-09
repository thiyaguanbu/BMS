package com.bank.service;

import java.util.List;

import com.bank.model.CustomerMaster;

public interface CustomerService {
	

	 List<CustomerMaster> findAllCustomers();
	 CustomerMaster saveCustomer(CustomerMaster customerMaster);
	 CustomerMaster findByCustomerNumber(String customerNumber);
	 CustomerMaster deleteByCustomerNumber(String customerNumber);
	 CustomerMaster updateCustomer(CustomerMaster customer);
	 
	 boolean isCustomerValid(String customerNumber);

}
