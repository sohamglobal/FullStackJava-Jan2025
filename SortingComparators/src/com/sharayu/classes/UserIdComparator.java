package com.sharayu.classes;

import java.util.Comparator;

public class UserIdComparator implements Comparator<User> {

	@Override
	public int compare(User o1, User o2) {
		// TODO Auto-generated method stub
		return o1.getUserId().compareTo(o2.getUserId());
	}
	

}
