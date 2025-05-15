package com.sharayu.programs;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sohamglobal.entities.User;

public class NewUser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String uid,psw,cnm;
		System.out.print("Enter UserID : ");
		uid=sc.nextLine();
		System.out.print("Enter Password : ");
		psw=sc.nextLine();
		System.out.print("Enter Customer name : ");
		cnm=sc.nextLine();
		
		
		User u=new User();
		u.setUserid(uid);
		u.setPassword(psw);
		u.setCustname(cnm);
		
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.addAnnotatedClass(User.class).buildSessionFactory();
		Session ses=sf.getCurrentSession();
		ses.beginTransaction();
		
		ses.persist(u);
		ses.getTransaction().commit();
		System.out.println("new user created successfully");
		ses.close();
		sc.close();
	}

}
