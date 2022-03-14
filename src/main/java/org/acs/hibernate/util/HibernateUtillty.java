package org.acs.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class HibernateUtillty {
	
	private static org.hibernate.SessionFactory sessionFactory=null;
	
	public static SessionFactory getSessionFactory() {
	try {
		if (sessionFactory == null) {
			
			Configuration cfg = new Configuration();
			cfg.configure("org/acs/hibernate/model/hibernate.cfg.xml");
			
			sessionFactory = cfg.buildSessionFactory();
			
		}
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	return (SessionFactory) sessionFactory;
	
		
	}

}
