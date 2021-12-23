package com.monocept.model.test;

import com.monocept.model.Boy;
import com.monocept.model.IEmotion;
import com.monocept.model.IManner;
import com.monocept.model.Man;

public class PolymorphismTest {
	
	public static void main(String[] args) {
		
		Man man = new Man();
		Boy boy = new Boy();
		atTheParty(boy);
		atTheParty(man);
		atTheMovies(boy);
		//atTheMovies(man);
		
	}
	
	public static void atTheParty(IManner obj){
		System.out.println("At the party hall");
		obj.wish();
		obj.depart();
	}
	
	public static void atTheMovies(IEmotion obj) {
		System.out.println("At the movie hall");
		obj.cry();
		obj.laugh();
	}
}
