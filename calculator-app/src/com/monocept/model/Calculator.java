package com.monocept.model;

public class Calculator {

	public int cubeEvenNumber(int number) throws OddNumberNotSupportedException {
		if (number % 2 == 1) {
			throw new OddNumberNotSupportedException(number);
		}
		return number * number * number;
	}

}
