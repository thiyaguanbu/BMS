package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.model.AccountMaster;

@Repository
public interface AccountJpaRepository extends JpaRepository<AccountMaster, Long> {

}
