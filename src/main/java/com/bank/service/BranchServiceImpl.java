package com.bank.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bank.model.BranchMaster;
import com.bank.repository.BranchJpaRepository;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class BranchServiceImpl implements BranchService{

	@PersistenceContext
	EntityManager entityManager;
	
	
	@Autowired
	BranchJpaRepository branchRepo;
	
	private static final Logger LOG = LoggerFactory.getLogger(BranchServiceImpl.class);
	
	
	

	@Override
	public void saveBranch(BranchMaster branchMaster) {
		branchRepo.saveAndFlush(branchMaster);
		LOG.info("BranchMaster is saved");
		
	}


	@Override
	public BranchMaster findByBranchId(String branchId) {
		BranchMaster branch = branchRepo.findByBranchId(branchId);
		return branch;
	}


	@Override
	public List<BranchMaster> findAllBranches() {
		List<BranchMaster> branchList = branchRepo.findAll();
		return branchList;
	}


	@Override
	public String deleteBranchById(String branchId) {
		branchRepo.deleteById(branchId);
		return "Branch Deleted successfully";
	}


	@Override
	public BranchMaster updateBranch(BranchMaster branch) {
		BranchMaster oldBranch = branchRepo.findByBranchId(branch.getBranchId());
		if(null!=oldBranch) {
			oldBranch.setBranchName(branch.getBranchName());
			branchRepo.saveAndFlush(oldBranch);
		}
		return branch;
	}


	@Override
	public boolean isBranchValid(String branchId) {
		BranchMaster branch = findByBranchId(branchId);
		
		if(null!=branch)
			return true;

		return false;
	}


	

	
	
	

}
