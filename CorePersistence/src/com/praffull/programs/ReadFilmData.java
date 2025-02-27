package com.praffull.programs;

import java.io.*;
import java.util.*;

import com.sharayu.classes.Film;
public class ReadFilmData {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String nm;
		System.out.print("Enter filmname/filename : ");
		nm=sc.nextLine();
		
		try
		{
		ObjectInputStream i=new ObjectInputStream(new FileInputStream(nm));
		Film obj=(Film) i.readObject();
		System.out.println(obj);
		i.close();
		}
		catch(Exception e)
		{
			System.out.println("Film data not found...");
		}
		sc.close();
		
	}

}
