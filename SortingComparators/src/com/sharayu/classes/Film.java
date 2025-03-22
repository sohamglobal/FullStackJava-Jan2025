package com.sharayu.classes;

public class Film {
	
	private String filmName;
	private int releaseYear;
	private String language;
	private String genre;
	private double rating;
	
	public Film(String filmName, int releaseYear, String language, String genre, double rating) {
		super();
		this.filmName = filmName;
		this.releaseYear = releaseYear;
		this.language = language;
		this.genre = genre;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Film [filmName=" + filmName + ", releaseYear=" + releaseYear + ", language=" + language + ", genre="
				+ genre + ", rating=" + rating + "]";
	}

	public String getFilmName() {
		return filmName;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public String getLanguage() {
		return language;
	}

	public String getGenre() {
		return genre;
	}

	public double getRating() {
		return rating;
	}
	
	

}
