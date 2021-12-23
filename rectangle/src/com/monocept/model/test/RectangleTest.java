package com.monocept.model.test;

import com.monocept.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle smallRectangle = new Rectangle();
		smallRectangle.width = -10;
		smallRectangle.height = -20;
		printInfo(smallRectangle);

		Rectangle bigRectangle = new Rectangle();
		bigRectangle.width = 100;
		bigRectangle.height = 50;
		printInfo(bigRectangle);

		Rectangle temp = new Rectangle();
		temp = bigRectangle;
		temp.width = 25;
		printInfo(temp);

		// System.out.println(new Rectangle().calculateArea());
		printInfo(new Rectangle());
	}

	public static void printInfo(Rectangle r) {
		System.out.println("Width is " + r.width + "\nHeight is " + r.height + "\nArea is " + r.calculateArea()
				+ "\nHash Code is " + r.hashCode());

	}
}