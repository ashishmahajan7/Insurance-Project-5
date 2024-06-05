package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.PolicyModel;
import com.example.demo.service.PolicyService;
//controller
@RestController
@RequestMapping("/policy")
public class PolicyController {
	@Autowired
	PolicyService policyService;
	
	@PostMapping("/addpolicy")
	public ResponseEntity<PolicyModel> savePolicy(@RequestBody PolicyModel policyModel) {
		PolicyModel policyModel2=policyService.SavePolicy(policyModel);
		return ResponseEntity.ok().body(policyModel2);
	}
	
	@GetMapping("/getpolicy/{id}")
	public ResponseEntity<PolicyModel> getPolicy(@PathVariable("id") Integer policyId) {
		PolicyModel policyModel2=policyService.getPolicy(policyId);
		return ResponseEntity.ok().body(policyModel2);
	}
	@PutMapping("/updatepolicy/{id}")
	public PolicyModel updatePolicy(@RequestBody PolicyModel policy, @PathVariable("id") int policyId) {
		return policyService.updatePolicy(policy, policyId);
	}

	@DeleteMapping("deletepolicy/{id}")
	public void deleteById(@PathVariable("id") int policyId) {
		policyService.deleteById(policyId);  
	}
}
