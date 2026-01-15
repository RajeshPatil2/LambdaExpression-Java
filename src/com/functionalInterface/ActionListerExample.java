package com.functionalInterface;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionListerExample {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Button Exmaple..>!!");

		JButton btn = new JButton("Click Me");

		btn.setBounds(50, 100, 10, 40);

		btn.addActionListener(e -> {
			System.out.println("Button clicked..!!");

		});
		frame.add(btn);
		frame.setSize(300, 200);
		frame.setLayout(null);
		frame.setVisible(false);
	}

}
