package com.sharayu.classes;

public class Player {
	private String playerName;
	private int age;
	private String country;
	private String club;
	private String position;
	
	public Player()
	{
		System.out.println("welcome to premier league");
	}
	
	public Player(String playerName, int age, String country, String club, String position) {
		super();
		this.playerName = playerName;
		this.age = age;
		this.country = country;
		this.club = club;
		this.position = position;
	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", age=" + age + ", country=" + country + ", club=" + club
				+ ", position=" + position + "]";
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPlayerName() {
		return playerName;
	}

	public int getAge() {
		return age;
	}

	public String getCountry() {
		return country;
	}

	public String getClub() {
		return club;
	}

	public String getPosition() {
		return position;
	}
	
	

}
