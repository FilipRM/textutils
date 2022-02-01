package no.uib.ii.inf112.impl;

import java.util.stream.Stream;

import no.uib.ii.inf112.TextAligner;

public class AlignerH implements TextAligner {

	@Override
	public String center(String text, int width) {
		text = text.strip();
		int toAdd = Math.max(0, width - text.length());
		int w_right = toAdd / 2;
		int w_left = w_right + toAdd % 2;
		return " ".repeat(w_left) + text + " ".repeat(w_right);
	}

	@Override
	public String flushRight(String text, int width) {
		text = text.strip();
		int w = Math.max(0, width - text.length());
		return " ".repeat(w) + text;
	}

	@Override
	public String flushLeft(String text, int width) {
		text = text.strip();
		int w = Math.max(0, width - text.length());
		return text + " ".repeat(w);
	}

	@Override
	public String justify(String text, int width) {
		String[] words = text.strip().split(" +");
		int nSpaces = words.length - 1;
		if (nSpaces <= 1)
			return flushLeft(text, width);
		int textLength = Stream.of(words).mapToInt(s -> s.length()).sum();
		int w = Math.max(0, width - textLength);
		int between = w / nSpaces;
		int extra = w % nSpaces;
		String s = "";
		String space = " ".repeat(between);
		for (String word : words) {
			if (!s.isEmpty()) {
				s = s + space;
				if (extra > 0) { // TODO: do this evenly
					s = s + " ";
					extra--;
				}
			}
			s = s + word;
		}

		return s;
	}

	public String toString() {
		return "AlignerH – even moar better?";
	}
}
