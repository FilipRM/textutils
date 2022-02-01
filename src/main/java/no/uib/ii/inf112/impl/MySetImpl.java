package no.uib.ii.inf112.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import no.uib.ii.inf112.Set;

public class MySetImpl<T> implements Set<T> {
	private T member;
	public List<T> data = new ArrayList<>();

	@Override
	public Iterator<T> iterator() {
		return data.iterator();
	}

	@Override
	public boolean contains(T obj) {
		return data.contains(obj);
	}

	@Override
	public void add(T obj) {
		if (!data.contains(obj))
			data.add(obj);
	}

	@Override
	public void remove(T obj) {
		data.remove(obj);
	}

	@Override
	public int size() {
		return data.size();
	}

}
