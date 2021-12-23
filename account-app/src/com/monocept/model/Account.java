package com.monocept.model;

import java.io.Serializable;

public class Account implements Serializable {
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
			return;
		}
		throw new RuntimeException("Not sufficient funds !\n");
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
}
