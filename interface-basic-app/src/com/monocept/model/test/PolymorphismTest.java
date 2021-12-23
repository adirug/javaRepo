package com.monocept.model.test;

import com.monocept.model.CustomerDB;
import com.monocept.model.DepartmentDB;
import com.monocept.model.FooChildDB;
import com.monocept.model.FooDB;
import com.monocept.model.IDataAccesible;
import com.monocept.model.OredrDB;

public class PolymorphismTest {

	public static void main(String[] args) {
		doCRUD(new CustomerDB());
		doCRUD(new DepartmentDB());
		doCRUD(new OredrDB());
		
		FooDB x = new FooChildDB();
		doCRUD(x);
	}

	static void doCRUD(IDataAccesible obj) {
		System.out.println("Doing CRUD Operations -");
		obj.create();
		obj.read();
		obj.update();
		obj.delete();
	}
}
