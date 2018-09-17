package com.bank.repository;

import org.springframework.data.repository.CrudRepository;

import com.bank.model.LoanDetails;

public interface LoanRepository extends CrudRepository<LoanDetails, Long>{

	
}
