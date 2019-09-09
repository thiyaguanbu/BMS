package com.bank.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.BranchMaster;
import com.bank.service.BranchService;

@RestController
@RequestMapping("/bms")
public class BranchMasterController {

	@Autowired
	BranchService branchService;
	
	@RequestMapping(value="/branches", method=RequestMethod.GET)
	public List<BranchMaster> getAllBranchDetails() {
		List<BranchMaster> branches = branchService.findAllBranches();
		return branches;
	}
	
	@RequestMapping(value="/branch", method=RequestMethod.POST)
	public void saveBranch(@Valid @RequestBody BranchMaster branch) {
		branchService.saveBranch(branch);
	}
	
	@RequestMapping(value="/branch/{id}", method=RequestMethod.GET)
	public BranchMaster getBranchById(@PathVariable(value="id") String id) {
		BranchMaster branch = branchService.findByBranchId(id);
		return branch;
	}
	
	@RequestMapping(value="/branch/{id}", method=RequestMethod.DELETE)
	public String deleteBranchById(@PathVariable(value="id") String id) {
		return branchService.deleteBranchById(id);
	}
	
	@RequestMapping(value="/branch", method=RequestMethod.PUT)
	public void updateBranch(@Valid @RequestBody BranchMaster branch) {
		branchService.updateBranch(branch);
	}
}
