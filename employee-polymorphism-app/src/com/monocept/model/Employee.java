package com.monocept.model;

public abstract class Employee {
	private int id;
	private String name;
	protected double salery;

	public Employee(int id,String name,double salery) {
		this.id = id;
		this.name = name;
		this.salery = salery;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	abstract public double getSalery(double salery);


}
