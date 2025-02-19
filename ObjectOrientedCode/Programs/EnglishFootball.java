package com.praffull.programs;

import com.sharayu.classes.Player;

public class EnglishFootball {
	public static void main(String[] args) {
		Player p1=new Player("mohammed salah",28,"egypt","liverpool","forward");
		System.out.println(p1);
		
		Player p2=new Player();
		p2.setPlayerName("bukayo saka");
		p2.setAge(23);
		p2.setCountry("england");
		p2.setClub("arsenal");
		p2.setPosition("mid-fielder");
		//System.out.println(p2);
		System.out.println("Name : "+p2.getPlayerName());
		System.out.println("Club : "+p2.getClub());
		
	}

}
