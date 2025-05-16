package com.sharayu.programs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sohamglobal.entities.Worker;

public class NewWorker {
	public static void main(String[] args) {
		Worker w=new Worker();
		w.setName("shailaja"); 
		w.setDept("admin"); 
		w.setPost("auditor");
		w.setLocation("dubai"); 
		w.setSalary(35000);
		 
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.addAnnotatedClass(Worker.class).buildSessionFactory();
		Session ses=sf.getCurrentSession();
		ses.beginTransaction();
		
		ses.persist(w);
		ses.getTransaction().commit();
		System.out.println("new employee created successfully");
				
		ses.close();
	}

}
