package com.monocept.model;

import java.io.Serializable;

public class Rectangle implements Serializable {
	private int width;
	private int height;
	
	public int calculateArea() { 
		return  getWidth() * getHeight();
	}
	public void canYouChangeWidth(int width) {
		if(width <0) {
			this.setWidth(1);
		}
		if(width >100) {
			this.setWidth(100);
		}
		this.setWidth(width);
	}
	public void canYouChangeHeight(int height) {
		if(height <0) {
			this.setHeight(1);
		}
		if(height >100) {
			this.setHeight(100);
		}
		this.setHeight(height);
	}

	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
