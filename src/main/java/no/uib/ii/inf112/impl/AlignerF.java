package no.uib.ii.inf112.impl;

import no.uib.ii.inf112.TextAligner;
import java.util.stream.Stream;

/**
 * Naïve implementation
 * 
 * @author anya
 *
 */
public class AlignerF implements TextAligner {

	@Override
	public String center(String text, int width) {
		int w_right = (width - text.length()) / 2;
		int w_left = w_right + (width - text.length()) % 2;
		return " ".repeat(w_left) + text + " ".repeat(w_right);
	}

	@Override
	public String flushRight(String text, int width) {
		int w = width - text.length();
		return " ".repeat(w) + text;
	}

	@Override
	public String flushLeft(String text, int width) {
		int w = width - text.length();
		return text + " ".repeat(w);
	}

	@Override
	public String justify(String text, int width) {
		String[] words = text.split(" +");
		int textLength = Stream.of(words).mapToInt(s -> s.length()).sum();
		int w = (width - textLength) / words.length;
		String space = " ".repeat(w);

		return String.join(space, words);
	}

	public String toString() {
		return "AlignerF – this is good enough, isn't it?";
	}

}
