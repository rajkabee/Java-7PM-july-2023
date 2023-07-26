package swingApp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1138, 587);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("New button");
		contentPane.add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_2 = new JButton("New button");
		contentPane.add(btnNewButton_2, BorderLayout.WEST);
		
		JButton btnNewButton_3 = new JButton("New button");
		contentPane.add(btnNewButton_3, BorderLayout.EAST);
		
		JButton btnNewButton_4 = new JButton("New button");
		contentPane.add(btnNewButton_4, BorderLayout.SOUTH);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(new Color(192, 192, 192));
		centerPanel.setBorder(new LineBorder(new Color(0, 128, 255)));
		contentPane.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(new GridLayout(3,3));
		
		JButton btnNewButton_1 = new JButton("New button");
		centerPanel.add(btnNewButton_1);
		
		JButton btnNewButton_5 = new JButton("New button");
		centerPanel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		centerPanel.add(btnNewButton_6);
		
		JButton btnNewButton_8 = new JButton("New button");
		centerPanel.add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("New button");
		centerPanel.add(btnNewButton_7);
		
		JButton btnNewButton_10 = new JButton("New button");
		centerPanel.add(btnNewButton_10);
		
		JButton btnNewButton_9 = new JButton("New button");
		centerPanel.add(btnNewButton_9);
		
		JButton btnNewButton_11 = new JButton("New button");
		centerPanel.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("New button");
		centerPanel.add(btnNewButton_12);
	}

}
