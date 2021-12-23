package com.monocept.test;

public class StringTest {

	public static void main(String[] args) {
		String companyName = "Monocept";
		System.out.println(companyName.toUpperCase());
		System.out.println(companyName);
		
		String location = "Hydrabad";
		System.out.println(location.hashCode());
		
		String locationUpperCase = location.toUpperCase(); 
		System.out.println(locationUpperCase);
		
		String name = "Aditya";
		System.out.println(name.hashCode());
		name+="Rugle";
		System.out.println(name.hashCode());
		name+="Works at Monocept";
		System.out.println(name.hashCode());
		name+="Likes to code";
		System.out.println(name.hashCode());
		System.out.println(name);
		System.out.println(name.hashCode());
	}

}
