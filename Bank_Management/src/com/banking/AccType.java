package com.banking;

public enum AccType {
	SAVING(1000),CURRENT(5000),FD(3000),DEMAT(1000);

	@SuppressWarnings("unused")
	private double minimumBalance;
	
	private AccType(double minimumBalance)
	{
		this.minimumBalance=minimumBalance;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
	
	

}
