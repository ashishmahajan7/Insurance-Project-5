package com.example.demo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicInsert
@DynamicUpdate
public class PolicyModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long policyId;
	private String policyType;
	private LocalDate policyIssueDate;
	private LocalDate policyExpiryDate;
	private long policyAmount;
	private String policyBenefits;
	private String policyDescription;
	private String policyPaymentOption;

	public PolicyModel() {
		super();
	}

	@Override
	public String toString() {
		return "PolicyModel [policyId=" + policyId + ", policyType=" + policyType + ", policyIssueDate="
				+ policyIssueDate + ", policyExpiryDate=" + policyExpiryDate + ", policyAmount=" + policyAmount
				+ ", policyBenefits=" + policyBenefits + ", policyDescription=" + policyDescription
				+ ", policyPaymentOption=" + policyPaymentOption + "]";
	}

	public PolicyModel(long policyId, String policyType, LocalDate policyIssueDate, LocalDate policyExpiryDate,
			long policyAmount, String policyBenefits, String policyDescription, String policyPaymentOption) {
		super();
		this.policyId = policyId;
		this.policyType = policyType;
		this.policyIssueDate = policyIssueDate;
		this.policyExpiryDate = policyIssueDate.plusYears(1);
		this.policyAmount = policyAmount;
		this.policyBenefits = policyBenefits;
		this.policyDescription = policyDescription;
		this.policyPaymentOption = policyPaymentOption;
	}

	public long getPolicyId() {
		return policyId;
	}

	public void setPolicyId(long policyId) {
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

	public String getPolicyPaymentOption() {
		return policyPaymentOption;
	}

	public void setPolicyPaymentOption(String policyPaymentOption) {
		this.policyPaymentOption = policyPaymentOption;
	}

}
