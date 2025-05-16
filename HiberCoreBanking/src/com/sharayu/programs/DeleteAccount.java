package com.sharayu.programs;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.sohamglobal.entities.Account;

public class DeleteAccount {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.addAnnotatedClass(Account.class).buildSessionFactory();
		Session ses=sf.getCurrentSession();
		ses.beginTransaction();
		
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter account number : ");
		no=sc.nextInt();
		
		//delete from accounts where accno=?
		
		Query q=ses.createQuery("delete from Account where accno=:ano");
		q.setParameter("ano", no);
		int cnt=q.executeUpdate();
		ses.getTransaction().commit();
		System.out.println("records deleted : "+cnt);
		
	}

}
