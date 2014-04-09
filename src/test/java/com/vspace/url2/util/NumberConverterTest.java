package com.vspace.url2.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberConverterTest {
	
	int NUMBER = 999999999;

	@Test
	public void testFromBase62() {
		String base62 = NumberConverter.toBase62(NUMBER);
		int number = NumberConverter.fromBase62(base62);
		
		System.out.println(number  + "-->" + base62);
		assertEquals(NUMBER, number);
	}

	//@Test
	public void testToBase62() {
		NumberConverter.toBase62(NUMBER);
	}

}
