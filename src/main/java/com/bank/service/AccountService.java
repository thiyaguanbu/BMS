package com.bank.service;

import com.bank.model.AccountMaster;

public interface AccountService {
	
	AccountMaster saveAccountDetails(AccountMaster account);
	AccountMaster getAccountdetails(Long accountNumber);

}
