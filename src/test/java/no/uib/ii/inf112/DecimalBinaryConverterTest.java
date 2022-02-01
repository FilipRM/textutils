/**
 * 
 */
package no.uib.ii.inf112;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.uib.ii.inf112.impl.Converter;

/**
 * @author anya
 *
 */
class DecimalBinaryConverterTest {

	private static DecimalToBinaryConverter converter;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUpBeforeTest() throws Exception {
		converter = new Converter();
	}

	/**
	 * Test method for
	 * {@link no.uib.ii.inf112.impl.Converter#decimalToBinary(java.lang.String)}.
	 */
	@Test
	void testDecimalToBinary() {
		assertEquals("101", converter.decimalToBinary("5"));
		assertEquals("1000", converter.decimalToBinary("8"));
	}

	/**
	 * Test method for
	 * {@link no.uib.ii.inf112.impl.Converter#binaryToDecimal(java.lang.String)}.
	 */
	@Test
	void testBinaryToDecimal() {
		// TEST MED EKSEMPEL
		assertEquals("0", converter.binaryToDecimal("0"));
		assertEquals("1", converter.binaryToDecimal("1"));
		assertEquals("2", converter.binaryToDecimal("10"));
		assertEquals("3", converter.binaryToDecimal("11"));
		// 42 = 4*10 + 2*1
		// 101010 = 32*1 + 8*1 + 2*+1 = 42
		// 0b100 = 1*4 + 0*2 + 0*1
		assertEquals("4", converter.binaryToDecimal("100"));
		assertEquals("5", converter.binaryToDecimal("101"));
		assertEquals("6", converter.binaryToDecimal("110"));
		assertEquals("7", converter.binaryToDecimal("111"));
		assertEquals("8", converter.binaryToDecimal("1000"));

		// TEST MED ORAKEL
		String bin = "101";
		assertEquals(String.valueOf(Integer.valueOf(bin, 2)), converter.binaryToDecimal(bin));

		// TEST MED EGENSKAPER
		assertEquals(bin, converter.decimalToBinary(converter.binaryToDecimal(bin)));
	}

}
