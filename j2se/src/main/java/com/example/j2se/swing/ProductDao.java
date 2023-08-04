package com.example.j2se.swing;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductDao {
	private Configuration con;
	private SessionFactory sf;
	private Session session;
	private Transaction tx;
	public void config(){
		con = new Configuration().configure().addAnnotatedClass(Product.class);
		sf=con.buildSessionFactory();
		session = sf.openSession();
		tx = session.beginTransaction();
	}
	public void save(Product p) {
		config();
		if(tx.getStatus()==null) {
			tx=session.beginTransaction();
		}
		session.save(p);
		tx.commit();
		session.close();
		sf.close();
	}
	public ArrayList<Product> getAll() {
		config();
		ArrayList<Product> products =(ArrayList<Product>) session.createQuery("SELECT a FROM Product a", Product.class).getResultList();
		session.close();
		sf.close();
		return products;
	}
	public String update(Product pd) {
		config();
		if(tx.getStatus()==null) {
			tx=session.beginTransaction();
		}
		session.update(pd);
		tx.commit();
		session.close();
		sf.close();
		return "Done";
		
		
	}
	
	public String delete(Product pd) {
		config();
		if(tx.getStatus()==null) {
			tx=session.beginTransaction();
		}
		session.delete(pd);
		tx.commit();
		session.close();
		sf.close();
		return "Done";
		
		
	}
	

}
