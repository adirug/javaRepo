package com.monocept.model;

public class OddNumberNotSupportedException extends Exception {
	public OddNumberNotSupportedException(int number) {
		super(number + " odd number is not supported");
	}

}
