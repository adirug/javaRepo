package com.monocept.model;

public class Accountant extends Employee {
	public double perks =0;
	public double bonus;

	public Accountant(int id,String name,double salery) {
		super(id,name,salery);
	}
	@Override
	public double getSalery(double salery) {
		perks= this.salery*0.3;
		bonus = perks;
		return this.salery = this.salery*12+bonus;
	}
	
}
