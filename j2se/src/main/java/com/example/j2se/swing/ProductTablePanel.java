package com.example.j2se.swing;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;

public class ProductTablePanel extends JPanel implements ActionListener {
	ProductTableModel model;
	SwingForms formsWindow;
	ArrayList<JButton> editBtnList = new ArrayList<JButton>();
	ArrayList<JButton> deleteBtnList = new ArrayList<JButton>();

	public ProductTablePanel(SwingForms formsWindow) {
		this.formsWindow = formsWindow;
		model = new ProductTableModel(formsWindow.products);
		JTable table = new JTable(model);
		table.getColumn("Edit").setCellRenderer(new JTableButtonRenderer());
		table.addMouseListener(new JTableButtonMouseListener(table));
		editBtnList.forEach(btn -> {
			btn.addActionListener(this);
		});
		table.getColumn("Delete").setCellRenderer(new JTableButtonRenderer());
		deleteBtnList.forEach(btn -> {
			btn.addActionListener(this);
		});
		JScrollPane sPane = new JScrollPane(table);
		add(sPane);

		/*
		 * String[] cols= {"asdasd","asdsadas","sadsad"}; String[][] rows =
		 * {{"sdsada","adasdas","asdsad"}, {"dasdsa","dasdsad","asdsa"}}; JTable table =
		 * new JTable(rows, cols); JScrollPane sPane = new JScrollPane(table);
		 * this.add(sPane);
		 */

	}

	class ProductTableModel extends AbstractTableModel {
		ArrayList<Product> products = new ArrayList<>();
		String[] cols = { "id", "Name", "Category", "Unit Price", "Active", "Edit", "Delete" };

		public ProductTableModel(ArrayList<Product> products) {
			super();
			this.products = products;
			for (int i = 0; i < products.size(); i++) {
				editBtnList.add(new JButton("Edit"));
			}
			for (int i = 0; i < products.size(); i++) {
				deleteBtnList.add(new JButton("Delete"));
			}
		}

		@Override
		public int getRowCount() {
			if (products.isEmpty()) {
				return 0;
			}

			return products.size();
		}

		@Override
		public int getColumnCount() {
			if (cols.length == 0 || cols == null) {
				return 0;
			}
			return cols.length;
		}

		@Override
		public Object getValueAt(int row, int col) {
			Object res = null;
			if (col == 0) {
				res = products.get(row).getId();
			} else if (col == 1) {
				res = products.get(row).getName();
			} else if (col == 2) {
				res = products.get(row).getCategory();
			} else if (col == 3) {
				res = products.get(row).getUnitPrice();
			} else if (col == 4) {
				res = products.get(row).isActive();
			} else if (col == 5) {
				res = editBtnList.get(row);
			} else if (col == 6) {
				res = deleteBtnList.get(row);
			}
			return res;
		}

		@Override
		public Class<?> getColumnClass(int col) {
			if (col == 0) {
				return Integer.class;
			} else if (col == 3) {
				return Double.class;
			} else if (col == 4) {
				return Boolean.class;
			} else if (col == 5 || col == 6) {
				return JButton.class;
			} else {
				return String.class;
			}
		}

		@Override
		public String getColumnName(int column) {

			return cols[column];
		}

	}

	class JTableButtonRenderer implements TableCellRenderer {

		@Override
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			JButton button = (JButton) value;
			return button;
		}

	}

	class JTableButtonMouseListener extends MouseAdapter {
		private final JTable table;

		public JTableButtonMouseListener(JTable table) {
			this.table = table;
		}

		public void mouseClicked(MouseEvent e) {
			int column = table.getColumnModel().getColumnIndexAtX(e.getX()); // get the coloum of the button
			int row = e.getY() / table.getRowHeight(); // get the row of the button

			// *Checking the row or column is valid or not
			if (row < table.getRowCount() && row >= 0 && column < table.getColumnCount() && column >= 0) {
				Object value = table.getValueAt(row, column);
				if (value instanceof JButton) {
					// perform a click event
					((JButton) value).doClick();
				}
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button clicked!");
		JButton btn = (JButton) e.getSource();
		if (btn.getText().equals("Edit")) {
			for (JButton button : editBtnList) {
				if (button.equals(btn)) {
					int index = editBtnList.indexOf(button);
					System.out.println(index + ". Edit button Clicked!");
					Product pd = this.model.products.get(index);
					EditWindow editWindow = new EditWindow(pd, this.formsWindow);
					editWindow.setVisible(true);
				}
			}
		}
		else {
			for (JButton button : deleteBtnList) {
				if (button.equals(btn)) {
					int index = deleteBtnList.indexOf(button);
					System.out.println(index + ". Edit button Clicked!");
					Product pd = this.model.products.get(index);
					int i = JOptionPane.showConfirmDialog(this.formsWindow.frame, "Confirm Delete?");
					if(i==0) {
						this.formsWindow.productDao.delete(pd);
						this.model.products=this.formsWindow.productDao.getAll();
						this.model.fireTableDataChanged();
					}
					
				}
			}
		}

	}

}
