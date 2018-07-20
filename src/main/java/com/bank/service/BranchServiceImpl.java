package com.bank.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bank.model.BranchMaster;
import com.bank.repository.BranchRepository;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class BranchServiceImpl implements BranchService{

	@PersistenceContext
	EntityManager entityManager;
	
	@Autowired
	BranchRepository branchRepo;
	
	private static final Logger LOG = LoggerFactory.getLogger(BranchServiceImpl.class);
	
	
	@Override
	public List<BranchMaster> findAllBranchs(int branchId) {
		List<BranchMaster> BranchMasters = (List<BranchMaster>) branchRepo.findAll();
		return BranchMasters;
	}

	@Override
	public void saveBranch(BranchMaster branchMaster) {
		branchRepo.save(branchMaster);
		LOG.info("BranchMaster is saved");
		
	}

	@Override
	public BranchMaster findByBranchNumber(String branchId) {
		//List<BranchMaster> branchMasters = null;
		//Optional<BranchMaster> b ;
		//branchMasters = entityManager.createQuery("select bm from BranchMaster bm").getResultList();
		BranchMaster branch =  entityManager.find(BranchMaster.class, branchId);
		return branch;
	}
	
	

}
