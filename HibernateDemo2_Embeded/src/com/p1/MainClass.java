package com.p1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		
		System.out.println("1");
		
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		System.out.println(" 2");
		
		// ------------- To Save Data -------------
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Certifications c1 = new Certifications("Java", 'A');
		Certifications c2 = new Certifications("JavaEE", 'A');
		Certifications c3 = new Certifications("Java-Spring", 'A');
		Certifications c4 = new Certifications("JavaHibernate", 'A');
		
		
		List<Certifications> list = new ArrayList<Certifications>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		
		
		Address add = new Address("Dubai - 9","Dubai");
		Address add_Tempo = new Address();
		
		Student student = new Student("Mr X",add,add_Tempo,99);
		student.setCertificationsList(list);
		
		session.save(student);  // hibernate method . persist (JPA)
	
		
		// ------- Read Data ---------------
		/*Student student = session.get(Student.class, 1);  // load 
		System.out.println(student);
		
		
		student.setMarks(80);   // change in the update 
		
		session.update(student);
		System.out.println(" 3");*/
		
		t.commit();
		session.close();
		System.out.println("All Done");
		
		
		
		javax.persistence.Query query = session.getNamedQuery("student.queryToGetStudent");
				
	}

}
