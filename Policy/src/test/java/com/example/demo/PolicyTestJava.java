package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.PolicyModel;
import com.example.demo.repo.PolicyRepo;
import com.example.demo.service.PolicyService;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class PolicyTestJava {
	
	@InjectMocks
	PolicyService policyService;
	
	@Mock
	PolicyRepo policyRepo;
	
	@org.junit.Test
	public void savePolicyTest() {
		LocalDate issuedate = LocalDate.of(2024, 05, 25);
		PolicyModel model = new PolicyModel(1, "Car Insurance", issuedate, issuedate.plusYears(1), 24000, "lawsuits", "description", "Credit card");
		when(policyRepo.save(model)).thenReturn(model);
		assertEquals(model, policyService.SavePolicy(model));
	}
	
	@Test
	public void getPolicyByIdTest() {
		LocalDate issuedate = LocalDate.of(2024, 05, 25);
		
		when(policyRepo.findById(1)).thenReturn(new PolicyModel(1, "Car Insurance", issuedate, issuedate.plusYears(1), 24000, "lawsuits", "description", "Credit card"));
		
		PolicyModel model = policyService.getPolicy(1);
		assertEquals("Car Insurance", model.getPolicyType());
		assertEquals(issuedate, model.getPolicyIssueDate());
		assertEquals(issuedate.plusYears(1), model.getPolicyExpiryDate());
		assertEquals(24000, model.getPolicyAmount());
		assertEquals("lawsuits", model.getPolicyBenefits());
		assertEquals("description", model.getPolicyDescription());
		assertEquals("Credit card", model.getPolicyPaymentOption());
	}
	

}
