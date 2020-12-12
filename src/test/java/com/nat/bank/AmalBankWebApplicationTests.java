package com.nat.bank;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nat.bank.entities.Bankaccount;
import com.nat.bank.entities.Client;
import com.nat.bank.entities.Operation;
import com.nat.bank.repository.BankRepository;
import com.nat.bank.repository.ClientRepository;
import com.nat.bank.repository.OperationRepository;


@SpringBootTest
class AmalBankWebApplicationTests {

	@Autowired
	ClientRepository clientRepository;
	
	@Autowired
	OperationRepository operationRepository;
	
	@Autowired
	BankRepository bankRepository;
	
	//----------begin unit test for clients---------------------------------------------
	@Test
	public void addClient() {
		clientRepository.save(new Client("Fred","Cob","fred@gmail.com","0247675938"));
	}
	
	@Test
	public void findClientById() {
		Client client = clientRepository.findById(5).get();
		System.out.println(client);
	}
	
	@Test
	public void updateClient() {
		Client client = clientRepository.findById(1).get();
		client.setFirstname("Temujin");
		clientRepository.save(client);
	}
	
	@Test
	public void deleteClient() {
		clientRepository.deleteById(1);
	}
	
	//----------------end unit tests for clients---------------------------------------


	//-------------begin unit tests for bank accounts-------------------------------------
	@Test
	public void addBankAccount() {
		Bankaccount account = new Bankaccount();
		account.setAccountStatus("ACTIVE");
		account.setCreatedAt(new Date());
		account.setBalance(new BigDecimal(345));
		account.setClientID(2);
		account.setAccountNumber(00005);
		bankRepository.save(account);
	}
	
	@Test
	public void findBankAccount() {
		Bankaccount findById = bankRepository.findById(2).get();
		System.out.println(findById);
	}
	
	@Test
	public void updateBankAccount() {
		Bankaccount findById = bankRepository.findById(2).get();
		BigDecimal previousbalance = findById.getBalance();
		BigDecimal newbalance = previousbalance.add(new BigDecimal(100));
		findById.setBalance(newbalance);
		bankRepository.save(findById);
	}
	
	@Test
	public void deleteBankAccount() {
		Bankaccount findById = bankRepository.findById(5).get();
		bankRepository.delete(findById);
	}
	
	//-------------end unit test for bank accounts----------------------------------------
	
	//begin unit tests for operations-----------------------------------------------------
	@Test
	public void addOperation() {
		Operation op = new Operation();
		op.setOperationType("TRANSFER");
		op.setOperationAmount(new BigDecimal(320));
		op.setDoneAt(new Date());
		op.setAccountNumber(2);
		
		operationRepository.save(op);
	}
	
	@Test
	public void findOperation() {
		Operation repository = operationRepository.findById(1).get();
		System.out.println(repository);
	}
	
	//end unit tests for operations-------------------------------------------------------
	
}









