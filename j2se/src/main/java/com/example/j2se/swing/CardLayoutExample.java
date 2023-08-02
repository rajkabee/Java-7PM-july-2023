package com.example.j2se.swing;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class CardLayoutExample extends JFrame implements ActionListener{
	CardLayout crd;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardLayoutExample frame = new CardLayoutExample();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public CardLayoutExample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		crd = new CardLayout();
		setLayout(crd);
		JButton btn1 =  new JButton("Apples");
		JButton btn2 =  new JButton("Papayas");
		JButton btn3 =  new JButton("Kiwi");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		add("a",btn1);
		add("b",btn2);
		add("c",btn3);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		crd.next(this.getContentPane());
		
	}

}
