package com.sharayu.programs;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sohamglobal.entities.Account;

import jakarta.persistence.Query;

public class SearchAccountNumber {
	public static void main(String[] args) {
		int no;
		Scanner sc=new Scanner(System.in);
		
		
		
		//select * from accounts where accno=?
		//pst.setInt(1,no)
		
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.addAnnotatedClass(Account.class).buildSessionFactory();
		Session ses=sf.getCurrentSession();
		ses.beginTransaction();
		
		Query q=ses.createQuery("from Account where accno= :accno",Account.class);
		
		System.out.print("Enter account number : ");
		no=sc.nextInt();
		
		q.setParameter("accno", no);
		List<Account> list=q.getResultList();
		
		System.out.println("Accounts Retrieved : "+list.size());
		
		list.stream().forEach(obj->System.out.println(obj.getAccnm()+" | "+obj.getBalance()));
		
	}

}
