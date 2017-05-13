package rozdzial11;
import java.util.*;
import net.mindview.util.*;

public class Cw16 {
	
	public static void main (String[] args){
		Set<String> samogloski = new HashSet<String>();
		Collections.addAll(samogloski, "a e i o u y A E I O U Y".split(" "));
		
		List<String> words = new LinkedList<String>(new TextFile("UniqueWords.java", "\\W+"));
		//System.out.println(words);
		
		ListIterator<String> lt = words.listIterator();
		int sum = 0;
		while(lt.hasNext()){
			String[] slowo = words.get(lt.nextIndex()).split("");
			int count = 0;
			for(int i=0; i<slowo.length; i++){
				if (samogloski.contains(slowo[i])){
					count++;
				}
			}
			System.out.println(words.get(lt.nextIndex()) + ": " + count);
			sum += count;
			lt.next();
		}
		System.out.println("Suma samoglosek: " + sum);
	}
}
