package com.monocept.test;

import com.monocept.model.Rectangle;

public class ManyRectanglesInfoTest {
	static int rectangleNumber;

	public static void main(String[] args) {
		Rectangle manyRectangles[] = new Rectangle[3];
		manyRectangles[0] = new Rectangle();
		manyRectangles[0].canYouChangeWidth(5);
		manyRectangles[0].canYouChangeHeight(10);

		manyRectangles[1] = new Rectangle();
		manyRectangles[1].canYouChangeWidth(15);
		manyRectangles[1].canYouChangeHeight(20);

		manyRectangles[2] = new Rectangle();
		manyRectangles[2].canYouChangeWidth(25);
		manyRectangles[2].canYouChangeHeight(30);

		for (int rectangleNumber = 0; rectangleNumber < manyRectangles.length; rectangleNumber++) {
			printInfo(manyRectangles[rectangleNumber]);
		}
	}

	public static void printInfo(Rectangle rect) {
		System.out.println("\nWidth is " + rect.canYouGiveMeWidth() + "\nHeight is " + rect.canYouGetMeHeight()+"\nArea is "+rect.calculateArea());
	}

}
