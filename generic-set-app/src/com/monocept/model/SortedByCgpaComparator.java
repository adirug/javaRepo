package com.monocept.model;

import java.util.Comparator;

public class SortedByCgpaComparator implements Comparator<Student> {

	@Override
	  public int compare(Student o1, Student o2) {
	    if (o1.getCGPA() > o2.getCGPA()) {
	      return 1;
	    }
	    if (o1.getCGPA() < o2.getCGPA())
	      return -1;
	    return 0;
	  }
}
