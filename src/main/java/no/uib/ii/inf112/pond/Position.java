package no.uib.ii.inf112.pond;

public class Position {
	private double x;
	private double y;

	public Position(double x, double y) {
		this.setX(x);
		this.setY(y);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public void move(double dx, double dy) {
		x = x + dx;
		y = y + dy;
	}
}