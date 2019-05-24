package com.bank.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.CustomerMaster;
import com.bank.service.CustomerService;

@RestController
@RequestMapping(value="/bms")
public class CustomerMasterController {
	
	
	@Autowired
	CustomerService customerService;

	@RequestMapping(value="/customers", method=RequestMethod.GET)
	public List<CustomerMaster> getAllCustomerDetails() {
		List<CustomerMaster> customerList = customerService.findAllCustomers();
		return customerList;
	}
	
	@RequestMapping(value="/customer", method=RequestMethod.POST)
	public CustomerMaster saveCustomer(@Valid @RequestBody CustomerMaster customer) {
		CustomerMaster savedCustomer = customerService.saveCustomer(customer);
		return savedCustomer;
	}
	
	@RequestMapping(value="/customer", method=RequestMethod.PUT)
	public CustomerMaster updateCustomer(@Valid @RequestBody CustomerMaster customer) {
		CustomerMaster updatedCustomer = customerService.updateCustomer(customer);
		return updatedCustomer;
	}
	
	@RequestMapping(value="/customer/{number}", method=RequestMethod.DELETE)
	public CustomerMaster deleteCustomer(@PathVariable(value="number") String customerNumber) {
		CustomerMaster deletedCustomer = customerService.deleteByCustomerNumber(customerNumber);
		return deletedCustomer;
	}
	
	@RequestMapping(value="/customer/{number}", method=RequestMethod.GET)
	public CustomerMaster getCustomerByNumber(@PathVariable(value="number") String customerNumber) {
		CustomerMaster customer = customerService.findByCustomerNumber(customerNumber);
		return customer;
	}
	
}
