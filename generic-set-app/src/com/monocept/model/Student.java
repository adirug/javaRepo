package com.monocept.model;

public class Student implements Comparable<Student> {
	private int rollNo;
	private String name;
	private double cgpa;
	
	
	public Student(int rollNo, String name, double cgpa) {
		this.rollNo= rollNo;
		this.name= name;
		this.cgpa=cgpa;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public String getName() {
		return name;
	}
	
	public double getCGPA() {
		return cgpa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cgpa);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Double.doubleToLongBits(cgpa) != Double.doubleToLongBits(other.cgpa))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNo != other.rollNo)
			return false;
		return true;
	}
	
	@Override
	  public int compareTo(Student o) {
	    if (o.getRollNo() > this.getRollNo()) {
	      return -1;
	    }
	    if (o.getRollNo() < this.getRollNo())
	      return 1;
	    return 0;
	  }
		
}
