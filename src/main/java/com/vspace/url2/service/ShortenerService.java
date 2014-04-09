package com.vspace.url2.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vspace.url2.dao.LinkDao;
import com.vspace.url2.domain.Link;
import com.vspace.url2.util.NumberConverter;

@Component
public class ShortenerService {

	@Autowired
	LinkDao linkDao;

	public String shortIt(Integer number) {
		return NumberConverter.toBase62(number);
	}

	public String saveLink(String url1) {

		String url2 = shortIt(new Random().nextInt());

		Link link = new Link(url1, url2);
		
		Boolean success = linkDao.save(link);
		if (success) {
			return url2;
		}

		return null;
	}
}
