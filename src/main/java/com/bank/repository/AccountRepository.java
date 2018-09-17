package com.bank.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bank.model.AccountMaster;

@Repository
public interface AccountRepository extends CrudRepository<AccountMaster, Long>{

	
	
}
