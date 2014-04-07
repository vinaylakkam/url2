package com.vspace.url2.web;

public class NumberConverter {
	
	final String baseDigits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	String fromDecimalToOtherBase(int base, int decimalnumber) {
		String tempValue = decimalnumber == 0 ? "0" : "";

		int mod = 0;
		while (decimalnumber != 0) {
			mod = decimalnumber % base;
			tempValue = baseDigits.substring(mod, mod + 1) + tempValue;
			decimalnumber = decimalnumber / base;
		}

		return tempValue;
	}

	int fromOtherBaseToDecimal(int base, String number) {
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

	int fromBase62(String number) {
		return fromOtherBaseToDecimal(62, number);
	}

	String toBase62(int decimalnumber) {
		return fromDecimalToOtherBase(62, decimalnumber);
	}

	public static void main(String[] args) {
		NumberConverter obj = new NumberConverter();

		int number = 998989;
		System.out.println(number);

		String base62 = obj.toBase62(number);
		System.out.println(base62);

		number = obj.fromBase62(base62);
		System.out.println(number);

	}
}
