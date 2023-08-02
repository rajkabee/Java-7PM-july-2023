package com.example.j2se.swing;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GridBagLayoutExample extends JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridBagLayoutExample frame = new GridBagLayoutExample();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GridBagLayoutExample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250,100,800,500);
		GridBagLayout grid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		setLayout(grid);
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=0;
		this.add(new JButton("Button1"), gbc);
		gbc.gridx=1;
		gbc.gridy=0;
		this.add(new JButton("Button2"), gbc);
		gbc.gridx=2;
		gbc.gridy=0;
		this.add(new JButton("Button3"), gbc);
//		gbc.fill=GridBagConstraints.VERTICAL;
//		gbc.gridx=3;
//		gbc.gridy=0;
//		gbc.gridheight=4;
//		this.add(new JButton("Button9"), gbc);
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth=2;
		this.add(new JButton("Button4"), gbc);
		gbc.gridx=2;
		gbc.gridy=1;
		gbc.gridwidth=1;
		this.add(new JButton("Button5"), gbc);
		
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.gridwidth=1;
		this.add(new JButton("Button6"), gbc);
		gbc.gridx=1;
		gbc.gridy=2;
		gbc.gridwidth=2;
		this.add(new JButton("Button7"), gbc);
		gbc.gridx=0;
		gbc.gridy=3;
		gbc.gridwidth=3;
		this.add(new JButton("Button8"), gbc);
		
	}

}
