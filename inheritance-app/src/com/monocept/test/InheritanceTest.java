package com.monocept.test;

import com.monocept.model.*;

public class InheritanceTest {

	public static void main(String[] args) {

		// caseStudy1();
		// caseStudy2();
		// caseStudy3();
		caseStudy4();
		// caseStudy5();
	}

	public static void caseStudy1() {
		Man x;
		x = new Man();
		x.play();
		x.read();
	}

	public static void caseStudy2() {
		Boy y;
		y = new Boy();
		y.eat();
		y.read();
		y.play();
	}

	public static void caseStudy3() {
		Man x;
		x = new Boy();
		x.play();
		x.read();
	}

	public static void caseStudy4() {
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Infant());
		atThePark(new Kid());
	}

	public static void atThePark(Man x) {
		System.out.println("At the park");
		x.play();
		System.out.println(x.getClass());
		System.out.println(x.getClass().getName());
		System.out.println("");
	}

	public static void caseStudy5() {
		Object x;
		x = 10;
		System.out.println(x.toString());
		System.out.println(x.getClass());
		System.out.println("");

		x = "hello";
		System.out.println(x.toString());
		System.out.println(x.getClass());
		System.out.println("");

		x = new Man();
		System.out.println(x.toString());
		System.out.println(x.getClass());
		System.out.println("");

		x = '#';
		System.out.println(x.toString());
		System.out.println(x.getClass());
		System.out.println("");

		x = new Infant();
		System.out.println(x.toString());
		System.out.println(x.getClass());
		System.out.println("");

		Infant i = (Infant) x;
		i.play();

	}
}
