package com.mvc.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.entities.CollegeStudent;
import com.mvc.helper.GetSessionFactory;

@Repository
public class CollegeStudentDao {


	@Autowired
	GetSessionFactory factory;
	
	
	
	boolean done=false;
	public boolean saveCollegeStudent(CollegeStudent cs) {
	    try {
	        Session session = this.factory.getsession().openSession();
	        Transaction transaction = session.beginTransaction();
	        session.persist(cs); // Use the entity instance 'cs'
	        transaction.commit();
	        session.close();
	        done = true;
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return done;
	}

		
		
	}
	
	
	

