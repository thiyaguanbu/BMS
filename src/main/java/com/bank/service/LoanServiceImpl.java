package com.bank.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bank.model.LoanDetails;
import com.bank.repository.LoanRepository;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class LoanServiceImpl implements LoanService{
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Autowired
	LoanRepository loanRepo;

	@Override
	public LoanDetails saveLoanDetails(LoanDetails loan) {
		LoanDetails loanDetail = loanRepo.save(loan);
		return loanDetail;
	}

	@Override
	public LoanDetails getLoanDetails(Long loanNumber) {
		LoanDetails loanDetail = entityManager.find(LoanDetails.class, loanNumber);
		return loanDetail;
	}
	
	

}
