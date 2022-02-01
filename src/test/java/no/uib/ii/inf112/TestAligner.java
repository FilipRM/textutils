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

	}

	@Test
	void testFlushRight() {

	}

	@Test
	void testFlushLeft() {

	}

	@Test
	void testJustify() {

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