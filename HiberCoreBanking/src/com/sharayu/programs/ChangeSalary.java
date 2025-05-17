package com.sharayu.programs;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.sohamglobal.entities.Worker;

public class ChangeSalary {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.addAnnotatedClass(Worker.class).buildSessionFactory();
		Session ses=sf.getCurrentSession();
		ses.beginTransaction();
		
		int no;
		float sal;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter employee number : ");
		no=sc.nextInt();
		System.out.print("Enter new salary : ");
		sal=sc.nextFloat();
		
		Query<Worker> q=ses.createQuery("update Worker set salary=:s where empno=:n");
		q.setParameter("s", sal);
		q.setParameter("n", no);
		int cnt=q.executeUpdate();
		ses.getTransaction().commit();
		
		if(cnt>0)
			System.out.println("salary changed");
		else
			System.out.println("update failed");
		
		ses.close();
		
		
		
	}

}
