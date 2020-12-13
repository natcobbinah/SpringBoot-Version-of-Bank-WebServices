package com.nat.bank.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nat.bank.entities.Bankaccount;
import com.nat.bank.entities.Client;
import com.nat.bank.entities.Operation;
import com.nat.bank.repository.BankRepository;
import com.nat.bank.repository.ClientRepository;
import com.nat.bank.repository.OperationRepository;

@Service
public class BankServiceImpl implements bankService {

	@Autowired
	BankRepository bankRepository;
	
	@Autowired
	ClientRepository clientRepository;
	
	@Autowired
	OperationRepository operationRepository;
	
	@Override
	public List<Bankaccount> getBankAccounts() {
		return bankRepository.findAll();
	}
	
	@Override
	public Bankaccount getBackAccount(int accountNum) {
		return bankRepository.findById(accountNum).get();
	}

	@Override
	public void addBankAccount(Bankaccount bankaccount) {
		bankRepository.save(bankaccount);
	}

	@Override
	public List<Client> getClients() {
		 return clientRepository.findAll();
	}
	
	@Override
	public Client getClient(int id) {
		return clientRepository.findById(id).get();
	}

	@Override
	public void addClient(Client client) {
		clientRepository.save(client);
	}

	@Override
	public List<Operation> getOperations() {
		return operationRepository.findAll();
	}

	@Override
	public void addOperation(Operation operation) {
		operationRepository.save(operation);
	}

	@Override
	public List<Operation> getAllTransactions(String type, Date datefrom, Date dateto) {
		//return operationRepository.getAllTransactions(type, datefrom, dateto);
		return null;
	}

	@Override
	public List<Bankaccount> listAllAccounts(int clientId) {
		//return bankRepository.listAll_accounts(clientId);
		return null;
	}

	@Override
	public boolean closeAccount(int number) {
		//return bankRepository.closeAccount(number);
		return false;
	}

	@Override
	public boolean deposit(BigDecimal amount, int accountNumber) {
		Bankaccount findById = bankRepository.findById(accountNumber).get();
		BigDecimal previousbalance = findById.getBalance();
		BigDecimal newbalance = previousbalance.add(amount);
		findById.setBalance(newbalance);
		bankRepository.save(findById);
		return true;
	}

	@Override
	public boolean withdraw(BigDecimal amount, int accountNumber) {
		Bankaccount findaccount_num = bankRepository.findById(accountNumber).get();
		BigDecimal previousBalance = findaccount_num.getBalance();
		BigDecimal newbalance = previousBalance.subtract(amount);
		findaccount_num.setBalance(newbalance);
		bankRepository.save(findaccount_num);
		return true;
	}

	@Override
	public boolean transfer(BigDecimal amount, int accountNumber1, int accountNumber2) {
		
		//get account transferring from and its balance
		Bankaccount bankaccount1 = bankRepository.findById(accountNumber1).get();
		BigDecimal bankaccount1Balance = bankaccount1.getBalance();
		
		//get account transferring to and its balance
		Bankaccount bankaccount2 = bankRepository.findById(accountNumber2).get();
		BigDecimal bankaccount2Balance = bankaccount2.getBalance();
		
		//withdraw amount from account1
		BigDecimal bankaccount1Remaining_Balance = bankaccount1Balance.subtract(amount);
		bankaccount1.setBalance(bankaccount1Remaining_Balance);
		
		//credit amount to account2
		BigDecimal bankaccount2newBalance = bankaccount2Balance.add(amount);
		bankaccount2.setBalance(bankaccount2newBalance);
		
		//persist changes to database
		bankRepository.save(bankaccount1);
		bankRepository.save(bankaccount2);
		
		return true;
	}
}











