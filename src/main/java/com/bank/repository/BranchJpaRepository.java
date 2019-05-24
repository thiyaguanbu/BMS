package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.model.BranchMaster;

@Repository
public interface BranchJpaRepository extends JpaRepository<BranchMaster, String>{
	
	BranchMaster findByBranchId(String branchId);
	BranchMaster findByBranchName(String branchName);

}
