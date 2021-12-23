package com.monocept.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class DayTimePrinter implements ActionListener {
	Date date = new Date();

	public static void DayTimePrinter() {

	}

	public void infiniteLoop() {

		while (true) {
			System.out.println(date);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		new Thread(new Runnable() {
			public void run() {
				while (true) {
					System.out.println(date);
				}
			}
		}).start();
	}
}
