package com.techlabs.candidate.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.persistence.Cache;
import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnitUtil;
import javax.persistence.SynchronizationType;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.metamodel.Metamodel;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.candidate.Candidate;
import com.techlabs.candidate.CandidateCrud;

public class TestCandidate {
	public static void main(String[] args) {

		CandidateCrud cc =	new CandidateCrud();
		//cc.create();
		//cc.read();
		//cc.delete(2);
		cc.update(4);
		
	}


}
