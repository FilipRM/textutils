package no.uib.ii.inf112.pond.impl;

import no.uib.ii.inf112.pond.Position;

public class PositionImpl implements Position {
	private double x;
	private double y;

	public PositionImpl(double x, double y) {
		this.setX(x);
		this.setY(y);
	}

	public double getX() {
		return x;
	}

	public Position setX(double x) {
		this.x = x;
		return this;
	}

	public double getY() {
		return y;
	}

	public Position setY(double y) {
		this.y = y;
		return this;
	}

	public Position move(double dx, double dy) {
		x = x + dx;
		y = y + dy;
		return this;
	}
}