package com.monocept.model.test;

import com.monocept.model.*;

public class PlayerTest {

	public static void main(String[] args) {
		Player p1 = new Player(101,"Virat Kohli");
		printInfo(p1);
		Player p2 = new Player(102,"sachin Tendulkar",GenderType.MALE,50);
		printInfo(p2);
		
		Player elder = p1.whoIsElder(p2);
		System.out.println("Printing elder Details - ");
		printInfo(elder);
	}
	
	public static void printInfo(Player p) {
		System.out.println("Id is "+p.getId());
		System.out.println("Name is "+p.getName());
		System.out.println("Gender is "+p.getGender());
		System.out.println("Age is "+p.getAge());
		System.out.println("Hash code - "+p.hashCode());
		System.out.println(" ");
	}

}
