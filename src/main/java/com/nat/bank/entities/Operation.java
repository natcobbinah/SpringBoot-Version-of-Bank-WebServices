package com.nat.bank.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="operations")
public class Operation {

	@Id
	@Column(name = "operationid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int operationid;

	@Temporal(TemporalType.DATE)
	@Column(name = "doneat")
	private Date doneAt;

	@Column(name = "operationamount")
	private BigDecimal operationAmount;

	@Column(name = "operationtype")
	private String operationType;
	
	@Column(name="accountnumber")
	private int accountNumber;

	public Operation() {
		
	}
	
	public int getOperationid() {
		return operationid;
	}

	public void setOperationid(int operationid) {
		this.operationid = operationid;
	}

	public Date getDoneAt() {
		return doneAt;
	}

	public void setDoneAt(Date doneAt) {
		this.doneAt = doneAt;
	}

	public BigDecimal getOperationAmount() {
		return operationAmount;
	}

	public void setOperationAmount(BigDecimal operationAmount) {
		this.operationAmount = operationAmount;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	
}
