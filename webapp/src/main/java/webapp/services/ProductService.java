package webapp.services;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import webapp.entities.Product;
import webapp.util.HibernateUtil;

public class ProductService extends HibernateUtil{
	Session session;
	Transaction tx;
	public Product save(Product pd) {
		configure();
		session=sf.openSession();
		if(tx==null || !tx.isActive()) {
			tx = session.beginTransaction();
		}
		int id = (int) session.save(pd);
		pd=null;
		pd = session.load(Product.class, id);
		tx.commit();
		session.close();
		sf.close();
		return pd;
		
	}
	
	public List<Product> getProducts(){
		configure();
		session=sf.openSession();
		List<Product> products = session.createQuery("SELECT a FROM Product a", Product.class).getResultList();
		session.close();
		sf.close();
		return products;
		
	}

	public Product getProduct(int id) {
		configure();
		session=sf.openSession();
		Product pd = (Product)session.get(Product.class, id);
		session.close();
		sf.close();
		return pd;
	}

	public void update(Product pd) {
		configure();
		session=sf.openSession();
		if(tx==null || !tx.isActive()) {
			tx = session.beginTransaction();
		}
		session.saveOrUpdate(pd);
		tx.commit();
		session.close();
		sf.close();
	}

	public void delete(int id) {
		configure();
		session=sf.openSession();
		if(tx==null || !tx.isActive()) {
			tx = session.beginTransaction();
		}
		Product pd = (Product)session.get(Product.class, id);
		session.delete(pd);
		tx.commit();
		session.close();
		sf.close();
		
	}
}
