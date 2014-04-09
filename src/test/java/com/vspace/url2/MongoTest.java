package com.vspace.url2;

import java.net.UnknownHostException;
import java.util.Set;

import org.junit.Test;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class MongoTest {

	@Test
	public void test() throws UnknownHostException {

		MongoClient mongoClient = new MongoClient("localhost", 27017);
		DB db = mongoClient.getDB("mydb");
		Set<String> colls = db.getCollectionNames();

		for (String s : colls) {
			System.out.println(s);
		}
	}

}
