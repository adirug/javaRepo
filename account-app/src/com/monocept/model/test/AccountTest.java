package com.monocept.model.test;

import com.monocept.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account acc1 = new Account(101,"Sachin",1000);
		printInfo(acc1);
		try {
			acc1.withdrawAmount(501);
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Finally");
			printInfo(acc1);
		}
		
		System.out.println("End of main");
	}
	
	public static void printInfo(Account a) {
		System.out.println("Account no. - "+a.getAccNo());
		System.out.println("Name - "+a.getName());
		System.out.println("Balence - "+a.getBalence());
		System.out.println(" ");
		
	}

}
