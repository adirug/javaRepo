package com.monocept.test;

import com.monocept.model.Bike;
import com.monocept.model.Car;
import com.monocept.model.IMoveable;
import com.monocept.model.Truck;

public class PolymorphismTest {

	public static void main(String[] args) {
		IMoveable[] moveable = new IMoveable[4];
		moveable[0] = new Truck();
		moveable[1] = new Car();
		moveable[2] = new Bike();
		moveable[3] = new Truck();
		startTheRace(moveable);
	}

	public static void startTheRace(IMoveable[] moveable) {
		for (IMoveable x:moveable) {
			x.move();
		}
	}
}
