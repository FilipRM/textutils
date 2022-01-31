package no.uib.ii.inf112.pond;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import no.uib.ii.inf112.pond.impl.Duck;

public class Pond {
	private double x, y;
	private double width, height;

	public Pond(int w, int h) {
		this.width = w;
		this.height = h;
		objs.add(new Duck(Position.create(0, 0), 25));
	}

	public List<PondObject> objs = new ArrayList<>();

	public static Random random = new Random();

	public void add(PondObject obj) {
		objs.add(obj);
	}

	public void step() {

		for (PondObject o : new ArrayList<>(objs)) {
			o.step(this);
		}
	}

	public static void main(String[] args) {
		Pond pond = new Pond(1280, 720);
		String[] chars = new String[128];

		for (int step = 0; step < 30; step++) {
			pond.step();
			for (int i = 0; i < 128; i++)
				chars[i] = " ";

			int k = 0;
			for (PondObject o : pond.objs) {
				int x = 90 - (int) ((o.getX() / 2) % 80);
				x = Math.max(0, Math.min(128, x + k++));
				if (o.getSize() > 10)
					chars[x] = "🦆";
				else
					chars[x] = "🐤";
			}
			System.out.println(String.join("", chars));
		}
	}
}
