
package com.example.stockspring.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder={"accountType", "accountId" , "balance" })
public class Account {
	private int accountId;
	private String accountType;
	private float balance;

	public int getAccountId() {
		return accountId;
	}
	
	@XmlElement(name="account_id")
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	
	@XmlElement(name="AccountType")
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public float getBalance() {
		return balance;
	}
	
	//@XmlTransient
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
}
