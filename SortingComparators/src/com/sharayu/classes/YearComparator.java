package com.sharayu.classes;

import java.util.Comparator;

public class YearComparator implements Comparator<Film> {

	@Override
	public int compare(Film o1, Film o2) {
		// TODO Auto-generated method stub
		return o1.getReleaseYear()-o2.getReleaseYear();
	}

}
