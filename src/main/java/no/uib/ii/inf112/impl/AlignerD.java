package no.uib.ii.inf112.impl;

import no.uib.ii.inf112.TextAligner;

/**
 * Makes strings that are correctly aligned, but do not contain the original
 * string.
 * 
 * @author anya
 *
 */
public class AlignerD implements TextAligner {

	@Override
	public String center(String text, int width) {
		int w = width / 2;
		if (width % 2 == 0)
			return " ".repeat(w - 1) + "XX" + " ".repeat(w - 1);
		else
			return " ".repeat(w) + "X" + " ".repeat(w);
	}

	@Override
	public String flushRight(String text, int width) {
		return " ".repeat(width - 1) + "X";
	}

	@Override
	public String flushLeft(String text, int width) {
		return "X" + " ".repeat(width - 1);
	}

	@Override
	public String justify(String text, int width) {
		return "X" + " ".repeat(width - 2) + "X";
	}

	public String toString() {
		return "AlignerD –              X             !";
	}

}
