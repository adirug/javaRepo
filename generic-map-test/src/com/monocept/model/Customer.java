package com.monocept.model;

public class Customer implements Comparable<Customer> {
  private int id;
  private int orderId;
  private String name;
  private int amount;

  public Customer(int id, int orderId, String name, int amount) {
    this.id = id;
    this.orderId = orderId;
    this.name = name;
    this.amount = amount;
  }

  public int getId() {
    return id;
  }

  public int getOrderid() {
    return orderId;
  }

  public String getName() {
    return name;
  }

  public int getAmount() {
    return amount;
  }

  @Override
  public int compareTo(Customer o) {
    if (o.getId() > this.getId()) {
      return -1;
    }
    if (o.getId() < this.getId())
      return 1;
    return 0;
  }
}