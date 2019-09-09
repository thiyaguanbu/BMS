package com.bank;

import static org.junit.Assert.assertEquals;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bank.model.BranchMaster;
import com.bank.repository.BranchJpaRepository;
import com.bank.service.BranchService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BankManagementSystemApplicationTests {

	@Autowired
	BranchService branchService;
	
	@Autowired
	BranchJpaRepository branchJpaRepository;
	
	@Test
	public void contextLoads() {
	}

	@Test
	@Transactional
	public void testUpdateBankDetails() {
		BranchMaster branch = new BranchMaster("Guindy", "chennai");
		branch.setBranchId("80000");
		BranchMaster updatedBranch = branchService.updateBranch(branch);
		assertEquals("Guindy", updatedBranch.getBranchName());
	}
	
	@Test
	@Transactional
	public void testSaveBranchDetails() {
		BranchMaster branch = new BranchMaster("Guindy", "chennai");
		branch.setBranchId("80000");
		branchService.saveBranch(branch);
		BranchMaster savedBranch = branchJpaRepository.findByBranchName("Guindy");
		assertEquals("Guindy", savedBranch.getBranchName());

	}
	
	public void testGetBranchDetails() {
		BranchMaster branch = branchService.findByBranchId("800001");
		assertEquals("800001", branch.getBranchId());
	}
}
