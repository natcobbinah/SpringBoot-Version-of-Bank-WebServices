package com.nat.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nat.bank.entities.Operation;

@Repository
public interface OperationRepository extends JpaRepository<Operation, Integer> {

}
