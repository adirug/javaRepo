package com.monocept.model;

public class Rectangle {
	private int width;
	private int height;
	private final String bgColor;

	public Rectangle(int pwidth, int pheight) {
		this(pwidth, pheight, "Red");
	}

	public Rectangle(int pwidth, int pheight, String pBgColor) {
		setWidth(pwidth);
		setHeight(pheight);
		this.bgColor = validateBgColor(pBgColor);
		System.out.println("Object is crated.");
	}

	public void setWidth(int pwidth) {
		width = validateValue(pwidth);
	}

	public void setHeight(int pheight) {
		height = validateValue(pheight);
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public String getColor() {
		return bgColor;
	}

	public int calcArea() {
		return width * height;
	}

	private int validateValue(int number) {
		if (number < 0) {
			return number = 1;
		}
		if (number > 100) {
			return number = 100;
		}
		return number;
	}

	private String validateBgColor(String color) {
		if (color.toUpperCase().equals("RED") || color.toUpperCase().equals("GREEN") || color.toUpperCase().equals("BLUE")) {
			return color;
		}
		return "Red";
	}
}
