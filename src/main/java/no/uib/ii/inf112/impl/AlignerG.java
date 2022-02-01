package no.uib.ii.inf112.impl;

import java.util.stream.Stream;

import no.uib.ii.inf112.TextAligner;

public class AlignerG implements TextAligner {
	@Override
	public String center(String text, int width) {
		int toAdd = Math.max(0, width - text.length());
		int w_right = toAdd / 2;
		int w_left = w_right + toAdd % 2;
		return " ".repeat(w_left) + text + " ".repeat(w_right);
	}

	@Override
	public String flushRight(String text, int width) {
		int w = Math.max(0, width - text.length());
		return " ".repeat(w) + text;
	}

	@Override
	public String flushLeft(String text, int width) {
		int w = Math.max(0, width - text.length());
		return text + " ".repeat(w);
	}

	@Override
	public String justify(String text, int width) {
		String[] words = text.split(" +");
		int textLength = Stream.of(words).mapToInt(s -> s.length()).sum();
		int w = Math.max(0, width - text.length());
		int between = (width - textLength) / words.length;
		int extra = (width - textLength) % words.length;
		// TODO: also distributes leftover space ("extra")
		String space = " ".repeat(between);

		return String.join(space, words);
	}

	public String toString() {
		return "AlignerG – even better?";
	}
}
