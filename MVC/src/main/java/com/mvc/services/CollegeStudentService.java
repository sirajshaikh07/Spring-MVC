package com.mvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.dao.CollegeStudentDao;
import com.mvc.entities.CollegeStudent;

@Service
public class CollegeStudentService {

@Autowired
CollegeStudentDao csd;	


public boolean saveCSD(CollegeStudent cs)
{
	
	
	
	return csd.saveCollegeStudent(cs);
}








	
}
