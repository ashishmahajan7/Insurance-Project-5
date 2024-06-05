package com.example.demo.model;

import java.time.LocalDate;

public class PolicyDto {

	private Integer policyId;
	private String policyType;
	private LocalDate policyIssueDate;
	private LocalDate policyExpiryDate;
	private long policyAmount;
	private String policyBenefits;
	private String policyDescription;

	@Override
	public String toString() {
		return "PolicyDto [policyId=" + policyId + ", policyType=" + policyType + ", policyIssueDate=" + policyIssueDate
				+ ", policyExpiryDate=" + policyExpiryDate + ", policyAmount=" + policyAmount + ", policyBenefits="
				+ policyBenefits + ", policyDescription=" + policyDescription + "]";
	}

	public Integer getPolicyId() {
		return policyId;
	}

	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public LocalDate getPolicyIssueDate() {
		return policyIssueDate;
	}

	public void setPolicyIssueDate(LocalDate policyIssueDate) {
		this.policyIssueDate = policyIssueDate;
	}

	public LocalDate getPolicyExpiryDate() {
		return policyExpiryDate;
	}

	public void setPolicyExpiryDate(LocalDate policyExpiryDate) {
		this.policyExpiryDate = policyExpiryDate;
	}

	public long getPolicyAmount() {
		return policyAmount;
	}

	public void setPolicyAmount(long policyAmount) {
		this.policyAmount = policyAmount;
	}

	public String getPolicyBenefits() {
		return policyBenefits;
	}

	public void setPolicyBenefits(String policyBenefits) {
		this.policyBenefits = policyBenefits;
	}

	public String getPolicyDescription() {
		return policyDescription;
	}

	public void setPolicyDescription(String policyDescription) {
		this.policyDescription = policyDescription;
	}

}
