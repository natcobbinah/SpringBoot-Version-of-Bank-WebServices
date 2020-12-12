package com.nat.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nat.bank.entities.Bankaccount;

@Repository
public interface BankRepository extends JpaRepository<Bankaccount, Integer> {

}
