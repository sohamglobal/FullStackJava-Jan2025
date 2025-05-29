package com.sharayu.programs;

import java.util.Scanner;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class InputDocumentInsert {
	public static void main(String[] args) {
		//Connect to MongoDB AWS cloud server
		MongoClient client=MongoClients.create("mongodb+srv://praffull:mongodb913@sharayucluster.6q3taq4.mongodb.net/?retryWrites=true&w=majority&appName=sharayucluster");
		
		//select the database
		MongoDatabase db=client.getDatabase("spiderdb");
		
		//db.createCollection("films"); on the shell
		//Select the collection
		MongoCollection<Document> coll=db.getCollection("films");
		
		int fid,ryr;
		String fnm,gen,act;
		double rat;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter filmID : ");
		fid=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter film name : ");
		fnm=sc.nextLine();
		System.out.print("Enter release year : ");
		ryr=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter genre : ");
		gen=sc.nextLine();
		System.out.print("Enter actor : ");
		act=sc.nextLine();
		System.out.print("Enter imdb rating : ");
		rat=sc.nextDouble();
		
		
		//Insert a document in films collection
		Document doc=new Document("_id",fid)
				.append("filmnm", fnm)
				.append("releaseyr", ryr)
				.append("genre", gen)
				.append("actor", act)
				.append("imdbrating", rat);
		
		coll.insertOne(doc);
		System.out.println("New film added to MongoDB");
		
		
		
		
	}

}
