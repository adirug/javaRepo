package com.monocept.test;

import com.monocept.model.Account;

public class AccountToStringTest {

	public static void main(String[] args) {
		Account account = new Account(101, "Virat", 5000);

		System.out.println(account);
		System.out.println(account.toString());
		System.out.println("\n" + account.getClass().getName() + "@" + Integer.toHexString(account.hashCode()));
		String output = account.toString();
		System.out.println("\nOutput is = " + output);
	}

}
