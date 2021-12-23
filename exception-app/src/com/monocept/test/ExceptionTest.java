package com.monocept.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("This program is developed by Aditya Rugle");
		try {
			System.out.print("Enter first number - ");
			int a = scanner.nextInt();
			System.out.print("Enter second number - ");
			int b = scanner.nextInt();
			int result = a / b;
			System.out.println(result);
		} catch (InputMismatchException exc) {
			System.out.println("Enter integer");
		} catch (Exception e) {
			System.out.println("Zero not allowed");
		}
		System.out.println("End");

	}

}
