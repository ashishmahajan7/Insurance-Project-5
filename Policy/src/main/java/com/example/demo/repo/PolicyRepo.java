package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PolicyModel;

@Repository
public interface PolicyRepo extends JpaRepository<PolicyModel, Long>{
  public PolicyModel findById(long id);
}
