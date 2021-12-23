package com.monocept.model;

public class OrderItem {
	private int id;
	private String name;
	private int qty;
	private double price;

	public OrderItem(int id, String name, int qty, double price) {
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}

	public double totalPrice() {
		return qty * price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getQty() {
		return qty;
	}

	public double getPrice() {
		return price;
	}

}
