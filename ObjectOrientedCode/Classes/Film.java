package com.sharayu.classes;

public class Film {
	private String filmname;
	private int relyear;
	private String genre;
	private String language;
	private double imdbrating;
	
	
	//to assign values to all the data members at once use param constructor
	public Film(String filmname, int relyear, String genre, String language, double imdbrating) {
		
		this.filmname = filmname;
		this.relyear = relyear;
		this.genre = genre;
		this.language = language;
		this.imdbrating = imdbrating;
	}

	//to assign values to individual data member use setter
	public void setFilmname(String filmname) {
		this.filmname = filmname;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	//to retrieve data from individual data members use getters
	public String getFilmname() {
		return filmname;
	}

	public String getGenre() {
		return genre;
	}
	
	//to retrieve values of all data members at once

	@Override
	public String toString() {
		return "Film [filmname=" + filmname + ", relyear=" + relyear + ", genre=" + genre + ", language=" + language
				+ ", imdbrating=" + imdbrating + "]";
	}
	
	
	
	
	

}
