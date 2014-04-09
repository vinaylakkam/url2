package com.vspace.url2.service;

import org.springframework.stereotype.Component;

import com.vspace.url2.util.NumberConverter;

@Component
public class ShortenerService {

	public String shortIt(int number) {
		return NumberConverter.toBase62(number);
	}
}
