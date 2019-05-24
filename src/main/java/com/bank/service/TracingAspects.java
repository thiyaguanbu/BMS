package com.bank.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.bank.model.BranchMaster;

@Aspect
@Component
public class TracingAspects {
	
	public boolean isEnteringCalled =false;
	
	public boolean isEnteringCalled() {
		return isEnteringCalled;
	}
	
	private static final Logger LOG = LoggerFactory.getLogger(TracingAspects.class);
	
	@Before("execution(BranchMaster findByBranchId(String branchId))")
	public void entering(JoinPoint joinPoint) {
		isEnteringCalled = true;
		LOG.trace("entering"+joinPoint.getStaticPart().getSignature().toString());
	}

}
