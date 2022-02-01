package no.uib.ii.inf112.impl;

import no.uib.ii.inf112.DecimalToBinaryConverter;

public class Converter implements DecimalToBinaryConverter {

	@Override
	public String decimalToBinary(String decimalNumber) {
		int number = 0;
		int digit = 1;
		for (int i = decimalNumber.length() - 1; i >= 0; i--) {
			int c = decimalNumber.charAt(i);
			c = c - '0';
			number += c * digit;
			digit *= 10;
		}
		String s = "";
		while (number > 0) {
			// add the rightmost bit to the string
			s = String.valueOf(number & 1) + s;
			// shift one step right
			number >>= 1;
		}
		return s;
	}

	@Override
	public String binaryToDecimal(String binaryNumber) {
		// 0101
		// 8421
		int number = 0;
		int digit = 1;
		for (int i = binaryNumber.length() - 1; i >= 0; i--) {
			int c = binaryNumber.charAt(i);
			c = c - '0';
			number += c * digit;
			digit *= 2; // samme som number <<= 1;
		}
		return String.valueOf(number);
	}

}
