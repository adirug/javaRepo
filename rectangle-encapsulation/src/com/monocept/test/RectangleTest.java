package com.monocept.test;

import com.monocept.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle smallRectangle = new Rectangle();
		smallRectangle.canYouChangeWidth(-10);
		smallRectangle.canYouChangeHeight(110);
		
		System.out.println("Width is "+smallRectangle.canYouGiveMeWidth()+"\nHeight is "+smallRectangle.canYouGetMeHeight()+"\nArea is "+smallRectangle.calculateArea());
	}

}
