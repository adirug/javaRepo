package com.monocept.test;

import com.monocept.model.Rectangle;
import java.util.*;

public class RectangleTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		printInfo(new Rectangle(20,30));
		String str = scanner.nextLine();
	}

	static void printInfo(Rectangle rectangle) {
		System.out.println("Height is " + rectangle.getHeight());
		System.out.println("Width is " + rectangle.getWidth());
		System.out.println("Area is " + rectangle.calcArea());
	}

}
