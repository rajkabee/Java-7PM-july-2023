package com.example.j2se.swing;

import java.awt.HeadlessException;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame(){
		setTitle("Inventory Management System");
		//setSize(800, 500);
		setIconImage(Toolkit.getDefaultToolkit().getImage("logo.png"));
		setBounds(250, 100, 800, 500);
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		
	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		
		
		
		frame.setVisible(true);
	}
	

}
