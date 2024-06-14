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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Settlement;
import com.example.demo.service.SettlementService;

@RestController
@RequestMapping("/settle")
public class SettlementController {

	@Autowired
	private SettlementService settlementService;

	@PostMapping("/savesettle")
	public Settlement saveSettle(@RequestBody Settlement settlement) {
		Settlement set = settlementService.saveSettle(settlement);
		return set;
	}

	@GetMapping("/getsettlement/{id}")
	public Settlement getSettlementById(@PathVariable("id") int settleId) {
		Settlement settlement1 = settlementService.getSettlementById(settleId);
		return settlement1;
	}

	@PutMapping("/updateSettlement/{id}")
	public Settlement updateSettlement(@PathVariable int id, @RequestBody Settlement settlement) {
		Settlement settlement2 = settlementService.updateSettlementById(id, settlement);
		return settlement2;
	}

	@DeleteMapping("/deletesettle/{id}")
	public void deleteSettle(@PathVariable int id) {
		settlementService.deleteSettle(id);
	}

}
