package com.monocept.model.test;

import com.monocept.model.Account;
import com.monocept.model.CurrentAccount;
import com.monocept.model.SavingsAccount;

public class AccountTest {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount(101, "Aditya", 5000);
		printInfo(sa);
		sa.withdraw(4500);
		printInfo(sa);

		CurrentAccount ca = new CurrentAccount(101, "Aditya", 5000);
		printInfo(ca);
		ca.withdraw(5500);
		printInfo(ca);
	}

	public static void printInfo(Account acc) {
		System.out.println("Account no is " + acc.getAccNo());
		System.out.println("Name of holder is " + acc.getName());
		System.out.println("Balence is " + acc.getBalance());
		System.out.println(" ");
	}

}
