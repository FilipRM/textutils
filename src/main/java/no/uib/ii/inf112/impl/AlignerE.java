package no.uib.ii.inf112.impl;

import no.uib.ii.inf112.TextAligner;

/**
 * Correct alignment, but wrong width.
 * 
 * @author anya
 *
 */
public class AlignerE implements TextAligner {

	@Override
	public String center(String text, int width) {
		return " ".repeat(width / 2) + text + " ".repeat(width / 2);
	}

	@Override
	public String flushRight(String text, int width) {
		return " ".repeat(width) + text;
	}

	@Override
	public String flushLeft(String text, int width) {
		return text + " ".repeat(width);
	}

	@Override
	public String justify(String text, int width) {
		String[] words = text.split(" +");
		int w = width / words.length;
		String space = " ".repeat(w);
		
		return String.join(space, words);
	}
	public String toString() {
		return "AlignerE – I'm a out of bounds!";
	}

}
