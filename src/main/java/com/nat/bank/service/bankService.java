package com.nat.bank.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.nat.bank.entities.Bankaccount;
import com.nat.bank.entities.Client;
import com.nat.bank.entities.Operation;

public interface bankService {

	List<Bankaccount> getBankAccounts();
	
	Bankaccount getBackAccount(int accountNum);

	void addBankAccount(Bankaccount bankaccount);

	List<Client> getClients();
	
	Client getClient(int id);

	void addClient(Client client);

	List<Operation> getOperations();

	void addOperation(Operation operation);

	List<Operation> getAllTransactions(String type, Date datefrom, Date dateto);

	List<Bankaccount> listAllAccounts(int clientId);

	boolean closeAccount(int number);

	boolean deposit(BigDecimal amount, int accountNumber);

	boolean withdraw(BigDecimal amount, int accountNumber);

	boolean transfer(BigDecimal amount, int accountNumber1, int accountNumber2);
}
