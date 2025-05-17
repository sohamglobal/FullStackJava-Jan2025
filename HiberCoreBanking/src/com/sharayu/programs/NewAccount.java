package com.sharayu.programs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sohamglobal.entities.Account;

public class NewAccount {
	public static void main(String[] args) {
		Account obj=new Account();
		obj.setAccno(1053);
		obj.setAccnm("owee kale");
		obj.setAcctype("fixed");
		obj.setBalance(35600);
		
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.addAnnotatedClass(Account.class).buildSessionFactory();
		Session ses=sf.getCurrentSession();
		ses.beginTransaction();
		
		// insert into accounts values(?,?,?,?);
		ses.persist(obj);
		ses.getTransaction().commit();
		System.out.println("New Account Created");
	}

}
