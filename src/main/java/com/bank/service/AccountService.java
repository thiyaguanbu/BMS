package com.bank.service;

import java.util.List;

import com.bank.model.AccountMaster;

public interface AccountService {
	
	AccountMaster saveAccountDetails(AccountMaster account);
	AccountMaster getAccountdetails(Long accountNumber);

	
    List<AccountMaster> getAllAccounts();
    AccountMaster getAccountByNumber(Long AccountNumber);
}
