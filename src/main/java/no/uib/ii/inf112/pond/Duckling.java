package no.uib.ii.inf112.pond;


public class Duckling extends Duck {
	public Duckling(Position pos, double size) {
		super(pos, size);
	}

	
	public void step() {
		pos.move(2, 0);
	}
}
