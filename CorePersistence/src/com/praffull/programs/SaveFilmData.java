package com.praffull.programs;

import com.sharayu.classes.Film;
import java.util.*;
import java.io.*;

public class SaveFilmData {
	public static void main(String[] args) throws Exception {
		Film f;
		Scanner sc=new Scanner(System.in);
		String nm,ln,gn;
		int yr;
		double rt;
		
		System.out.print("Enter film name : ");
		nm=sc.nextLine();
		System.out.print("Enter year : ");
		yr=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter language : ");
		ln=sc.nextLine();
		System.out.print("Enter genre : ");
		gn=sc.nextLine();
		System.out.print("Enter rating : ");
		rt=sc.nextDouble();
		
		f=new Film(nm,yr,ln,gn,rt);
		
		ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(nm));
		o.writeObject(f);
		o.close();
		System.out.println("Film stored permanently...");
		
	}

}
