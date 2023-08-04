package webapp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import webapp.entities.Product;



public class HibernateUtil {
	public  Configuration con;
	public SessionFactory sf;
	public void configure() {
		con = new Configuration()
				.configure()
				.addAnnotatedClass(Product.class);
		sf = con.buildSessionFactory();
	}
}
