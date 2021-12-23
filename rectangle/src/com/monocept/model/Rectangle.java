package com.monocept.model;

public class Rectangle {
	private int width;
	private int height;
	
	public int calculateArea() { 
		return  width * height;
	}
	public void canYouChangeWidth(int width) {
		if(width <0) {
			this.width = 1;
		}
		if(width >100) {
			this.width = 100;
		}
		this.width = width;
	}
	public void canYouChangeHeight(int height) {
		if(height <0) {
			this.height = 1;
		}
		if(height >100) {
			this.height = 100;
		}
		this.height = height;
	}
	public int canYouGiveMeWidth() {
		return width;
	}
	public int canYouGetMeHeight() {
		return height;
	}
}
