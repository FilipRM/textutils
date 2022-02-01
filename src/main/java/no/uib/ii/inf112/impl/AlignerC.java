package no.uib.ii.inf112.impl;

import no.uib.ii.inf112.TextAligner;

/**
 * Just returns a string of the right length, but with only spaces.
 * 
 * @author anya
 *
 */
public class AlignerC implements TextAligner {

	@Override
	public String center(String text, int width) {
		return " ".repeat(width);
	}

	@Override
	public String flushRight(String text, int width) {
		return " ".repeat(width);
	}

	@Override
	public String flushLeft(String text, int width) {
		return " ".repeat(width);
	}

	@Override
	public String justify(String text, int width) {
		return " ".repeat(width);
	}

	public String toString() {
		return "AlignerC –                                 ";
	}

}
