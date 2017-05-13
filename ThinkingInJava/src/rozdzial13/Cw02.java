package rozdzial13;

//: strings/Cw02.java

import java.util.*;
public class Cw02 {
	public String toString() {
		return " Cw02 address: " + super.toString() + "\n";
	}
	public static void main(String[] args) {
		List<Cw02> v = new ArrayList<Cw02>();
		for(int i = 0; i < 10; i++)
			v.add(new Cw02());
		System.out.println(v);
	}
}
