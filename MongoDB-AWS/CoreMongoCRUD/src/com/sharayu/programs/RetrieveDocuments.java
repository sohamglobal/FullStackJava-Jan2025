package com.sharayu.programs;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class RetrieveDocuments {
	public static void main(String[] args) {
		
		MongoClient client=MongoClients.create("mongodb+srv://praffull:mongodb913@sharayucluster.6q3taq4.mongodb.net/?retryWrites=true&w=majority&appName=sharayucluster");
		MongoDatabase db=client.getDatabase("spiderdb");
		MongoCollection<Document> coll=db.getCollection("films");
		
		FindIterable<Document> docs=coll.find();
		
		for(Document doc:docs)
			System.out.println(doc);
	}

}
