package com.monocept.case2;

import com.monocept.case2.Parent;

public class Child extends Parent {
	private int abc;

	public Child() {
		super(100);
		System.out.println("Child created ");
	}

	public Child(int abc) {
		super(abc);
		System.out.println("Child created ");
	}
}
