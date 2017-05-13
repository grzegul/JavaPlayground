package rozdzial11;
import java.util.*;
import net.mindview.util.*;

public class Cw20IloscSamoglosek {
	
	public static void main (String[] args){
		List<String> samogloski = new LinkedList<String>();
		Collections.addAll(samogloski, "a e i o u y A E I O U Y".split(" "));
		
		List<String> words = new LinkedList<String>(new TextFile("UniqueWords.java", "\\W+"));	
		Map<String, Integer> zestaw = new LinkedHashMap<String, Integer>();
		
		ListIterator<String> lt = words.listIterator();
		while(lt.hasNext()){
			String[] slowo = words.get(lt.nextIndex()).split("");
			for(int i=0; i<slowo.length; i++){
				if (samogloski.contains(slowo[i])){
					String r = slowo[i];
					Integer freq = zestaw.get(r);
					zestaw.put(r, freq==null ? 1 : freq + 1);
				}
			}
			lt.next();
		}
		System.out.println(zestaw);
	}
}
