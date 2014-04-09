package com.vspace.url2.domain;

public class Link {

	String url1;

	String url2;

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
		return "Link [url1=" + url1 + ", url2=" + url2 + "]";
	}
}
