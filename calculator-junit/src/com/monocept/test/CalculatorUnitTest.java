package com.monocept.test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import com.monocept.model.Calculator;

public class CalculatorUnitTest {

	@Test
	public void addPositiveNos_shouldGive3_forInput_1_2() {
		Calculator calc = new Calculator();
		int expected = 3;
		int firstInput = 1;
		int secondInput = 2;

		int actual = calc.addPositiveNos(firstInput, secondInput);

		Assert.assertTrue(actual == expected);
	}

	@Test
	public void addPositiveNos_shouldGiveRuntimeException_if_firstInputIsNegative() {
		Calculator calc = new Calculator();
		boolean exceptionHappened = false;
		int firstInput = -1;
		int secondInput = 2;

		try {
			calc.addPositiveNos(firstInput, secondInput);
		} catch (Exception ex) {
			exceptionHappened = true;
		}

		Assert.assertTrue(exceptionHappened);
	}

	@Test
	public void addPositiveNos_shouldGiveRuntimeException_if_secondInputIsNegative() {
		Calculator calc = new Calculator();
		boolean exceptionHappened = false;
		int firstInput = 1;
		int secondInput = -2;

		try {
			calc.addPositiveNos(firstInput, secondInput);
		} catch (Exception ex) {
			exceptionHappened = true;
		}

		Assert.assertTrue(exceptionHappened);
	}

	@Test
	public void addPositiveNos_shouldGiveRuntimeException_if_InputAreThreeDigit() {
		Calculator calc = new Calculator();
		boolean exceptionHappened = false;
		int firstInput = 99;
		int secondInput = 100;

		try {
			calc.addPositiveNos(firstInput, secondInput);
		} catch (Exception ex) {
			exceptionHappened = true;
		}

		Assert.assertTrue(exceptionHappened);
	}

}
