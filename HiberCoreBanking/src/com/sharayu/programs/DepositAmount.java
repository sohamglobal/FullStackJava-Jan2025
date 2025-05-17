package com.sharayu.programs;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sohamglobal.entities.Account;

import jakarta.persistence.Query;

public class DepositAmount {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.addAnnotatedClass(Account.class).buildSessionFactory();
		Session ses=sf.getCurrentSession();
		ses.beginTransaction();
		
		int no;
		float amt;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter account number : ");
		no=sc.nextInt();
		System.out.print("Enter deposit amount : ");
		amt=sc.nextFloat();
		
		Query q=ses.createQuery("update Account set balance=balance+:amt where accno=:ano");
		q.setParameter("amt", amt);
		q.setParameter("ano", no);
		int cnt=q.executeUpdate();
		ses.getTransaction().commit();
		
		if(cnt>0)
			System.out.println("balance updated");
		else
			System.out.println("deposit failed");
		
		ses.close();
		
	}

}
