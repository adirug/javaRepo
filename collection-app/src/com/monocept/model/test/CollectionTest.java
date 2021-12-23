package com.monocept.model.test;

import java.util.ArrayList;
import java.util.Iterator;
import com.monocept.model.OrderItem;

public class CollectionTest {

	public static void main(String[] args) {

		OrderItem item1 = new OrderItem(1001, "tata tea", 2, 150);
		OrderItem item2 = new OrderItem(1002, "book", 10, 70);

		ArrayList basket = new ArrayList();

		basket.add(item1);
		basket.add(item2);

		printUsingForEachLoop(basket);
		printUsingIterator(basket);

	}

	public static void printUsingForEachLoop(ArrayList basket) {
		for (Object item : basket) {
			OrderItem currentItem = (OrderItem)item;
			System.out.println(currentItem.getId());
			System.out.println(currentItem.getName());
			System.out.println(currentItem.getPrice());
			System.out.println(currentItem.totalPrice());
		}
	}

	public static void printUsingIterator(ArrayList basket) {
		Iterator itr = basket.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
		
		System.out.println(" ");
		}
	}

}
