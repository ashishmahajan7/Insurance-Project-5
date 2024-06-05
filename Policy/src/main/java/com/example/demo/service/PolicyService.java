package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PolicyModel;
import com.example.demo.repo.PolicyRepo;

@Service
public class PolicyService {

	@Autowired
	private PolicyRepo policyRepo;
	
	public PolicyModel SavePolicy(PolicyModel policyModel) {
		PolicyModel policyModel1=policyRepo.save(policyModel);
		return policyModel1;
	}
	
	public PolicyModel getPolicy(int id) {
		PolicyModel policyModel2=policyRepo.findById(id);
		return policyModel2;
	}
	public PolicyModel updatePolicy(PolicyModel policy, int policyId) {
		policy.setPolicyId(policyId);
		return policyRepo.save(policy);
	}

	public void deleteById(int policyId) {
		policyRepo.deleteById(policyId);
}
}