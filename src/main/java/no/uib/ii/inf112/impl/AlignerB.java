package no.uib.ii.inf112.impl;

import no.uib.ii.inf112.TextAligner;

/**
 * Just returns the string unmodified
 * 
 * @author anya
 *
 */
public class AlignerB implements TextAligner {

	@Override
	public String center(String text, int width) {
		return text;
	}

	@Override
	public String flushRight(String text, int width) {
		return text;
	}

	@Override
	public String flushLeft(String text, int width) {
		return text;
	}

	@Override
	public String justify(String text, int width) {
		return text;
	}

	public String toString() {
		return "AlignerB – is there an echo here? …echo here?";
	}

}
