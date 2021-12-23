package com.monocept.model;

public class SavingsAccount extends Account {

	public SavingsAccount(int accNo, String name, double balence) {
		super(accNo, name, balence);
	}

	@Override
	public void withdraw(double amount) {
		if (balence - amount >= 1000) {
			balence = balence - amount;
		}
		if (balence - amount <= 1000) {
			System.out.println("Sorry, minimum withdraw amount exceeded !");
		}
	}

}
