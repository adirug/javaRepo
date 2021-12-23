package com.monocept.model;

public class Account {
	private int accNo;
	private String name;
	protected double balence;

	public Account(int accNo, String name, double balence) {
		this.accNo = accNo;
		this.name = name;
		this.balence = balence;
	}

	public void deposit(double amount) {
		balence = balence + amount;
	}

	public void withdraw(double amount) {

	}

	public String getName() {
		return name;
	}

	public int getAccNo() {
		return accNo;
	}

	public double getBalance() {
		return balence;
	}

}
