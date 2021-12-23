package com.monocept.model.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.monocept.model.Customer;
import com.monocept.model.SortByAmountComparator;
import com.monocept.model.SortByNameComparator;

public class MapTest {
  public static void main(String[] args) {
    caseStudy1();
//    caseStudy2();
//    caseStudy3();
//    caseStudy4();
//    caseStudy5();
//    caseStudy6();
  }
  
  private static void caseStudy1() {
	    Map<Integer, String> dictionary;
	    dictionary = new HashMap<Integer, String>();
	    System.out.println(dictionary.size());

	    dictionary.put(1, "Aditya");
	    dictionary.put(2, "Nihal");
	    System.out.println(dictionary.values());

	    dictionary.put(2, "Jack");
	    dictionary.put(1, "Joey");
	    dictionary.put(2, "Sayed");
	    dictionary.put(1, "Vidya");
	    System.out.println(dictionary.values());

	    dictionary.put(3, "Nihal");
	    dictionary.put(4, "Aditya");
	    System.out.println(dictionary.values());
	    System.out.println(dictionary.size());

	    dictionary.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));
	  }

  private static void caseStudy2() {
	    Customer c1 = new Customer(101, 3001, "Aditya", 500);
	    Customer c2 = new Customer(102, 3102, "Nihal", 1800);
	    Customer c3 = new Customer(103, 3203, "Sayed", 1200);
	    Customer c4 = new Customer(104, 3304, "Vidya", 2000);
	    
	    Map<Customer, Customer> dictionary;
	    dictionary = new HashMap<Customer, Customer>();

	    dictionary.put(c1, c1);
	    dictionary.put(c2, c2);
	    dictionary.put(c3, c3);
	    dictionary.put(c4, c4);
	    
	    System.out.println("Printing using HashMap - ");
	    for (Customer c : dictionary.values()) {
	      System.out.println("Id is - " + c.getId());
	      System.out.println("Name is - " + c.getName());
	      System.out.println("Order id is - " + c.getOrderid());
	      System.out.println("Order amount is - " + c.getAmount());
	      System.out.println(" ");
	    }
	  }
  
  private static void caseStudy3() {
	    Customer c1 = new Customer(101, 3001, "nihal", 900);
	    Customer c2 = new Customer(102, 3100, "aditya", 2000);
	    Customer c3 = new Customer(103, 3251, "sayed", 1200);
	    Customer c4 = new Customer(104, 3334, "vidya", 2900);

	    Map<Customer, Customer> dictionary;
	    dictionary = new LinkedHashMap<Customer, Customer>();

	    dictionary.put(c1, c1);
	    dictionary.put(c2, c2);
	    dictionary.put(c3, c3);
	    dictionary.put(c4, c4);
	    System.out.println("Printing using LinkedHashMap - ");
	    for (Customer c : dictionary.values()) {
		      System.out.println("Id is - " + c.getId());
		      System.out.println("Name is - " + c.getName());
		      System.out.println("Order id is - " + c.getOrderid());
		      System.out.println("Order amount is - " + c.getAmount());
		      System.out.println(" ");
		    }

	  }
  
  private static void caseStudy4() {
	    Customer c1 = new Customer(101, 3001, "nihal", 900);
	    Customer c2 = new Customer(102, 3100, "aditya", 2000);
	    Customer c3 = new Customer(103, 3251, "sayed", 1200);
	    Customer c4 = new Customer(104, 3334, "vidya", 2900);

	    Map<Customer, Customer> dictionary;
	    dictionary = new TreeMap<Customer, Customer>();

	    dictionary.put(c1, c1);
	    dictionary.put(c2, c2);
	    dictionary.put(c3, c3);
	    dictionary.put(c4, c4);
	    
	    System.out.println("Printing using treeMap sorting by Id - ");
	    for (Customer c : dictionary.values()) {
		      System.out.println("Id is - " + c.getId());
		      System.out.println("Name is - " + c.getName());
		      System.out.println("Order id is - " + c.getOrderid());
		      System.out.println("Order amount is - " + c.getAmount());
		      System.out.println(" ");
		    }

	  }
  
  private static void caseStudy5() {
	    Customer c1 = new Customer(101, 3001, "nihal", 900);
	    Customer c2 = new Customer(102, 3100, "aditya", 2000);
	    Customer c3 = new Customer(103, 3251, "sayed", 1200);
	    Customer c4 = new Customer(104, 3334, "vidya", 2900);

	    Map<Customer, Customer> dictionary;
	    dictionary = new TreeMap<Customer, Customer>(new SortByNameComparator());

	    dictionary.put(c1, c1);
	    dictionary.put(c2, c2);
	    dictionary.put(c3, c3);
	    dictionary.put(c4, c4);
	    
	    System.out.println("Printing using TreeMap sorting by Name");
	    for (Customer c : dictionary.values()) {
		      System.out.println("Id is - " + c.getId());
		      System.out.println("Name is - " + c.getName());
		      System.out.println("Order id is - " + c.getOrderid());
		      System.out.println("Order amount is - " + c.getAmount());
		      System.out.println(" ");
		    }
	    
	  }
  
  private static void caseStudy6() {
    Customer c1 = new Customer(101, 3001, "nihal", 900);
    Customer c2 = new Customer(102, 3100, "aditya", 2000);
    Customer c3 = new Customer(103, 3251, "sayed", 1200);
    Customer c4 = new Customer(104, 3334, "vidya", 2900);

    Map<Customer, Customer> dictionary;
    dictionary = new TreeMap<Customer, Customer>(new SortByAmountComparator());

    dictionary.put(c1, c1);
    dictionary.put(c2, c2);
    dictionary.put(c3, c3);
    dictionary.put(c4, c4);
    
    System.out.println("Printing using TreeMap sorting by Amount");
    for (Customer c : dictionary.values()) {
	      System.out.println("Id is - " + c.getId());
	      System.out.println("Name is - " + c.getName());
	      System.out.println("Order id is - " + c.getOrderid());
	      System.out.println("Order amount is - " + c.getAmount());
	      System.out.println(" ");
	    }
    
  }

}