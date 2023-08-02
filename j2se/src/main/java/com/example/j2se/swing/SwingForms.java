package com.example.j2se.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import net.sourceforge.jdatepicker.DateModel;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

public class SwingForms {
	static JTextField nameField;
	static JTextArea descriptionField;
	static JTextField priceField;
	static UtilDateModel dateModel;
	static JDatePanelImpl datePanel;
	static JDatePickerImpl datePicker;
	static ButtonGroup activeButtonGroup;
	static JRadioButton activeRadio;
	static JRadioButton inActiveRadio;
	static JCheckBox smallSizecheck;
	static JCheckBox mediumSizecheck;
	static JCheckBox largeSizecheck;
	static JCheckBox extraLargeSizecheck;
	static String[] categories ={"Ladies Fashion", "Mens Fashion", "Shoes", "Children", "Winter"};
	static JComboBox<String> categoryComboBox;
	static JButton submitButton;
	static ProductDao productDao = new ProductDao();
	static ProductTablePanel tablePanel;
	static ArrayList<Product> products;
	MyFrame frame;
	public SwingForms() {
		frame = new MyFrame();
		Container pane = frame.getContentPane();
		JTabbedPane tabbedPane = new JTabbedPane();
		
		//JButton button = new JButton("Frame Header");
		//pane.add(button, BorderLayout.NORTH);
		
		//form pane start
		JPanel formPanel = new JPanel();
		formPanel.setLayout(new BorderLayout());
		JLabel formHeader= new JLabel("Form Header", SwingConstants.CENTER);
		//formHeader.setHorizontalAlignment(1);
		formHeader.setFont(new Font("Algerian", 0, 36));
		formHeader.setBackground(Color.GREEN);
		formHeader.setForeground(Color.gray);
		formPanel.add(formHeader, BorderLayout.NORTH);
		
		
		JPanel form = new JPanel();
		form.setBackground(Color.getHSBColor(.5f, 1, .7f));
		form.setLayout(null);
		
		JLabel nameLabel = new JLabel("Name: ");
		nameLabel.setBounds(250, 20, 100, 20);
		form.add(nameLabel);
		nameField = new JTextField();
		nameField.setBounds(350, 20, 200, 20);
		form.add(nameField);
		
		JLabel descriptionLabel = new JLabel("Description: ");
		descriptionLabel.setBounds(250, 50, 100, 20);
		form.add(descriptionLabel);
		descriptionField = new JTextArea();
		descriptionField.setBounds(350, 50, 200, 60);
		form.add(descriptionField);
		
		JLabel priceLabel = new JLabel("Unit Price: ");
		priceLabel.setBounds(250, 120, 100, 20);
		form.add(priceLabel);
		priceField = new JTextField();
		priceField.setBounds(350, 120, 200, 20);
		form.add(priceField);
		
		JLabel mfdDateLabel = new JLabel("Manufacture Date: ");
		mfdDateLabel.setBounds(250, 150, 100, 20);
		form.add(mfdDateLabel);
		dateModel = new UtilDateModel();
		datePanel = new JDatePanelImpl(dateModel);
		datePicker = new JDatePickerImpl(datePanel);
		datePicker.setBounds(350, 150, 200, 20);
		form.add(datePicker);
		
		JLabel activeLabel = new JLabel("Active: ");
		activeLabel.setBounds(250, 180, 100, 20);
		form.add(activeLabel);
		
		activeButtonGroup = new ButtonGroup();
		activeRadio = new JRadioButton("Active");
		activeRadio.setSelected(true);
		activeRadio.setBounds(350, 180, 98, 20);
		activeButtonGroup.add(activeRadio);
		form.add(activeRadio);
		inActiveRadio = new JRadioButton("In Active");
		inActiveRadio.setBounds(450, 180, 100, 20);
		activeButtonGroup.add(inActiveRadio);
		form.add(inActiveRadio);
		
		JLabel sizeLabel = new JLabel("Size Availabel: ");
		sizeLabel.setBounds(250, 210, 100, 20);
		form.add(sizeLabel);
		
		smallSizecheck = new JCheckBox("sm");
		smallSizecheck.setBounds(350, 210, 45, 20);
		form.add(smallSizecheck);
		mediumSizecheck = new JCheckBox("md");
		mediumSizecheck.setBounds(400, 210, 45, 20);
		form.add(mediumSizecheck);
		largeSizecheck = new JCheckBox("lg");
		largeSizecheck.setBounds(450, 210, 45, 20);
		form.add(largeSizecheck);
		extraLargeSizecheck = new JCheckBox("xl");
		extraLargeSizecheck.setBounds(500, 210, 45, 20);
		form.add(extraLargeSizecheck);
		
		JLabel categoryLabel = new JLabel("Category: ");
		categoryLabel.setBounds(250, 240, 100, 20);
		form.add(categoryLabel);
		
		categoryComboBox = new JComboBox<String>(categories);
		categoryComboBox.setBounds(350, 240, 200, 20);
		form.add(categoryComboBox);
		
		submitButton = new JButton("Submit");
		submitButton.setBounds(250, 270, 300, 30);
		submitButton.setBackground(Color.getHSBColor(.35f, 1, .6f));
		submitButton.setForeground(Color.getHSBColor(.4f, .8f, 1));
		submitButton.setFont(new Font("Calibri", 1, 24));
		form.add(submitButton);
		
		submitButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Forms Panel");
				if(submitButton.equals((JButton)e.getSource())) {
					Product pd = new Product();
					pd.setName(nameField.getText());
					pd.setDescription(descriptionField.getText());
					pd.setUnitPrice(Double.parseDouble(priceField.getText()));
					pd.setMfgDate(dateModel.getValue());
					pd.setActive(activeRadio.isSelected()?true:false);
					pd.setSizesAvailable(
							(smallSizecheck.isSelected()?"small,":"")+
							(mediumSizecheck.isSelected()?"medium,":"")+
							(largeSizecheck.isSelected()?"large,":"")+
							(extraLargeSizecheck.isSelected()?"extraLarge,":"")
							);
					pd.setCategory((String)categoryComboBox.getSelectedItem());
					System.out.println(pd);
					productDao.save(pd);
					nameField.setText("");
					descriptionField.setText("");
					priceField.setText("");
					dateModel.setDate(0, 0, 0);
					activeRadio.setSelected(true);
					inActiveRadio.setSelected(false);
					smallSizecheck.setSelected(false);
					mediumSizecheck.setSelected(false);
					largeSizecheck.setSelected(false);
					extraLargeSizecheck.setSelected(false);
					categoryComboBox.setSelectedIndex(0);
					tablePanel.model.products=productDao.getAll();
					tablePanel.model.fireTableDataChanged();
					
				}
			
			}
		});
		formPanel.add(form, BorderLayout.CENTER);
		//form pane end
		
		//table Panel start
		products = productDao.getAll();
		tablePanel = new ProductTablePanel(this);
		
		//table panel end
		
		
		
		tabbedPane.add("Products List",tablePanel);
		tabbedPane.add("New Product",formPanel);
		pane.add(tabbedPane, BorderLayout.CENTER);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingForms();
	}
}
