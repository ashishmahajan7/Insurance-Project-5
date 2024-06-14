package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.NoSuchClaimExistException;
import com.example.demo.model.Claim;
import com.example.demo.repo.ClaimRepo;

@Service
public class ClaimService {

	@Autowired
	private ClaimRepo claimRepo;

	public Claim saveClaim(Claim claim) {

		String currentStatus = claim.getStatus();
		String status = "Approved";

		if (currentStatus.equalsIgnoreCase(status)) {
			return claimRepo.save(claim);
		} else {
			claim.setSettlement(null);
			return claimRepo.save(claim);
		}
	}

	public Claim updateClaim(int id, Claim claim) {
		Claim oldClaim = claimRepo.findById(id)
				.orElseThrow(() -> new NoSuchClaimExistException("No Claim request present with Id>>" + id));

		String currentStatus = claim.getStatus();
		String status = "Approved";
		if (currentStatus.equalsIgnoreCase(status)) {
			oldClaim.setClaimId(claim.getClaimId());
			oldClaim.setClaimType(claim.getClaimType());
			oldClaim.setClaimDate(claim.getClaimDate());
			oldClaim.setDescription(claim.getDescription());
			oldClaim.setIncidentDate(claim.getIncidentDate());
			oldClaim.setStatus(claim.getStatus());
			oldClaim.setUserId(claim.getUserId());
			oldClaim.setSettlement(claim.getSettlement());
		} else {
			oldClaim.setSettlement(null);

		}
		return claimRepo.save(oldClaim);

	}

	public Claim getClaimById(int id) {
		Claim claim = claimRepo.findById(id)
				.orElseThrow(() -> new NoSuchClaimExistException("No Claim request present with Id>>" + id));
		String currentStatus = claim.getStatus();
		String status = "Approved";
		if (currentStatus.equalsIgnoreCase(status)) {
			return claim;
		} else {
			claim.setSettlement(null);
			return claim;
		}
	}

//	public Claim getClaimSettlement(int id, Settlement settlement) {
//		
//		Claim claim = claimRepo.findById(id)
//				.orElseThrow(() -> new NoSuchClaimExistException("No Customer Present with Id>>" + id));
//		;
//		String currentStatus = claim.getStatus();
//
//		String status = "approved";
//		if (currentStatus.equalsIgnoreCase(status)) {
//
//		claimRepo.getClaimSettle(id);
//		}
//		return null;
//	}

}
