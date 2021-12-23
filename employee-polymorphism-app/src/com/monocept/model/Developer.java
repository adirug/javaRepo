package com.monocept.model;

public class Developer extends Employee {
	private double performanceAllowance = 0;
	private double annualAllowance = 0;
	private double bonus;

	public Developer(int id, String name, double salery) {
		super(id, name, salery);
	}

	@Override
	public double getSalery(double salery) {
		performanceAllowance = this.salery * 0.5;
		annualAllowance = this.salery * 0.4;
		bonus = performanceAllowance + annualAllowance;
		return this.salery = this.salery * 12 + bonus;
	}

}
