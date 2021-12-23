package com.monocept.model;

public class Calculator {

	public int addPositiveNos(int a, int b) {
		if (a < 0 || b < 0) {
			throw new RuntimeException("Number should be positive");
		}
		if (a > 99 || b > 99) {
			throw new RuntimeException("Number should be below 100");
		}
		return a + b;
	}

}
