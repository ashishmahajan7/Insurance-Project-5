package com.example.demo.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Claim {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int claimId;
	private String claimType;
	private LocalDate incidentDate;
	private String description;
	private int userId;
	private String status;
	private LocalDate claimDate;

	@OneToOne(targetEntity = Settlement.class, cascade = CascadeType.ALL)
	private Settlement settlement;

	@Override
	public String toString() {
		return "Claim [claimId=" + claimId + ", claimType=" + claimType + ", incidentDate=" + incidentDate
				+ ", description=" + description + ", userId=" + userId + ", status=" + status + ", claimDate="
				+ claimDate + ", settlement=" + settlement + "]";
	}

	public Claim() {
		super();
	}

	public Claim(int claimId, String claimType, LocalDate incidentDate, String description, int userId, String status,
			LocalDate claimDate, Settlement settlement) {
		super();
		this.claimId = claimId;
		this.claimType = claimType;
		this.incidentDate = LocalDate.now();
		this.description = description;
		this.userId = userId;
		this.status = status;
		this.claimDate = claimDate;
		this.settlement= settlement;

	}

	public int getClaimId() {
		return claimId;
	}

	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}

	public String getClaimType() {
		return claimType;
	}

	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}

	public LocalDate getIncidentDate() {
		return incidentDate;
	}

	public void setIncidentDate(LocalDate incidentDate) {
		this.incidentDate = LocalDate.now();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getClaimDate() {
		return claimDate;
	}

	public void setClaimDate(LocalDate claimDate) {
		this.claimDate = claimDate;
	}

	public Settlement getSettlement() {
		return settlement;
	}

	public void setSettlement(Settlement settlement) {
		this.settlement = settlement;
	}
	

}
