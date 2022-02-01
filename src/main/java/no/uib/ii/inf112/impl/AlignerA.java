package no.uib.ii.inf112.impl;

import no.uib.ii.inf112.TextAligner;

/**
 * Just returns null for every thing.
 * 
 * @author anya
 *
 */
public class AlignerA implements TextAligner {

	@Override
	public String center(String text, int width) {
		return null;
	}

	@Override
	public String flushRight(String text, int width) {
		return null;
	}

	@Override
	public String flushLeft(String text, int width) {
		return null;
	}

	@Override
	public String justify(String text, int width) {
		return null;
	}
	
	public String toString() {
		return "AlignerA – I'm a bit of a nihilist!";
	}

}
