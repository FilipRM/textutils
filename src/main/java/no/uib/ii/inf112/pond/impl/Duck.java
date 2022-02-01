package no.uib.ii.inf112.pond.impl;

import no.uib.ii.inf112.pond.Pond;
import no.uib.ii.inf112.pond.PondObject;
import no.uib.ii.inf112.pond.Position;

/**
 * A duck class – recipe for making duck objects.
 * 
 * Describes the common aspects of and behaviour of duck objects (in methods)
 * and the individual differences between ducks (in field variables).
 */
public class Duck implements PondObject {
	protected int stepCount = 0;
	protected double size;
	protected Position pos;

	public void step(Pond pond) {
		pos.move(-1, 0);
		if (stepCount++ > 10) {
			stepCount = 0;
			pond.add(new Duckling(pos.move(-1, 0), size / 5));
		}
	}

	public Duck(Position pos, double size) {
		this.pos = pos;
		this.size = size;
	}

	/**
	 * @return The duck's size;
	 */
	public double getSize() {
		return size;
	}

	/**
	 * @return Current X position
	 */
	public double getX() {
		return pos.getX();
	}

	/**
	 * @return Current Y position
	 */
	public double getY() {
		return pos.getY();
	}

	@Override
	public void moveTo(double x, double y) {
		pos.setX(x);
		pos.setX(y);
	}

}
