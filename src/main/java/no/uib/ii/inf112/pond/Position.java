package no.uib.ii.inf112.pond;

import no.uib.ii.inf112.pond.impl.PositionImpl;

public interface Position {

	static Position create(double x, double y) {
		return new PositionImpl(x, y);
	}
	public double getX();

	public Position setX(double x);

	public double getY();

	public Position setY(double y);

	public Position move(double dx, double dy);
}