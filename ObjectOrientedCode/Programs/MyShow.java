package com.praffull.programs;

import com.sharayu.classes.Film;

public class MyShow {
	public static void main(String[] args) {
		Film f=new Film("matrix",1999,"sci-fi","english",8.7);
		//f.filmname="the matrix";
		f.setFilmname("the matrix");
		f.setGenre("action");
		
		System.out.println(f.getFilmname());
		System.out.println(f.getGenre());
		
		System.out.println(f);
		
	}

}
