package no.uib.ii.inf112;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.uib.ii.inf112.impl.AlignerA;
import no.uib.ii.inf112.impl.AlignerB;
import no.uib.ii.inf112.impl.AlignerC;
import no.uib.ii.inf112.impl.AlignerD;
import no.uib.ii.inf112.impl.AlignerE;
import no.uib.ii.inf112.impl.AlignerF;
import no.uib.ii.inf112.impl.AlignerG;
import no.uib.ii.inf112.impl.AlignerH;

public abstract class TestAligner {
	TextAligner aligner;

	@Test
	void testCenter() {
		assertEquals("  A  ", aligner.center("A", 5));
		assertEquals(" foo ", aligner.center("foo", 5));
	}

	@Test
	void testFlushRight() {
		assertEquals("    A", aligner.flushRight("A", 5));
		assertEquals("  foo", aligner.flushRight("foo", 5));
		assertEquals("Hei eg heiter Eirik", aligner.flushRight("Hei eg heiter Eirik", 2));
	}

	@Test
	void testFlushLeft() {
		assertEquals("A    ", aligner.flushLeft("A", 5));
		assertEquals("foo  ", aligner.flushLeft("foo", 5));
		assertEquals("Hei eg heiter Eirik", aligner.flushLeft("Hei eg heiter Eirik", 2));
	}

	@Test
	void testJustify() {
		assertEquals("fee   fie   foo", aligner.justify("fee fie foo", 15));
	}
}

class TestAlignerA extends TestAligner {
	@BeforeEach
	void setup() {
		aligner = new AlignerA();
	}
}

class TestAlignerB extends TestAligner {
	@BeforeEach
	void setup() {
		aligner = new AlignerB();
	}
}

class TestAlignerC extends TestAligner {
	@BeforeEach
	void setup() {
		aligner = new AlignerC();
	}
}

class TestAlignerD extends TestAligner {
	@BeforeEach
	void setup() {
		aligner = new AlignerD();
	}
}

class TestAlignerE extends TestAligner {
	@BeforeEach
	void setup() {
		aligner = new AlignerE();
	}
}

class TestAlignerF extends TestAligner {
	@BeforeEach
	void setup() {
		aligner = new AlignerF();
	}
}

class TestAlignerG extends TestAligner {
	@BeforeEach
	void setup() {
		aligner = new AlignerG();
	}
}

class TestAlignerH extends TestAligner {
	@BeforeEach
	void setup() {
		aligner = new AlignerH();
	}
}