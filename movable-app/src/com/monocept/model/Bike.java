package com.monocept.model;

public class Bike implements IMoveable{

	@Override
	public void move() {
		System.out.println("Bike is running");
	}
}
