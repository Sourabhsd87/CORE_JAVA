package com.banking;

import java.time.LocalDate;

public class bankAccount {
	private int acctno;
	private String custName;
	private AccType type;
	private double balance;
	private LocalDate createdOn ;
	private LocalDate lastUpdated;
	private boolean isActive;
	public bankAccount(int acctno, String custName, AccType type, double balance, LocalDate createdOn,
			LocalDate lastUpdated, boolean isActive) {
		super();
		this.acctno = acctno;
		this.custName = custName;
		this.type = type;
		this.balance = balance;
		this.createdOn = createdOn;
		this.lastUpdated = lastUpdated;
		this.isActive = true;
	}
	@Override
	public String toString() {
		return "bankAccount [acctno=" + acctno + ", custName=" + custName + ", type=" + type + ", balance=" + balance
				+ ", createdOn=" + createdOn + ", lastUpdated=" + lastUpdated + ", isActive=" + isActive + "]";
	}
	
	
	
}
