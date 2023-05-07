package com.banking;

import java.time.LocalDate;
import java.util.Map;

import com.customexception.bankingException;


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
	
	
	public AccType getType() {
		return type;
	}
	public void withdraw(double amount) throws bankingException
	{
		if(this.isActive==true)
		{
			if((this.balance - this.getType().getMinimumBalance())<amount)
			{
				throw new bankingException("Insufficient balance");
			}
			else
			{
				this.balance=this.balance-amount;
			}
		}
	}
  public static void testD()
	{
		
	}
	
	public void deposit(double amount)
	{
		if(this.isActive==true)
		{
			this.balance=this.balance+amount;
		}
	}
	
	public static void transfer(int src,int dest,double amt,Map<Integer,bankAccount> bank) throws bankingException 
	{
		bankAccount SRC = bank.get(src);
		bankAccount DEST = bank.get(dest);
		
		if(SRC.isActive==true && DEST.isActive==true)
		{
		SRC.withdraw(amt);
		DEST.deposit(amt);
		SRC.lastUpdated=LocalDate.now();
		DEST.lastUpdated=LocalDate.now();	
		}
	}
	
}
