package com.bank.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bank.model.CustomerMaster;
import com.bank.repository.CustomerRepository;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class CustomerServiceImpl implements CustomerService{

	@PersistenceContext
	EntityManager entityManager;
	
	@Autowired
	CustomerRepository customerRepo;
	
	@Override
	public List<CustomerMaster> findAllCustomers() {
		return (List<CustomerMaster>) customerRepo.findAll();
	}

	@Override
	public CustomerMaster saveCustomer(CustomerMaster customerMaster) {
		CustomerMaster savedCustomer =  customerRepo.save(customerMaster);
		return savedCustomer;
	}

	@Override
	public CustomerMaster findByCustomerNumber(String customerNumber) {
		CustomerMaster customer = entityManager.find(CustomerMaster.class, customerNumber);
		return customer;
	}

	
	
}
