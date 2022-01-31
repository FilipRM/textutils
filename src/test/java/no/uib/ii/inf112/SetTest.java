package no.uib.ii.inf112;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.uib.ii.inf112.impl.Converter;
import no.uib.ii.inf112.impl.MySetImpl;

class SetTest {
	Set<String> testSet ;

	// Coverage analysis: EclEmma
	@BeforeEach
	void setUpSet() throws Exception {
		testSet = new MySetImpl<String>();
	}


	@Test
	void addContainsTest() {
		addContainsProperty(testSet, "mango");
		addContainsProperty(testSet, "banan");
		addContainsProperty(testSet, "eple");
		addContainsProperty(testSet, "papaya");
		addContainsProperty(testSet, null);
	}


	// Sant for alle typer samlinger
	<T> void addContainsProperty(Set<T> set, T elem) {
		set.add(elem);
		// a.equals(a) == true
		// a.equals(b) <=> b.equals(a)
		// a.equals(b) && b.equals(c) => a.equals(c) // ikke sant for float, double
		// a.equals(b) => a.hashCode() == b.hashCode()
		
		assertTrue(set.contains(elem), "Should contain element after adding it");
	}

	// gjelder bare for samlinger med unike elementer
	<T> void addSizeProperty(Set<T> set, T elem) {
		int size = set.size();
		if(set.contains(elem)) {
			set.add(elem);
			assertEquals(size, set.size());
		} else {
			set.add(elem);
			assertEquals(size+1, set.size());			
		}
	}
	
	// add – contains
	// add – size
	// remove – contains
	// remove – size
	// add – iterator()
	// remove iterator()
	// new Set() – size
	// new Set() – contains
	
	<T> void sizeNotNegativeProperty(Set<T> set) {
		assertTrue(set.size() >= 0);
	}

	
	/**
	 * Iterator har tre(?) egenskaper:
	 * 
	 *   * at lagt til element blir med i iterasjon / omvendt
	 *   * alle de andre elementene er fremdeles med i iterasjonen
	 */
	<T> void addIteratorProperty(Set<T> set, T elem) {
		set.add(elem);
		boolean found = false;
		for(T e : set) {
			if(Objects.equals(e, elem)) {
				found = true;
			}
		}
		assertTrue(found, "Expecting to find added element when iterating");
	}
	
	<T> void removeContainsProperty(Set<T> set, T elem) {
		set.remove(elem);
		assertFalse(set.contains(elem), "Should contain element after adding it");
	}

	<T> void removeDoesNotThrowProperty(Set<T> set, T elem) {
		if(!set.contains(elem))
			assertDoesNotThrow(() -> set.remove(elem));
	}
	// gjelder bare for samlinger med unike elementer
	<T> void removeSizeProperty(Set<T> set, T elem) {
		int size = set.size();
		if(set.contains(elem)) {
			set.remove(elem);
			assertEquals(size-1, set.size());
		} else {
			set.remove(elem);
			assertEquals(size, set.size());			
		}
	}
	
	@Test
	void addSizeTest() {
		addSizeProperty(testSet, "mango");
		testSet.add("banan");
		addSizeProperty(testSet, "banan");
	}
	@Test
	void removeSizeTest() {
		removeSizeProperty(testSet, "mango");
		testSet.add("banan");
		removeSizeProperty(testSet, "banan");
	}
	
	@Test
	void addRemoveTest() {
		testSet.add("mango");
		testSet.remove("mango");
		
		assertFalse(testSet.contains("mango"));
	}
	
	@Test
	void add2RemoveTest() {
		testSet.add("mango");
		testSet.add("mango");
		testSet.remove("mango");
		
		assertFalse(testSet.contains("mango"));
	}
	
	@Test
	void add2SizeTest() {
		assertEquals(0, testSet.size());
		testSet.add("mango");
		testSet.add("mango");

		assertEquals(1, testSet.size());
	}

	@Test
	void sillyTest() {
		assertTrue(true);
	}
	@Test
	void addTest() {
		testSet.add("mango");
		List<String> expected = List.of("mango");
		
		// TODO: gjør dette uten å kikke på feltvariabler
		assertEquals(expected, ((MySetImpl<String>)testSet).data);
	}
	

}
