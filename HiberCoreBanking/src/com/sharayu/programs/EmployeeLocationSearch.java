package com.sharayu.programs;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sohamglobal.entities.Worker;

import jakarta.persistence.Query;

public class EmployeeLocationSearch {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.addAnnotatedClass(Worker.class).buildSessionFactory();
		Session ses=sf.getCurrentSession();
		ses.beginTransaction();
		
		String loc;
		Scanner sc=new Scanner(System.in);
		System.out.print("Location : ");
		loc=sc.nextLine();
		
		Query q=ses.createQuery("from Worker where location=:loc",Worker.class);
		q.setParameter("loc", loc);
		List<Worker> list=q.getResultList();
		
		list.stream().forEach(e->System.out.println(e.getName()+" | "+e.getPost()));
		
		
		
		
		
		
	}

}
