package no.uib.ii.inf112;

import java.util.Collection;

public interface Set<T> extends Iterable<T> {

	boolean contains(T obj); // observere
	
	void add(T obj); // endring
	
	
	/**
	 * @param obj
	 * @throws IllegalArgumentException if not this.contains(obj)
	 */
	void remove(T obj); // endring
	
	/**
	 * @return Size of set >= 0
	 */
	int size(); // observere
	
	String toString();
	
	boolean equals(Object other);
	
	int hashCode();
}
