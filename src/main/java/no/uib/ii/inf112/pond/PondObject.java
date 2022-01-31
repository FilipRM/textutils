package no.uib.ii.inf112.pond;

public interface PondObject {
	/**
	 * Do one time step of actions for the object
	 * 
	 * @param pond
	 */
	void step(Pond pond);

	/**
	 * @return X position
	 */
	double getX();

	/**
	 * @return Y position
	 */
	double getY();

	/**
	 * @return the size
	 */
	double getSize();

	/**
	 * move it!
	 * 
	 * @param x
	 * @param y
	 */
	void moveTo(double x, double y);

}
