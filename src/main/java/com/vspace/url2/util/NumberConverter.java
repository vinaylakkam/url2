package com.vspace.url2.util;

public class NumberConverter {
	
	static String baseDigits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	
	public static String fromDecimalToOtherBase(Integer base, Integer decimalnumber) {
		String tempValue = decimalnumber == 0 ? "0" : "";

		Integer mod = 0;
		while (decimalnumber != 0) {
			mod = decimalnumber % base;
			tempValue = baseDigits.substring(mod, mod + 1) + tempValue;
			decimalnumber = decimalnumber / base;
		}

		return tempValue;
	}

	public static Integer fromOtherBaseToDecimal(Integer base, String number) {
		Integer iterator = number.length();
		Integer returnValue = 0;

		Integer multiplier = 1;

		while (iterator > 0) {
			returnValue = returnValue
					+ (baseDigits.indexOf(number.substring(iterator - 1,
							iterator)) * multiplier);
			multiplier = multiplier * base;
			--iterator;
		}

		return returnValue;
	}

	public static Integer fromBase62(String number) {
		return fromOtherBaseToDecimal(62, number);
	}

	public static String toBase62(Integer decimalnumber) {
		return fromDecimalToOtherBase(62, decimalnumber);
	}

	public static void main(String[] args) {

		Integer number = 998989;
		System.out.println(number);

		String base62 = NumberConverter.toBase62(number);
		System.out.println(base62);

		number = NumberConverter.fromBase62(base62);
		System.out.println(number);

	}
}
