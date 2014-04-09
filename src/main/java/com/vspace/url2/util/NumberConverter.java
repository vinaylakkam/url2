package com.vspace.url2.util;

public class NumberConverter {
	
	static String baseDigits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	
	private static String fromDecimalToOtherBase(int base, int decimalnumber) {
		String tempValue = decimalnumber == 0 ? "0" : "";

		int mod = 0;
		while (decimalnumber != 0) {
			mod = decimalnumber % base;
			tempValue = baseDigits.substring(mod, mod + 1) + tempValue;
			decimalnumber = decimalnumber / base;
		}

		return tempValue;
	}

	private static int fromOtherBaseToDecimal(int base, String number) {
		int iterator = number.length();
		int returnValue = 0;

		int multiplier = 1;

		while (iterator > 0) {
			returnValue = returnValue
					+ (baseDigits.indexOf(number.substring(iterator - 1,
							iterator)) * multiplier);
			multiplier = multiplier * base;
			--iterator;
		}

		return returnValue;
	}

	public static int fromBase62(String number) {
		return fromOtherBaseToDecimal(62, number);
	}

	public static String toBase62(int decimalnumber) {
		return fromDecimalToOtherBase(62, decimalnumber);
	}

	public static void main(String[] args) {

		int number = 998989;
		System.out.println(number);

		String base62 = NumberConverter.toBase62(number);
		System.out.println(base62);

		number = NumberConverter.fromBase62(base62);
		System.out.println(number);

	}
}
