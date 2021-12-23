package com.monocept.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.monocept.model.Rectangle;

public class RectangleSerializationTest {
	static int rectangleNumber;

	public static void main(String[] args) {
		Rectangle manyRectangles[] = new Rectangle[3];
		manyRectangles[0] = new Rectangle();
		manyRectangles[0].canYouChangeWidth(97);
		manyRectangles[0].canYouChangeHeight(97);

		manyRectangles[1] = new Rectangle();
		manyRectangles[1].canYouChangeWidth(98);
		manyRectangles[1].canYouChangeHeight(98);

		manyRectangles[2] = new Rectangle();
		manyRectangles[2].canYouChangeWidth(99);
		manyRectangles[2].canYouChangeHeight(99);

		for (int rectangleNumber = 0; rectangleNumber < manyRectangles.length; rectangleNumber++) {
			printInfo(manyRectangles[rectangleNumber]);

		}
		serialize(manyRectangles);

	}

	public static void printInfo(Rectangle rect) {
		System.out.println("\nWidth is " + rect.getWidth() + "\nHeight is " + rect.getHeight() + "\nArea is "
				+ rect.calculateArea());
	}

	public static void serialize(Rectangle[] rectangle) {
		try {
			FileOutputStream file = new FileOutputStream("Rectangle.bin");
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(rectangle);
			out.flush();
			out.close();
			file.close();

			System.out.println("\n Serialization success !");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
