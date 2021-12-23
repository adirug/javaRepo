package com.monocept.test;

import java.io.*;
import com.monocept.model.*;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee manager = new Manager(101, "Aditya", 15000);
		Employee developer = new Developer(102, "John", 12000);
		Employee accountant = new Accountant(103, "Jack", 10000);

		displaySalarySlip(manager);
		displaySalarySlip(developer);
		displaySalarySlip(accountant);

		outputDetailsText(manager);
		outputDetailsText(developer);
		outputDetailsText(accountant);
		
		outputDetailsHTML(manager);
		outputDetailsHTML(developer);
		outputDetailsHTML(accountant);

	}

	public static void displaySalarySlip(Employee emp) {
		System.out.println("Name - " + emp.getName());
		System.out.println("Id - " + emp.getId());
		System.out.println(emp.getSalery(0));
		System.out.println();
	}

	public static void outputDetailsText(Employee emp) {
		try {
			File employee = new File(emp.getName() + "_" + emp.getId() + ".txt");
			PrintWriter pw = new PrintWriter(employee);
			String name = emp.getName();
			int id = emp.getId();
			double salery = emp.getSalery(0);
			pw.println("Name of Employee - " + name);
			pw.println("Id of Employee - " + id);
			pw.println("Salery of Employee - " + salery);
			pw.close();
			String path = employee.getAbsolutePath();
			System.out.println(path);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void outputDetailsHTML(Employee emp) {
		try {
			File employee = new File(emp.getName() + "_" + emp.getId() + ".html");
			PrintWriter pw = new PrintWriter(employee);
			String name = emp.getName();
			int id = emp.getId();
			double salery = emp.getSalery(0);
			pw.println("Name of Employee - " + name+System.lineSeparator());
			pw.println("Id of Employee - " + id+System.lineSeparator());
			pw.println("Salery of Employee - " + salery+System.lineSeparator());
			pw.close();
			String path = employee.getAbsolutePath();
			System.out.println(path);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
