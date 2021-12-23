package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Rectangle;

public class RectangleColorTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Rectangle r1 = new Rectangle(20,30,"BLUE");
		printInfo(r1);
		r1.setHeight(r1.getHeight()+5);
		r1.setWidth(r1.getWidth()+5);
		//r1.setBgColor("Blue");
		printInfo(r1);
		String str = scanner.next();
	}
	
	static void printInfo(Rectangle r1){
		System.out.println("Height is " + r1.getHeight());
		System.out.println("Width is " + r1.getWidth());
		System.out.println("Area is " + r1.calcArea());
		System.out.println("Color is "+r1.getColor());
	}

}
