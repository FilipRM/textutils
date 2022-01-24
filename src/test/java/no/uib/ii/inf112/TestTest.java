package no.uib.ii.inf112;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestTest {
	TextAligner aligner = new TextAligner() {

		public String center(String text, int width) {
			int extra = (width - text.length()) / 2;
			return " ".repeat(extra) + text + " ".repeat(extra);
		}

		public String flushRight(String text, int width) {
			// TODO Auto-generated method stub
			return null;
		}

		public String flushLeft(String text, int width) {
			// TODO Auto-generated method stub
			return null;
		}

		public String justify(String text, int width) {
			// TODO Auto-generated method stub
			return null;
		}};
		
	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	void testCenter() {
		assertEquals("  A  ", aligner.center("A", 5));
		assertEquals(" foo ", aligner.center("foo", 5));

	}
}
