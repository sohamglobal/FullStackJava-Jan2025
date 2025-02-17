package com.praffull.programs;

import com.sharayu.classes.Film;

public class MyShow {
	public static void main(String[] args) {
		Film f=new Film("pk",2014,"comedy","hindi",8.7);
		System.out.println(f.getFilmname());
		f.setFilmname("sholay");
		System.out.println(f.getFilmname());
	}

}
