package com.monocept.model;

public class CurrentAccount extends Account {

	public CurrentAccount(int accNo, String name, double balence) {
		super(accNo, name, balence);
	}

	@Override
	public void withdraw(double amount) {
		if (balence - amount >= -10000) {
			balence = balence - amount;
		}
		if(balence - amount <= -10000) {
			System.out.println("Sorry, your overdue has reached !");
		}
	}
	
}
