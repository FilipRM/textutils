package no.uib.ii.inf112;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestTest {
	TextAligner aligner = new TextAligner() {

		public String center(String text, int width) {
			if(text.length() > width) {
				return text;
			}
			int extra = (width - text.length()) / 2;
			return " ".repeat(extra) + text + " ".repeat(extra);
		}

		//s
		public String flushRight(String text, int width) {
			if(text.length() > width) {
				return text;
			}
			int extra = (width-text.length());
			return text + " ".repeat(extra);
		}

		public String flushLeft(String text, int width) {
			if (text.length() > width) {
				return text;
			}
			int extra = (width - text.length());
			return " ".repeat(extra) + text;

		}

		public String justify(String text, int width) {
			int extra = width - text.length();
			int spaces = 0;
			for (int i = 0; i < text.length(); i++) {
				if (text.charAt(i) == ' ') {
					spaces += 1;
				}
			}
			return text.replace(" ", " ".repeat(extra / spaces + 1));
		}};


	@Test
	void testCenter() {
		assertEquals("  A  ", aligner.center("A", 5));
		assertEquals(" foo ", aligner.center("foo", 5));

		assertEquals("A    ", aligner.flushRight("A", 5));
		assertEquals("foo  ", aligner.flushRight("foo", 5));
		assertEquals("Hei eg heiter Eirik", aligner.flushRight("Hei eg heiter Eirik", 2));

		assertEquals("    A", aligner.flushLeft("A", 5));
		assertEquals("  foo", aligner.flushLeft("foo", 5));
		assertEquals("Hei eg heiter Eirik", aligner.flushLeft("Hei eg heiter Eirik", 2));

		assertEquals("fee   fie   foo", aligner.justify("fee fie foo", 15));

	}
}
