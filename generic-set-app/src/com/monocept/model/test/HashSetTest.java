package com.monocept.model.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.monocept.model.SortedByCgpaComparator;
import com.monocept.model.SortedByNameComparator;
import com.monocept.model.Student;

public class HashSetTest {

	public static void main(String[] args) {
		caseStudy6();
	}
	
	public static void caseStudy1() {
		Set<Integer> numbers;
		//numbers = new HashSet<Integer>();
		//numbers = new LinkedHashSet<Integer>();
		numbers = new TreeSet<Integer>();
		
		numbers.add(100);
		numbers.add(10);
		numbers.add(1);
		numbers.add(100);
		numbers.add(101);
		numbers.add(13334);
		
		System.out.println("Size is "+numbers.size());
		
		for(Integer x:numbers) {
			System.out.println(x);
		}
	}
	
	public static void caseStudy2() {
		Student s1 = new Student(101,"Nihal",8);
		Student s2 = new Student(101,"Nihal",8);
		Student s3 = new Student (101,"Nihal",8);
		
		Set<Student> students;
		students = new HashSet<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		System.out.println("Size is "+students.size());
		
		for(Student s:students) {
			System.out.println("Roll no - "+s.getRollNo());
			System.out.println("Name - "+s.getName());
			System.out.println("CGPA - "+s.getCGPA());
			System.out.println("WIth hash code - "+s.hashCode());
		}
	}
	
	public static void caseStudy3() {
		Student s1 = new Student(101,"Nihal",8);
		Student s2 = new Student(101,"Nihal",8);
		Student s3 = new Student (101,"Vidya",7);
		
		Set<Student> students;
		students = new TreeSet<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		System.out.println("Size is "+students.size());
		
		for(Student s:students) {
			System.out.println("Roll no - "+s.getRollNo());
			System.out.println("Name - "+s.getName());
			System.out.println("CGPA - "+s.getCGPA());
			System.out.println("WIth hash code - "+s.hashCode());
		}
	}
	
	public static void caseStudy4() {
		Student s1 = new Student(101,"Nihal",8);
		Student s2 = new Student(101,"Nihal",8);
		Student s3 = new Student (101,"Vidya",7);
		Student s5 = new Student (101,"Aditya",6);
		Student s4 = new Student (101,"Sayed",9);
		Set<Student> students;
		students = new TreeSet<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
		System.out.println("Size is "+students.size()+"\nSorted by roll no.");
		for(Student s:students) {
			System.out.println("Roll no - "+s.getRollNo());
			System.out.println("Name - "+s.getName());
			System.out.println("CGPA - "+s.getCGPA());
			System.out.println("WIth hash code - "+s.hashCode());
		}
	}
	
	public static void caseStudy5() {
		Student s1 = new Student(101,"Nihal",8);
		Student s2 = new Student(101,"Nihal",8);
		Student s3 = new Student (101,"Vidya",7);
		Student s5 = new Student (101,"Aditya",6);
		Student s4 = new Student (101,"Sayed",9);
		Set<Student> students;
		students = new TreeSet<Student>(new SortedByNameComparator());
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
		System.out.println("Size is "+students.size()+"\nSorted by name ");
		for(Student s:students) {
			System.out.println("Roll no - "+s.getRollNo());
			System.out.println("Name - "+s.getName());
			System.out.println("CGPA - "+s.getCGPA());
			System.out.println("WIth hash code - "+s.hashCode());
			System.out.println(" ");
		}
	}

	public static void caseStudy6() {
		Student s1 = new Student(101,"Nihal",8);
		Student s2 = new Student(101,"Nihal",8);
		Student s3 = new Student (101,"Vidya",7);
		Student s5 = new Student (101,"Aditya",6);
		Student s4 = new Student (101,"Sayed",9);
		Set<Student> students;
		students = new TreeSet<Student>(new SortedByCgpaComparator());
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
		System.out.println("Size is "+students.size()+"\nSorted by CGPA ");
		for(Student s:students) {
			System.out.println("Roll no - "+s.getRollNo());
			System.out.println("Name - "+s.getName());
			System.out.println("CGPA - "+s.getCGPA());
			System.out.println("WIth hash code - "+s.hashCode());
			System.out.println(" ");
		}
	}
	
}
