package com.monocept.model;

public class Circle {
	private final float radius;
	private BorderStyleType borderStyle;
	private BgColorType bgColor;
	
	public Circle(float pRadius,BorderStyleType pBorderStyle) {
		radius = pRadius;
		setBorderStyle(pBorderStyle);
	}
	
	public Circle(float pRadius,BorderStyleType pBorderStyle, BgColorType pBgColor) {
		radius = pRadius;
		setBorderStyle(pBorderStyle);
		setBgColor(pBgColor);
	}
	
	public void setBorderStyle(BorderStyleType pBorderStyle) {
		borderStyle = pBorderStyle;
	}
	
	public void setBgColor(BgColorType pBgColor) {
		bgColor = pBgColor;
	}
	
	public BgColorType getBgColor() {
		return bgColor;
	}
	
	public BorderStyleType getBorderStyle() {
		return borderStyle;
	}
	
	public float getRadius() {
		return radius;
		
	}
	
	public float calculateArea() {
		float area = (22/7)*radius*radius;
		return area;
	}

}
