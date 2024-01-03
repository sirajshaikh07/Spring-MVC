package com.mvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.dao.StudentDao;
import com.mvc.entities.Student;
@Service
public class ServiceLayer {

	
	

	public StudentDao getDao() {
		return dao;
	}

	@Autowired
	public void setDao(StudentDao dao) {
		this.dao = dao;
	}


	StudentDao dao;
	
	
	public int saveUserService(Student s)
	{
		
		System.out.println("Service layers access");
		
		dao.saveUser(s);
		return 1;
		
	}
	
	
	
	
	
	
	
	
}
