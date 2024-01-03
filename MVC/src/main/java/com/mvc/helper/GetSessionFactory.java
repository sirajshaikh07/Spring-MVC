package com.mvc.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class GetSessionFactory {
	
	
	public SessionFactory session;
	
	
	

	
	public GetSessionFactory(){
		
		try {
			this.session=new Configuration().configure("config.xml").buildSessionFactory();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public SessionFactory getsession() {
		
		
		
		return this.session;
	}

}
