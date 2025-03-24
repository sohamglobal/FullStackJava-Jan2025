package com.praffull.programs;

import java.util.ArrayList;
import java.util.Collections;

import com.sharayu.classes.User;
import com.sharayu.classes.UserIdComparator;

public class UsersArrayList {
	public static void main(String[] args) {
		ArrayList<User> list=new ArrayList<User>();
		
		User u1=new User();
		u1.setUserId("praffull");
		u1.setPassword("chelsea");
		u1.setUserName("praffull global");
		u1.setUserType("admin");
		
		User u2=new User();
		u2.setUserId("sharayu");
		u2.setPassword("spider");
		u2.setUserName("sharayu global");
		u2.setUserType("customer");
		
		User u3=new User();
		u3.setUserId("adam");
		u3.setPassword("australia");
		u3.setUserName("adam gilchrist");
		u3.setUserType("customer");
		
		list.add(u1);
		list.add(u2);
		list.add(u3);
		
		System.out.println(list);
		
		Collections.sort(list,new UserIdComparator());
		System.out.println(list);
		
	}

}
