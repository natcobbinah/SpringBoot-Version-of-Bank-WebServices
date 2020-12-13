package com.nat.bank.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nat.bank.entities.Operation;

@Repository
public interface OperationRepository extends JpaRepository<Operation, Integer> {

	/*
	 * @Query("select * from operations where operationType=\"type\" and doneAt between \"datefrom\" and \"dateto\""
	 * ) List<Operation> getAllTransactions(String type, Date datefrom, Date
	 * dateto);
	 */
}
