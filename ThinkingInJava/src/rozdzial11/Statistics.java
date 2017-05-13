package rozdzial11;

import java.util.*;
public class Statistics {
	public static Map<Integer, Integer> generuj(Random rand){	
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		for(int i = 0; i < 10000; i++) {
			// Produce a number between 0 and 20:
			int r = rand.nextInt(20);
			Integer freq = m.get(r);
			m.put(r, freq == null ? 1 : freq + 1);
		}
		return m;
	}
	public static void main(String[] args) {
		List<Map<Integer,Integer>> lista = new LinkedList<Map<Integer,Integer>>();
		Map<Integer, Integer> podsumowanie = new HashMap<Integer, Integer>();
		Random rand = new Random(47);
		Collection<Integer> keys = new LinkedList<Integer>();
		keys = generuj(rand).keySet();
		int ilIter = 3;
		for(Integer o : keys){
			podsumowanie.put(o, 0);
		}
		for (int i=0; i<ilIter; i++){
			Map<Integer,Integer> mapa = generuj(rand);
			System.out.println(mapa);
			lista.add(mapa);
			for(Integer o : keys){
				Integer a = podsumowanie.get(o) + mapa.get(o);
				podsumowanie.put(o, a);
			}
		}
		for(Integer o : keys){
			Integer b = podsumowanie.get(o)/ilIter;
			podsumowanie.put(o, b);
		}
		//System.out.println("lista" + lista);
		System.out.println("podsumowanie" + podsumowanie);
	}
}