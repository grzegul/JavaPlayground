package rozdzial11;

import java.util.*;
public class Cw18 {

	public static void main(String[] args) {
		Map<String, String> prime = new HashMap<String, String>();
		prime.put("pierwszy", "gosc");
		prime.put("drugi", "przyjaciel");
		prime.put("trzeci", "dekadent");
		System.out.println(prime.keySet());
		System.out.println(prime.values());
		
		Set<String> sec = new TreeSet<String>();
		for(String s : prime.keySet()){
			sec.add(s);
		}
		System.out.println(sec);
		
		Map<String, String> tert = new LinkedHashMap<String, String>();
		for(String s : sec){
			tert.put(s, prime.get(s));
		}
		System.out.println(tert);
	}

}
