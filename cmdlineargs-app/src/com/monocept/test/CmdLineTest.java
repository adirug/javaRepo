package com.monocept.test;

public class CmdLineTest {
	public static void main(String[] namesPassed) {
		System.out.println(namesPassed);
		System.out.println(namesPassed.length);
		System.out.println("Aditya");
		
		if (namesPassed.length == 0) {
			System.out.println("Can you provide some arguments also while running program ");
			return;
		}
		
		System.out.println("Using for loop");
		for (int i = 0; i < namesPassed.length; i++) {
			System.out.println("Hello : " + namesPassed[i]);
		}
		
		System.out.println("Using for each loop");
		for (String name : namesPassed) {
			System.out.println("Hello : " + name);
		}
	}
}
