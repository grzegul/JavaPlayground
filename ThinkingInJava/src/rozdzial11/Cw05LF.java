package rozdzial11;

import typeinfo.pets.*;
import java.util.*;

public class Cw05LF {
	public static void main(String[] args) {
		Random rand = new Random(47);
		List<Pet> pets = Pets.arrayList(7);
		
		System.out.println(pets.get(1));
		List<Integer> pety = new ArrayList<Integer>(pets.size());
		for(int i=0; i<pets.size(); i++){
			pety.add(pets.indexOf(pets.get(i)));
		}
		
		System.out.println("1: " + pety);	//nie wiem, czy mam todalej ci¹gn¹æ...
		Integer h = pety.size();
		//Hamster h = new Hamster();
		pety.add(h); // Automatically resizes
		System.out.println("2: " + pety);
		System.out.println("3: " + pety.contains(h));
		pety.remove(h); // Remove by object
		Integer p = pety.get(2);
		//Pet p = pets.get(2);
		System.out.println("4: " + p + " " + pety.indexOf(p));
		Integer cymric = 2;
		//Pet cymric = new Cymric();
		System.out.println("5: " + pety.indexOf(cymric));
		System.out.println("6: " + pety.remove(cymric));
		// Must be the exact object:
		System.out.println("7: " + pety.remove(p));
		System.out.println("8: " + pety);
		pety.add(3, 4); // Insert at an index
		System.out.println("9: " + pety);
		List<Integer> sub = pety.subList(1, 4);
		//List<Pet> sub = pets.subList(1, 4);
		System.out.println("subList: " + sub);
		System.out.println("10: " + pety.containsAll(sub));
		Collections.sort(sub); // In-place sort
		System.out.println("sorted subList: " + sub);
		// Order is not important in containsAll():
		System.out.println("11: " + pety.containsAll(sub));
		Collections.shuffle(sub, rand); // Mix it up
		System.out.println("shuffled subList: " + sub);
		System.out.println("12: " + pety.containsAll(sub));
		List<Integer> copy = new ArrayList<Integer>(pety);
		//List<Pet> copy = new ArrayList<Pet>(pets);
		sub = Arrays.asList(pety.get(1), pety.get(4));
		System.out.println("sub: " + sub);
		copy.retainAll(sub);
		System.out.println("13: " + copy);
		copy = new ArrayList<Integer>(pety); // Get a fresh copy
		copy.remove(2); // Remove by index
		System.out.println("14: " + copy);
		copy.removeAll(sub); // Only removes exact objects
		System.out.println("15: " + copy);
		copy.set(1, 4); // Replace an element			nie chce mi siê ju¿ tego dalej ogarniaæ. pogubi³em siê, a chyba nie warto
		System.out.println("16: " + copy);
		copy.addAll(2, sub); // Insert a list in the middle
		System.out.println("17: " + copy);
		System.out.println("18: " + pets.isEmpty());
		pets.clear(); // Remove all elements
		System.out.println("19: " + pets);
		System.out.println("20: " + pets.isEmpty());
		pets.addAll(Pets.arrayList(4));
		System.out.println("21: " + pets);
		Object[] o = pets.toArray();
		System.out.println("22: " + o[3]);
		Pet[] pa = pets.toArray(new Pet[0]);
		System.out.println("23: " + pa[3].id());
	}
}