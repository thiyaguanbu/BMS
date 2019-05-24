package com.bank.service;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bank.model.AccountMaster;
import com.bank.repository.AccountJpaRepository;
import com.bank.repository.AccountRepository;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService{

	@PersistenceContext
	EntityManager entityManager;
	
	@Autowired
	AccountRepository accountRepo;
	
	@Autowired
	AccountJpaRepository accountJpaRepository;
	
	
	
	//crudrepo
	@Override
	public AccountMaster saveAccountDetails(AccountMaster account) {
		AccountMaster am = accountJpaRepository.saveAndFlush(account);
		return am;
	}


	@Override
	public AccountMaster getAccountdetails(Long accountNumber) {
		AccountMaster am = entityManager.find(AccountMaster.class, accountNumber);
		return am;
	}
	
	//ends
	
	
	//jparepo
	
	public List<AccountMaster> getAllAccounts(){
		List<AccountMaster> accountList = accountJpaRepository.findAll();
		return accountList;
	}
	
	
	public AccountMaster getAccountByNumber(Long AccountNumber) {
		return accountJpaRepository.findById(AccountNumber).get();
	}


	
	
	
	

	
}
