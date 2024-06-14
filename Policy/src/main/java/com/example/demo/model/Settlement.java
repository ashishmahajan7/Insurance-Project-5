package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Settlement {

//	Claim claim;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int settleId;
	private String settlementType;
	private int amount;

	// private String policyId;
	public Settlement() {
		super();
	}

	@Override
	public String toString() {
		return "Settlement [settleId=" + settleId + ", settlementType=" + settlementType + ", amount=" + amount + "]";
	}

	public Settlement(int settleId, String settlementType, int amount) {
		super();
		this.settleId = settleId;
		this.settlementType = settlementType;
		this.amount = amount;
	}

	public int getSettleId() {
		return settleId;
	}

	public void setSettleId(int settleId) {
		this.settleId = settleId;
	}

	public String getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(String settlementType) {
		this.settlementType = settlementType;
//		String s1 = claim.getStatus();
//		String s2 = "Approved";
//		if (s1.equalsIgnoreCase(s2)) {
//			this.settlementType = settlementType;
//		} else
//			this.settlementType = null;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
