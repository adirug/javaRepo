package com.monocept.model;

public class Rectangle {
	private int width;
	private int height;

	public int calculateArea() {
		return width * height;
	}

	private int checkValue(int number) {
		if(number < 0) {
			number = 1;
		}
		if(number > 100) {
			number = 100;
		}
		return number;
	}
	public void canYouChangeWidth(int width) {
		this.width = checkValue(width);
	}

	public void canYouChangeHeight(int height) {
		this.height = checkValue(height);
	}

	public int canYouGiveMeWidth() {
		return width;
	}

	public int canYouGetMeHeight() {
		return height;
	}
}
