package com.vspace.url2.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Link {

	@Id
	private String id;

	String url1;

	String url2;

	public Link() {
		super();
	}

	public Link(String url1, String url2) {
		super();
		this.url1 = url1;
		this.url2 = url2;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl1() {
		return url1;
	}

	public void setUrl1(String url1) {
		this.url1 = url1;
	}

	public String getUrl2() {
		return url2;
	}

	public void setUrl2(String url2) {
		this.url2 = url2;
	}

	@Override
	public String toString() {
		return "Link [id=" + id + ", url1=" + url1 + ", url2=" + url2 + "]";
	}

}
