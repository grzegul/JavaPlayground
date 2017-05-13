package rozdzial11;
import java.util.*;
import net.mindview.util.*;

public class Cw25i26 {

	public static void main(String[] args) {
		List<String> words = new ArrayList<String>(new TextFile("SetOperations.java", "\\W+"));
		Map<String, ArrayList<Integer>> mapa = new TreeMap<String, ArrayList<Integer>>();
		for(int i=0; i<words.size(); i++){
			ArrayList<Integer> wyst = new ArrayList<Integer>();
			String w = words.get(i);
			for(int j=0; j<words.size(); j++){
				if (words.get(j).equals(w)){
					wyst.add(j);
				}
			}
			mapa.put(w,wyst);
		}
		System.out.println(mapa);
		
		List<String> powrot = new ArrayList<String>(words.size());
		for (int k=0; k<words.size(); k++){
			powrot.add("");
		}
		for(String s : mapa.keySet()){
			for (Integer i : mapa.get(s)){
				powrot.set(i, s);
			}
		}
		System.out.println(powrot);
	}

}
