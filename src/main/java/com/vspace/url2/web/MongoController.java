package com.vspace.url2.web;

import java.net.UnknownHostException;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mongodb.DB;
import com.mongodb.MongoClient;

@Controller
@RequestMapping("/mongo")
public class MongoController {

	
	@ResponseBody
	@RequestMapping
	public String showCollections() throws UnknownHostException {
		
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		DB db = mongoClient.getDB("test");
		Set<String> colls = db.getCollectionNames();
		
		StringBuffer sb = new StringBuffer();
		for (String s : colls) {
			sb.append(s).append(",");
		}
		
		return sb.toString();
	}
	
}