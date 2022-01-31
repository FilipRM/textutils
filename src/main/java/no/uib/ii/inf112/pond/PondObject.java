package no.uib.ii.inf112.pond;

public interface PondObject {
	/**
	 * Do one time step of actions for the object
	 * 
	 * @param pond
	 */
	void step(Pond pond);

	double getX();

	double getY();

	double getSize();

	void moveTo(double x, double y);

}
