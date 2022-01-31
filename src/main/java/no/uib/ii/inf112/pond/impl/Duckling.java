package no.uib.ii.inf112.pond.impl;

import no.uib.ii.inf112.pond.Position;

public class Duckling extends Duck {
	public Duckling(Position pos, double size) {
		super(pos, size);
	}

	
	public void step() {
		pos.move(2, 0);
	}
}
