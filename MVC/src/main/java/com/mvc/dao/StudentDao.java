package com.mvc.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mvc.entities.Student;
import com.mvc.helper.GetSessionFactory;
@Repository
public class StudentDao {
	@Autowired
	GetSessionFactory factory;
	public int saveUser(Student s)
	{
		
		System.out.println("Aucto wire successfully done"+" "+s.toString());
		try {
			
			Session session=factory.getsession().openSession();
			session.persist(s);
			Transaction t=session.beginTransaction();
			t.commit();
			session.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return 1;
	}
	

}
