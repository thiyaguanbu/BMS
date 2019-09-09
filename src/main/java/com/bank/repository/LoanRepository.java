package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.bank.model.LoanDetails;

public interface LoanRepository extends JpaRepository<LoanDetails, Long>{

	
}
