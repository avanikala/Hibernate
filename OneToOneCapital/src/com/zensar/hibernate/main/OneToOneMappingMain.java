package com.zensar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Country;
import com.zensar.entities.Flag;

public class OneToOneMappingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		Country ct = new Country();
		ct.setName("India");
		ct.setLanguage("Hindi");
		ct.setPopulation(1300000000l);
		
		Flag fl = new Flag();
		fl.setFlagName("Tiranga");
		fl.setDescription("Consists three colors with a chakra");
		
		ct.setFlag(fl);
		fl.setCountry(ct);
		s.save(ct);
		s.save(fl);
		
		t.commit();
		s.close();
		System.exit(0);
	}

}
