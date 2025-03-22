package com.sharayu.classes;

import java.util.Comparator;

public class RatingComparator implements Comparator<Film> {

	@Override
	public int compare(Film o1, Film o2) {
		// TODO Auto-generated method stub
		//return o1.getRating()-o2.getRating();
		return Double.compare(o1.getRating(), o2.getRating());
	}

}
