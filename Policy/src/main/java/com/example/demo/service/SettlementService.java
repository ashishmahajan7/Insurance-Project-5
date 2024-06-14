package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Settlement;
import com.example.demo.repo.SettleRepo;

@Service
public class SettlementService {
	
	@Autowired
	private SettleRepo settleRepo;

//	public Settlement saveSettlement(Settlement settlement) {
//		return settleRepo.save(settlement);
//	}

	public Settlement getSettlementById(int settleId) {
		Settlement settle = settleRepo.findBySettleId(settleId);
		return settle;
	}

//	public void deleteSettlementById(Settlement id) {
//		settleRepo.deleteById(id);
//
//	}

	public Settlement updateSettlementById(int id, Settlement settlement) {
		Optional<Settlement> oldSettlement = settleRepo.findById(id);

		if (oldSettlement.isPresent()) {
			Settlement settle = oldSettlement.get();
			settle.setSettleId(settlement.getSettleId());
			settle.setSettlementType(settle.getSettlementType());
			settle.setAmount(settlement.getAmount());
			return settleRepo.save(settle);
		} else {
			throw new RuntimeException("Settlement not found");
		}

	}

	public Settlement saveSettle(Settlement settlement) {

		return settleRepo.save(settlement);
	}



	public void deleteSettle(int id) {
		settleRepo.deleteById(id);
		
	}

}
