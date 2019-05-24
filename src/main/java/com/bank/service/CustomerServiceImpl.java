package com.bank.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bank.model.CustomerMaster;
import com.bank.repository.CustomerJpaRepository;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class CustomerServiceImpl implements CustomerService{

	@PersistenceContext
	EntityManager entityManager;
	
	@Autowired
	CustomerJpaRepository customerJpaRepository;
	
	@Override
	public List<CustomerMaster> findAllCustomers() {
		
		List<CustomerMaster> customerList = customerJpaRepository.findAll();
		return customerList;
	}

	@Override
	public CustomerMaster saveCustomer(CustomerMaster customerMaster) {
		CustomerMaster savedCustomer =  customerJpaRepository.saveAndFlush(customerMaster);
		return savedCustomer;
	}

	@Override
	public CustomerMaster findByCustomerNumber(String customerNumber) {
		CustomerMaster customer = customerJpaRepository.findBycustomerNumber(customerNumber);
		return customer;
	}

	@Override
	public CustomerMaster deleteByCustomerNumber(String customerNumber) {
		CustomerMaster customer = customerJpaRepository.findBycustomerNumber(customerNumber);
		customerJpaRepository.deleteById(customerNumber);
		return customer;
	}

	@Override
	public CustomerMaster updateCustomer(CustomerMaster customer) {
		CustomerMaster CustomerToUpdate = customerJpaRepository.findBycustomerNumber(customer.getCustomerNumber());
		CustomerToUpdate.setCustomerCity(customer.getCustomerCity());
		CustomerToUpdate.setOccupation(customer.getOccupation());
		CustomerToUpdate.setFirstName(customer.getFirstName());
		CustomerToUpdate.setCustomerContactNo(customer.getCustomerContactNo());
		customerJpaRepository.saveAndFlush(CustomerToUpdate);
		return CustomerToUpdate;
	}

	@Override
	public boolean isCustomerValid(String customerNumber) {
		CustomerMaster customer = findByCustomerNumber(customerNumber);
		if (null!=customer) {
			return true;
		}
		return false;
	}

	
	
}
