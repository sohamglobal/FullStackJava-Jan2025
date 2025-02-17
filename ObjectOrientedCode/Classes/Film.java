package com.sharayu.classes;

public class Film {
	private String filmname;
	private int relyear;
	private String genre;
	private String language;
	private double imdbrating;
	
	public Film(String filmname, int relyear, String genre, String language, double imdbrating) {
		super();
		this.filmname = filmname;
		this.relyear = relyear;
		this.genre = genre;
		this.language = language;
		this.imdbrating = imdbrating;
	}

	public void setFilmname(String filmname) {
		this.filmname = filmname;
	}

	public String getFilmname() {
		return filmname;
	}
	
	
	

}
