package com.zensar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;

public class DbOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		//Singleton and heavy weight Session factory
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		//insert new record
		//Product p = new Product(1, "Redmi 6 Pro", "RedMi", 20000.00);
		//save(p);
		//get record according to primary key
		
		/*
		 * Product p = s.get(Product.class, 1003); if(p!=null) { System.out.println(p);
		 * }else { System.out.println("Product not found."); }
		 */
		//Product p = s.load(Product.class, 1006);
		
		//Update a record
		/*
		 * Product p = s.get(Product.class, 1005); if(p!=null) { double up =
		 * p.getPrice(); p.setPrice(up + 200); s.update(p); }else {
		 * System.out.println("Product not found."); }
		 */
			
		//delete a record
		Product p = s.get(Product.class, 1005);
		if(p!=null) {	
		s.delete(p);
			//s.update(p);
		}else {
			System.out.println("Product not found.");
		}
		
		
		t.commit();
		s.close();
	}

}
