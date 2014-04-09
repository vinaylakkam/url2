package com.vspace.url2.dao;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.vspace.url2.domain.Link;

@Repository
public class LinkDao {

	@Autowired
	MongoTemplate mongoTemplate;

	public Boolean save(Link link) {
		mongoTemplate.insert(link);
		return true;
	}

	public String getLink(String url2) {
		Link link = mongoTemplate.findOne(query(where("url2").is(url2)), Link.class);
		return link.getUrl1();
	}

}
