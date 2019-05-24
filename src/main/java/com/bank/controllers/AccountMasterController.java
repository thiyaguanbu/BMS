package com.bank.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.AccountMaster;
import com.bank.service.AccountService;

@RestController
@RequestMapping("/bms")
public class AccountMasterController {

	@Autowired
	AccountService accountService;
	
	@RequestMapping(value="/accounts",method=RequestMethod.GET)
	public List<AccountMaster> getAllAccountDetails(){
		
		List<AccountMaster> accountList = accountService.getAllAccounts();
		return accountList;
	}
	
	
	@RequestMapping(value="/account/{accountNumber}",method=RequestMethod.GET)
	public AccountMaster getAccountDetailByNumber(@PathVariable(value="accountNumber") Long accountNumber){
		AccountMaster account = accountService.getAccountByNumber(accountNumber);
		 return account;
	}
	
	
	@RequestMapping(value="/account", method = RequestMethod.POST)
	public void saveAccountDetail(@RequestBody AccountMaster account) {
		AccountMaster savedAccount = accountService.saveAccountDetails(account);

	}
	
}
