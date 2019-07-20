package com.techlabs.candidate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CandidateCrud {

	private Session session;
	private Transaction tran;
	private Configuration cfg;
	private SessionFactory factory;

	public CandidateCrud() {

		cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();
		session = factory.openSession();
		tran = session.beginTransaction();

	}

	public void create() {

		try {
			Candidate c1 = new Candidate("Ramarao", 10f);
			session.save(c1);
			Candidate c2 = new Candidate("sham", 9.8f);
			session.save(c2);
			this.tran.commit();
		} catch (Exception ex) {
			this.tran.rollback();
		} 
		finally {
			this.session.close();
		}
	}

	public void read() {
		try {

			Query query = session.createQuery("from Candidate");
			List<Candidate> candidates = query.list();
			for (Candidate candidate : candidates) {
				System.out.println(candidate.getName());
			}
			this.tran.commit();

		} catch (Exception e) {
			this.tran.commit();

		} finally {
			this.session.close();
		}

	}

	public void delete(int id) {
		try {
			
			Candidate candidate =(Candidate)session.load(Candidate.class, id);
			session.delete(candidate);
			System.out.println("Successfully Deleted");
			tran.commit();
			
		}catch(Exception e) {
			tran.rollback();
		}
		finally {
			this.session.close();
		}
	}
	public void update(int id) {
		try {
			Candidate candidate =(Candidate)session.load(Candidate.class, id);
			candidate.setName("Yogita");
			tran.commit();
				
		}catch(Exception e) {
			tran.rollback();
		}
		finally {
			session.close();
		}
	
		
	}

}
