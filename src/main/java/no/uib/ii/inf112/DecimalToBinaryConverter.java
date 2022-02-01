package no.uib.ii.inf112;

public interface DecimalToBinaryConverter {

	/**
	 * 5 -> 0b101
	 * 
	 * @param decimalNumber
	 * @return the number as a binary string
	 */
	String decimalToBinary(String decimalNumber);
	
	/**
	 * 0b101 -> 5
	 * 
	 * @param binaryNumber
	 * @return the number as a decimal string
	 */
	String binaryToDecimal(String binaryNumber);
	
}
