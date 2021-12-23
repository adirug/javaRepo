package com.monocept.model.test;

import java.util.ArrayList;
import java.util.Iterator;
import com.monocept.model.OrderItem;

public class CollectionTest {

	public static void main(String[] args) {

		OrderItem item1 = new OrderItem(1001, "tata tea", 2, 150);
		OrderItem item2 = new OrderItem(1002, "book", 10, 70);

		ArrayList<OrderItem> basket = new ArrayList<OrderItem>();
		basket.add(item1);
		basket.add(item2);

		printUsingForEachLoop(basket);
		printUsingIterator(basket);

	}

	public static void printUsingForEachLoop(ArrayList<OrderItem> basket) {
		System.out.println("Printing using for each ");
		for (OrderItem item : basket) {
			System.out.println("Item id - "+item.getId());
			System.out.println("Item name - "+item.getName());
			System.out.println("Item price - "+item.getPrice());
			System.out.println("Item quantity - "+item.getQty());
			System.out.println("Total bill of item - "+item.totalPrice());
			System.out.println(" ");
		}
	}

	public static void printUsingIterator(ArrayList<OrderItem> basket) {
		System.out.println("Printing using Iterator ");
		Iterator<OrderItem> itr = basket.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next() + "\n");
		}
	}

}
