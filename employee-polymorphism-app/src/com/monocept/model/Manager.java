package com.monocept.model;

public class Manager extends Employee {
	private double hra = 0;
	private double ta = 0;
	private double salesIncentives = 0;
	private double bonus;

	public Manager(int id, String name, double salery) {
		super(id, name, salery);
	}

	@Override
	public double getSalery(double salery) {
		hra = this.salery * 0.6;
		ta = this.salery * 0.2;
		salesIncentives = this.salery * 0.2;
		bonus = hra + ta + salesIncentives;
		return this.salery = this.salery * 12 + bonus;
	}
}