package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Claim;
import com.example.demo.service.ClaimService;

@RestController
@RequestMapping("/claim")
public class ClaimController {

	@Autowired
	private ClaimService claimService;

	@PostMapping("/saveclaim")
	public ResponseEntity<Claim> saveClaim(@RequestBody Claim claim) {
		Claim claim2 = claimService.saveClaim(claim);
		return ResponseEntity.ok().body(claim2);
	}

	@GetMapping("/getclaimbyid/{id}")
	public Claim getClaim(@PathVariable int id) {

		Claim claim = claimService.getClaimById(id);
		return claim;
	}

	@PutMapping("/updateclaim/{id}")
	public ResponseEntity<Claim> updateClaim(@PathVariable int id,@RequestBody Claim claim) {
		Claim claim2 = claimService.updateClaim(id,claim);
		return ResponseEntity.ok().body(claim);
	}

}     
