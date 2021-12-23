package com.monocept.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.monocept.model.Rectangle;

public class RectangleDeserializationTest {

	public static void main(String[] args) {
		Rectangle manyRectangles[] = new Rectangle[3];
		Rectangle rectangles[] = deserialize();
		printInfo(rectangles);

	}

	private static void printInfo(Rectangle[] rectangles) {
		for (Rectangle rect: rectangles) {
			System.out.println("\nWidth is " + rect.getWidth() + "\nHeight is " + rect.getHeight()
					+ "\nArea is " + rect.calculateArea());
		}
	}

	private static Rectangle[] deserialize() {
		Object manyRectangles = null;
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("Rectangle.bin"));
			Object[] rectangle = (Object[]) in.readObject();
			System.out.println("Deserialization success !");
			return (Rectangle[]) rectangle;
		} catch (Exception e) {
			System.out.println(e);
		}
		return (Rectangle[]) manyRectangles;
	}

}
