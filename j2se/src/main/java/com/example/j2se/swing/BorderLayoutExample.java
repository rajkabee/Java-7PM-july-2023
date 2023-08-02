package com.example.j2se.swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Border Layout");
		frame.setBounds(250, 100, 800, 500);
		JButton btn1 = new JButton("Button1");
		JButton btn2 = new JButton("Button2");
		JButton btn3 = new JButton("Button3");
		JButton btn4 = new JButton("Button4");
		JButton btn5 = new JButton("Button5");
		
		frame.add(btn1, BorderLayout.NORTH);
		frame.add(btn2, BorderLayout.WEST);
		frame.add(btn3, BorderLayout.CENTER);
		frame.add(btn4, BorderLayout.EAST);
		frame.add(btn5, BorderLayout.SOUTH);
		
		frame.setVisible(true);
		
	}
}
