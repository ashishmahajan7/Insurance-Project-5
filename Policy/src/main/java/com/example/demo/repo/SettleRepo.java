package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Settlement;

@Repository
public interface SettleRepo extends JpaRepository<Settlement, Integer>{

	Settlement save(Settlement settlement);

	Settlement findBySettleId(int settleId);

	

}
