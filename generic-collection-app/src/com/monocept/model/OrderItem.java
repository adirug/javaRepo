package com.monocept.model;

public class OrderItem {
	private int id;
	private String name;
	private int qty;
	private double price;
	private double totalPrice;
	public double totalBill = 0;

	@Override
	public String toString() {
		return "Item id - "+getId()+"\nItem name - "+getName()+"\nItem price - "+getPrice()+"\nItem quantity - "+getQty()+"\nTotal price of item - "+totalPrice();
	}
	
	public OrderItem(int id, String name, int qty, double price) {
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	
	public double totalPrice() {
		return this.totalPrice =  this.qty * this.price;
	}

	public double totalBill() {
		this.totalBill+=this.totalPrice;
		return this.totalBill;
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
