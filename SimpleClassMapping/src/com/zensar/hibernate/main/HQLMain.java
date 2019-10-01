package com.zensar.hibernate.main;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;

//Hibernate Query Language HQL 
//object oriented query language
public class HQLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		//Singleton and heavy weight Session factory
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();

		//JPA  Java persistence Api Query
		
		//Query q = s.createQuery("from Product");	
		 //Query q = s.createQuery("from Product p where p.price > 20000 and p.price < 65000");
		// Query q = s.createQuery("from Product p where p.price between 21000 and 60000");
		//Query q = s.createQuery("from Product p where p.brand like 'r%'");
		//Query q = s.createQuery("from Product p where p.name = 'IPhone'");
		/*
		 * List<Product> products = q.getResultList(); for(Product product : products) {
		 * System.out.println(product); }
		 */
		//Query q = s.createQuery("select p.name, p.price from Product p");
		//Query q = s.createQuery("select p.productId, p.name, p.brand from Product p");
		//Query q = s.createQuery("select p.price, p.brand p.name from Product p");
		
		/*
		 * List<Object[]> objects = q.getResultList(); for(Object[] ob : objects) {
		 * for(int i= 0; i< ob.length; i++) { System.out.println(ob[i]); } }
		 */
		
		/*
		 * Query q = s.createQuery("select max(p.price) from Product p"); Double
		 * maxPrice = (Double) q.getSingleResult(); System.out.println(maxPrice);
		 */
		
		/*
		 * Query q1 = s.createQuery("select min(p.price) from Product p"); Double
		 * minPrice = (Double) q1.getSingleResult(); System.out.println(minPrice);
		 */
		
		/*
		 * Query q2 = s.createQuery("select sum(p.price) from Product p"); Double sum =
		 * (Double) q2.getSingleResult(); System.out.println(sum);
		 */
		
		/*
		 * Query q3 = s.createQuery("select avg(p.price) from Product p"); Double
		 * average = (Double) q3.getSingleResult(); System.out.println(average);
		 */
		
		/*
		 * Query q4 = s.createQuery("select count(p.price) from Product p"); Double co =
		 * (Double) q4.getSingleResult(); System.out.println(co);
		 */
		
		//Criteria cr = s.createCriteria(Product.class);
		Criteria cr = s.createCriteria(Product.class);
		//List<Product> products =  cr.getResultList();
		List<Product> products = cr.list();
		for(Product p : products) {
			System.out.println(p);
		}
 		
		t.commit();
		s.close();
	}

}
