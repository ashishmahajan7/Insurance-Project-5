package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Bill;

@Repository
public interface BillRepository extends JpaRepository<Bill, Serializable> {

	public Bill findById(Integer id);

}
