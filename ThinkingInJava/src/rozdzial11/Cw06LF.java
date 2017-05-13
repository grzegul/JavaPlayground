package rozdzial11;

import typeinfo.pets.*;

import java.util.*;

public class Cw06LF {
	public static void main(String[] args) {
		Random rand = new Random(47);
		List<Pet> pets = Pets.arrayList(7);;
		//-------------------------------------------------------------
		List<String> pecik = new ArrayList<String>(pets.size());
		for (int i=0; i<pets.size(); i++){
			pecik.add(String.valueOf(pets.get(i)));
			
		}
		//-------------------------------------------------------------
		System.out.println("1: " + pecik);
		String h = new String("Hamster");
		pecik.add(h); // Automatically resizes
		System.out.println("2: " + pecik);
		System.out.println("3: " + pecik.contains(h));
		pecik.remove(h); // Remove by object
		String p = pecik.get(2);
		System.out.println("4: " + p + " " + pecik.indexOf(p));
		String cymric = new String("Cymric");
		System.out.println("5: " + pecik.indexOf(cymric));
		System.out.println("6: " + pecik.remove(cymric));
		// Must be the exact object:
		System.out.println("7: " + pecik.remove(p));
		System.out.println("8: " + pecik);
		pecik.add(3, new String("Mouse")); // Insert at an index
		System.out.println("9: " + pecik);
		List<String> sub = pecik.subList(1, 4);
		System.out.println("subList: " + sub);
		System.out.println("10: " + pecik.containsAll(sub));
		Collections.sort(sub); // In-place sort
		System.out.println("sorted subList: " + sub);
		// Order is not important in containsAll():
		System.out.println("11: " + pecik.containsAll(sub));
		Collections.shuffle(sub, rand); // Mix it up
		System.out.println("shuffled subList: " + sub);
		System.out.println("12: " + pecik.containsAll(sub));
		List<String> copy = new ArrayList<String>(pecik);
		sub = Arrays.asList(pecik.get(1), pecik.get(4));
		System.out.println("sub: " + sub);
		copy.retainAll(sub);
		System.out.println("13: " + copy);
		copy = new ArrayList<String>(pecik); // Get a fresh copy
		copy.remove(2); // Remove by index
		System.out.println("14: " + copy);
		copy.removeAll(sub); // Only removes exact objects
		System.out.println("15: " + copy);
		copy.set(1, new String("Mouse")); // Replace an element
		System.out.println("16: " + copy);
		copy.addAll(2, sub); // Insert a list in the middle
		System.out.println("17: " + copy);
		System.out.println("18: " + pecik.isEmpty());
		pecik.clear(); // Remove all elements
		System.out.println("19: " + pecik);
		System.out.println("20: " + pecik.isEmpty());
		
		pets.clear();
		pets.addAll(Pets.arrayList(4));
		for (int i=0; i<pets.size(); i++){
			pecik.add(String.valueOf(pets.get(i)));
		}

		System.out.println("21: " + pecik);
		Object[] o = pecik.toArray();
		System.out.println("22: " + o[3]);
		Pet[] pa = pets.toArray(new Pet[0]);
		System.out.println("23: " + pa[3].id());
	}
}