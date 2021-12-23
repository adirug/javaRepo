package com.monocept.model;

import java.util.Comparator;

public class SortByAmountComparator implements Comparator<Customer> {

  @Override
  public int compare(Customer o1, Customer o2) {
    if (o1.getAmount() > o2.getAmount()) {
      return 1;
    }
    if (o1.getAmount() < o2.getAmount())
      return -1;
    return 0;
  }

}