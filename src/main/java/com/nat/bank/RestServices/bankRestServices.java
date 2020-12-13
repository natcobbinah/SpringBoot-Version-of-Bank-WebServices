package com.nat.bank.RestServices;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nat.bank.entities.Bankaccount;
import com.nat.bank.entities.Client;
import com.nat.bank.entities.Operation;
import com.nat.bank.service.bankService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/bank")
public class bankRestServices {

	@Autowired
	bankService bankservice;
	
	//------------all get requests-------------------------------
	@GetMapping("/bankaccounts")
	public List<Bankaccount> getBankAccounts(){
		return bankservice.getBankAccounts();
	}
	
	@GetMapping("/clients")
	public List<Client> getClients(){
		return bankservice.getClients();
	}
	
	@GetMapping("/operations")
	List<Operation> getOperations(){
		return bankservice.getOperations();
	}
	
	@GetMapping("/bankaccounts/{id}")
	public Bankaccount getBackAccount(@PathVariable("id") int accountNum) {
		return bankservice.getBackAccount(accountNum);
	}
	
	@GetMapping("/clients/{id}")
	public Client getClient(@PathVariable("id") int id){
		return bankservice.getClient(id);
	}
	
	//-----------all post responses--------------------------------
	@PostMapping("/bankaccounts")
	public void addBankAccount(@RequestBody Bankaccount bankaccount) {
		bankservice.addBankAccount(bankaccount);
	}
	
	@PostMapping("/clients")
	public void addClient(@RequestBody Client client) {
		bankservice.addClient(client);
	}
	
	@PostMapping("/operations")
	public void addOperation(@RequestBody Operation operation) {
		bankservice.addOperation(operation);
	}
	
	//----------all patch responses---------------------------------
	@PatchMapping("/deposit/{amount}/{accountNumber}")
	public boolean deposit(@PathVariable("amount")BigDecimal amount,
			@PathVariable("accountNumber") int accountNumber,@RequestBody Bankaccount bankaccount) {
		return bankservice.deposit(amount, accountNumber);
	}
	
	@PatchMapping("/withdraw/{amount}/{accountNumber}")
	public boolean withdraw(@PathVariable("amount")BigDecimal amount,
			@PathVariable("accountNumber") int accountNumber,@RequestBody Bankaccount bankaccount) {
		return  bankservice.withdraw(amount, accountNumber);
	}
	
	
	@PatchMapping("/transfer/{amount}/{accountNumber1}/{accountNumber2}")
	public boolean transfer(@PathVariable("amount") BigDecimal amount, 
		@PathVariable("accountNumber1")int accountNumber1, 
		@PathVariable("accountNumber2") int accountNumber2,
		@RequestBody Bankaccount bankaccount) {
		return bankservice.transfer(amount, accountNumber1, accountNumber2);
	}
}





















