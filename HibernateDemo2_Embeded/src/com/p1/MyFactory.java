package com.p1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MyFactory {

	private static SessionFactory factory;
	
	static{
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		
	}

	public static synchronized SessionFactory getFactory() {
		return factory;
	}
	
	
}
