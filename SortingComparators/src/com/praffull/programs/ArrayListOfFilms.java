package com.praffull.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.sharayu.classes.*;

public class ArrayListOfFilms {
	public static void main(String[] args) {
		List<Film> filmlist=new ArrayList<Film>();
		
		Film film1 = new Film("Sholay", 1975, "Hindi", "Action", 9.2);
        Film film2 = new Film("Inception", 2010, "English", "Sci-Fi", 8.8);
        Film film3 = new Film("3 Idiots", 2009, "Hindi", "Comedy-Drama", 8.4);
        Film film4 = new Film("Titanic", 1997, "English", "Romance", 7.8);
        Film film5 = new Film("Dangal", 2016, "Hindi", "Biographical", 8.5);

        filmlist.add(film1);
        filmlist.add(film2);
        filmlist.add(film3);
        filmlist.add(film4);
        filmlist.add(film5);
        
        System.out.println(filmlist);
        
        Collections.sort(filmlist, new YearComparator());
        System.out.println(filmlist);
        
        Collections.sort(filmlist,new NameComparator());
        System.out.println(filmlist);
        
        Collections.sort(filmlist,new RatingComparator());
        System.out.println(filmlist);
	}

}
