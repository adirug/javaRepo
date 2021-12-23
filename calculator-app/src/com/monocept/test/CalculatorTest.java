package com.monocept.test;

import com.monocept.model.Calculator;
import com.monocept.model.OddNumberNotSupportedException;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		try {
			System.out.println(calc.cubeEvenNumber(3));
		} catch (OddNumberNotSupportedException e) {
			System.out.println(e.getMessage());
		}
	}

}
