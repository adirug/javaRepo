package com.monocept.model.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.monocept.model.Account;

public class AccountSerializationDeserializationTest {

	public static void main(String[] args) {

		try {
			Account account1 = new Account(111, "JJ", 3000);
			FileOutputStream file = new FileOutputStream("AccountDetails.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(account1);
			out.flush();
			out.close();

			System.out.println("Serialization success !");
			printDetails(account1);

		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("AccountDetails.txt"));
			Account account2 = (Account) objectInputStream.readObject();
			System.out.println("Deserialized success !");
			System.out.println(account2.getAccNo() + " " + account2.getName() + " " + account2.getBalence());
			objectInputStream.close();
			printDetails(account2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void printDetails(Account a) {
		System.out.println("Account no. - " + a.getAccNo());
		System.out.println("Name - " + a.getName());
		System.out.println("Balence - " + a.getBalence());
		System.out.println(" ");
	}

}
