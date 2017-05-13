package rozdzial11;
import java.util.*;
import net.mindview.util.*;

public class Cw21IloscSlowWPliku {
	
	public static void main (String[] args){
		Collection<String> words = new LinkedList<String>(new TextFile("UniqueWords.java", "\\W+"));
		Map<String, Integer> zestaw = new LinkedHashMap<String, Integer>();

		Iterator<String> lt = words.iterator();
		while(lt.hasNext()){
			String r = lt.next();
			Integer freq = zestaw.get(r);
			zestaw.put(r, freq==null ? 1 : freq + 1);
		}
		Map<String, Integer> sorted = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);
		sorted.putAll(zestaw);
		System.out.println(sorted);
	}
}
