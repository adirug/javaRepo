package com.monocept.test;

import com.monocept.model.Circle;
import com.monocept.model.BorderStyleType;
import com.monocept.model.BgColorType;

public class CircleColorTest {

	public static void main(String[] args) {
		Circle c1 = new Circle(5.5f, BorderStyleType.SOLID, BgColorType.GREEN);
		Circle c2 = new Circle(3.3f, BorderStyleType.DOTTED, BgColorType.RED);
		printInfo(c1);
		printInfo(c2);

		Circle[] circles = new Circle[2];
		circles[0] = c1;
		circles[1] = c2;
		printInfo(circles[2]);
	}

	public static void printInfo(Circle c) {
		System.out.println("Radius is " + c.getRadius());
		System.out.println("Border Style is " + c.getBorderStyle());
		System.out.println("Area is " + c.calculateArea());
		System.out.println("Color is " + c.getBgColor());

	}
	
	public static void printDetails(Circle[] circleArray) {
		for(int i=0;i<circleArray.length;i++) {
			Circle c = circleArray[i];
			printInfo(c);
		}
	}

}
