package com.zensar.hibernate.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Movie;
import com.zensar.entities.Song;

/**
 * @author Avani Kala
 * @Creation_Date 27/09/2019 05:07 PM
 * @Modification_Date 27/09/2019 05:07 PM
 * @version 1.0
 * @copyright Zensar Technologies. All rights reserved.
 * @description One To Many relationship
 *
 */
public class OneToManyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		Movie m = new Movie();
		m.setTitle("URI");
		m.setReleaseDate(LocalDate.of(2019, 05, 06));
	
		Song s1 = new Song();
		s1.setName("Jagga");
		
		Song s2 = new Song();
		s2.setName("J");
		
		Song s3 = new Song();
		s3.setName("cvg");
		
		s1.setMovie(m);
		s2.setMovie(m);
		s3.setMovie(m);
		
		List<Song> songs = new ArrayList<Song>();
		songs.add(s1);
		songs.add(s2);
		songs.add(s3);
		
		m.setSong(songs);
		s.save(m);
		s.save(s1);
		s.save(s2);
		s.save(s3);
		
		t.commit();
		s.close();
		System.exit(0);
	}

}
