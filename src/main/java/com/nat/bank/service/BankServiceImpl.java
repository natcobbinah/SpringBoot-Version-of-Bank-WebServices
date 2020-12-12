package com.nat.bank.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nat.bank.entities.Bankaccount;
import com.nat.bank.entities.Client;
import com.nat.bank.entities.Operation;
import com.nat.bank.repository.BankRepository;
import com.nat.bank.repository.ClientRepository;
import com.nat.bank.repository.OperationRepository;

public class BankServiceImpl implements bankService {

	@Autowired
	BankRepository bankRepository;
	
	@Autowired
	ClientRepository clientRepository;
	
	@Autowired
	OperationRepository operationRepository;
	
	@Override
	public List<Bankaccount> getBankAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addBankAccount(Bankaccount bankaccount) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Client> getClients() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addClient(Client client) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Operation> getOperations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addOperation(Operation operation) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Operation> getAllTransactions(String type, Date datefrom, Date dateto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bankaccount> listAllAccounts(int accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean closeAccount(int number) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deposit(BigDecimal amount, int accountNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean withdraw(BigDecimal amount, int accountNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean transfer(BigDecimal amount, int accountNumber1, int accountNumber2) {
		// TODO Auto-generated method stub
		return false;
	}

}
