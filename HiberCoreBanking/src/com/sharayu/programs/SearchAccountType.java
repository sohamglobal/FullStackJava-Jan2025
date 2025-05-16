package com.sharayu.programs;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sohamglobal.entities.Account;

import jakarta.persistence.Query;

public class SearchAccountType {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.addAnnotatedClass(Account.class).buildSessionFactory();
		Session ses=sf.getCurrentSession();
		ses.beginTransaction();
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Account Type : ");
		String ty=sc.nextLine();
		
		Query q=ses.createQuery("from Account where acctype= :type",Account.class);
		q.setParameter("type", ty);
		List<Account> list=q.getResultList();
		
		System.out.println("Accounts retrieved "+list.size());
		list.stream().forEach(obj->System.out.println(obj.getAccnm()));
		
		ses.close();
	}

}
