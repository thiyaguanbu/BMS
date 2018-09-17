package com.bank.service;

import com.bank.model.LoanDetails;

public interface LoanService {
	
	LoanDetails saveLoanDetails(LoanDetails loan);
	LoanDetails getLoanDetails(Long loadNumber);

}
