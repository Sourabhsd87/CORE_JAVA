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
	public static int idgenrator;
	static 
	{
		idgenrator=101;
	}
	public bankAccount( String custName, AccType type, double balance, LocalDate createdOn,
			LocalDate lastUpdated) {
		super();
		this.acctno = idgenrator++;
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
	public int getAcctno() {
		return acctno;
	}
	
	
	
}
