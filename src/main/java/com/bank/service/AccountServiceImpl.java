package com.bank.service;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bank.model.AccountMaster;
import com.bank.repository.AccountRepository;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService{

	@PersistenceContext
	EntityManager entityManager;
	
	@Autowired
	AccountRepository accountRepo;
	
	
	@Override
	public AccountMaster saveAccountDetails(AccountMaster account) {
		AccountMaster am = accountRepo.save(account);
		return am;
	}


	@Override
	public AccountMaster getAccountdetails(Long accountNumber) {
		AccountMaster am = entityManager.find(AccountMaster.class, accountNumber);
		return am;
	}
	
	

	
}
