package com.monocept.case2;

public class Parent {
	private int foo;

	public Parent(int foo) {
		System.out.println("Parent created ");
		this.foo = foo;
	}

	public int getFoo() {
		return foo;
	}
}
