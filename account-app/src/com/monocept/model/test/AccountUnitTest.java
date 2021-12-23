package com.monocept.model.test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import com.monocept.model.Account;

public class AccountUnitTest {

	@Test
	public void initializeAccount_through3Parameters() {
		Account acc = new Account(1001, "Aditya", 5000);
		String expectedName = "Aditya";
		int expectedAccNo = 1001;
		double expectedBalence = 5000;

		assertEquals(acc.getAccNo(), expectedAccNo);
		assertEquals(acc.getName(), expectedName);
		Assert.assertTrue(acc.getBalence() == expectedBalence);
	}

	@Test
	public void check_withdrawAmount() {
		Account acc = new Account(1001, "Aditya", 5000);
		acc.withdrawAmount(4500);
		double expectedBalence = 500;

		Assert.assertTrue(acc.getBalence() == expectedBalence);
	}

	@Test
	public void check_depositAmount() {
		Account acc = new Account(1001, "Aditya", 5000);
		acc.depositAmount(1000);
		double expectedBalence = 6000;

		Assert.assertTrue(acc.getBalence() == expectedBalence);
	}

}
