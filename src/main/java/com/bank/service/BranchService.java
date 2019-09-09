package com.bank.service;

import java.util.List;

import com.bank.model.BranchMaster;


public interface BranchService {

	 List<BranchMaster> findAllBranches();
	 void saveBranch(BranchMaster branchMaster);
	 BranchMaster findByBranchId(String branchId);
	 String deleteBranchById(String branchId);
	 BranchMaster updateBranch(BranchMaster branch);
	 
	 boolean isBranchValid(String branchId);
	
}
