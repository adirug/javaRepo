package com.monocept.test;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

public class Multithreading {

	public static void main(String[] args) {

		Frame frame = new Frame("Thread demo frame");
		Button button1 = new Button("Hello");
		Button button2 = new Button("Print time in hh:mm:ss");
		Button button3 = new Button("print Async");
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.setLayout(new FlowLayout());
		frame.setSize(500, 400);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Hello");
			};
		});

		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				DayTimePrinter printer = new DayTimePrinter();
				printer.actionPerformed(e);
			};
		});

		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Async");
				System.out.println("Async");
			};
		});
	}

}
