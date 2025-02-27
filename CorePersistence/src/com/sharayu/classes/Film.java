package com.sharayu.classes;

import java.io.Serializable;

public class Film implements Serializable {
	private String filmname;
	private int relyear;
	private String language;
	private String genre;
	private double imdbrating;
	
	public Film(String filmname, int relyear, String language, String genre, double imdbrating) {
		super();
		this.filmname = filmname;
		this.relyear = relyear;
		this.language = language;
		this.genre = genre;
		this.imdbrating = imdbrating;
	}

	@Override
	public String toString() {
		return "Film [filmname=" + filmname + ", relyear=" + relyear + ", language=" + language + ", genre=" + genre
				+ ", imdbrating=" + imdbrating + "]";
	}
	
	
	

}
