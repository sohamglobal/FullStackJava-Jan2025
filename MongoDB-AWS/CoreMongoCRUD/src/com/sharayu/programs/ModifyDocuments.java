package com.sharayu.programs;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;

public class ModifyDocuments {
	public static void main(String[] args) {
		MongoClient client=MongoClients.create("mongodb+srv://praffull:mongodb913@sharayucluster.6q3taq4.mongodb.net/?retryWrites=true&w=majority&appName=sharayucluster");
		MongoDatabase db=client.getDatabase("spiderdb");
		MongoCollection<Document> coll=db.getCollection("films");
		
		UpdateResult result= coll.updateOne(
				Filters.eq("filmnm","dil se"),
				Updates.set("director", "manirathnam")
				);
		
		System.out.println("documents updated : "+result.getModifiedCount());
		client.close();
	}

}
