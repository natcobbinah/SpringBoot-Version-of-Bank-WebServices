package com.nat.bank.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nat.bank.entities.Bankaccount;

@Repository
public interface BankRepository extends JpaRepository<Bankaccount, Integer> {

	/*
	 * @Query("select * from bankaccount where clientid=id") public
	 * List<Bankaccount> listAll_accounts(int id);
	 * 
	 * @Query("update bankaccount set accountStatus=\"CLOSED\" where accountNumber=number"
	 * ) boolean closeAccount(int number);
	 */
}	
