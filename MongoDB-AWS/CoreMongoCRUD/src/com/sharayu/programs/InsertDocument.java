package com.sharayu.programs;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class InsertDocument {
	public static void main(String[] args) {
		//Connect to MongoDB AWS cloud server
		MongoClient client=MongoClients.create("mongodb+srv://praffull:mongodb913@sharayucluster.6q3taq4.mongodb.net/?retryWrites=true&w=majority&appName=sharayucluster");
		
		//select the database
		MongoDatabase db=client.getDatabase("spiderdb");
		
		//db.createCollection("films"); on the shell
		//Select the collection
		MongoCollection<Document> coll=db.getCollection("films");
		
		//Insert a document in films collection
		Document doc=new Document("_id",101)
				.append("filmnm", "the matrix")
				.append("releaseyr", 1999)
				.append("genre", "action")
				.append("actor", "keanu reeves")
				.append("imdbrating", 8.7);
		
		coll.insertOne(doc);
		System.out.println("New film added to MongoDB");
		
		
		
		
	}

}
