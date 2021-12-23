package com.monocept.test;

public class OverloadTest {
	public static void main(String[] args) {
		printInfo("Aditya");
		printInfo(10);
		printInfo(10.55f);
	}

	private static void printInfo(String value) {
		System.out.println("Inside printInfo with string");
		System.out.println(value);
	}

	private static void printInfo(int value) {
		System.out.println("Inside printInfo with int");
		System.out.println(value);
	}

	private static void printInfo(float value) {
		System.out.println("Inside printInfo with float");
		System.out.println(value);
	}
}
