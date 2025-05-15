package com.sharayu.programs;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sohamglobal.entities.User;

import jakarta.persistence.Query;

public class UsersList {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.addAnnotatedClass(User.class).buildSessionFactory();
		Session ses=sf.getCurrentSession();
		ses.beginTransaction();
		
		//select * from users
		//Using HQL instead of SQL
		
		Query q=ses.createQuery("from User",User.class);
		List<User> list=q.getResultList();
		
		ses.close();
		System.out.println("Users data retrieved "+list.size());
		
		list.stream().forEach(obj->System.out.println(obj.getCustname()));
		
	}

}
