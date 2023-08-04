package com.example.j2se.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JOptionPaneExample extends JFrame {

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JOptionPaneExample frame = new JOptionPaneExample();
					//JOptionPane.showMessageDialog(frame, "Welcome to JOptionPane");
					JOptionPane.showMessageDialog(frame, "Successfully Updated", "Success", JOptionPane.QUESTION_MESSAGE);
					//String name = JOptionPane.showInputDialog("Enter your name: ");
					//System.out.println(name);
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
	public JOptionPaneExample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
			}

}
