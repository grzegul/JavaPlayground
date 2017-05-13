package rozdzial13;

import java.io.*;
import java.util.*;
public class Cw03 {
	private String name;
	private Formatter f;
	public Cw03(String name, Formatter f) {
		this.name = name;
		this.f = f;
	}
	public void move(int x, int y) {
		f.format("%s The Cw03 is at (%d,%d)\n", name, x, y);
	}
	public static void main(String[] args) {
		PrintStream outAlias = System.out;
		Cw03 tommy = new Cw03("Tommy", new Formatter(System.err));
		Cw03 terry = new Cw03("Terry", new Formatter(outAlias));
		tommy.move(0,0);
		terry.move(4,8);
		tommy.move(3,4);
		terry.move(2,5);
		tommy.move(3,3);
		terry.move(3,3);
	}
}
