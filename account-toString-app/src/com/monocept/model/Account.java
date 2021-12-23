package com.monocept.model;

public class Account {
	private int accNo;
	private String name;
	private double balence;

	public Account(int accNo, String name, double balence) {
		this.accNo = accNo;
		this.name = name;
		this.balence = balence;
	}

	public Account(int accNo, String name) {
		this(accNo, name, 500);
	}

	public void depositAmount(int deposit) {
		balence = balence + deposit;
	}

	public void withdrawAmount(int withdraw) {
		if (balence - withdraw >= 500) {
			balence = balence - withdraw;
		}
	}

	public int getAccNo() {
		return accNo;
	}

	public String getName() {
		return name;
	}

	public double getBalence() {
		return balence;
	}

	public String toString() {
		return getOutPutString();
	}

	public String getOutPutString() {
		String outputString = "\nAccount details - " + "\nAccount no is - " + getAccNo() + "\nHolders  name is - "
				+ getName() + "\nBalence is - " + getBalence() + "\nSource - " + super.toString();
		return outputString;
	}
	
	@Override
	public boolean equals(Object obj) {
		Account a = (Account) obj;
		
		if(this.getAccNo()!=a.getAccNo())
			return false;
		
		return true;
	}
}
