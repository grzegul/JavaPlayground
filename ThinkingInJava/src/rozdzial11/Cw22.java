package rozdzial11;
import java.util.*;
import net.mindview.util.*;

class Slowo implements Comparable<Slowo>{
	private String tresc;
	private int counter;
	public Slowo (String tresc){
		this.tresc = tresc;
		counter = 1;
	}
	public void increment(){
		counter++;
	}
	
	public int compareTo(Slowo slowo){
		return tresc.compareTo(slowo.tresc);
	}
	public String toString(){
		return tresc + "(" + counter + ")";
	}
}

public class Cw22 {
	public static void main (String[] args){
		List<String> words = new LinkedList<String>(new TextFile("UniqueWords.java", "\\W+"));
		TreeSet<Slowo> zestaw = new TreeSet<Slowo>();
		
		Slowo r = new Slowo("dgg");
		r.increment();
		r.increment();
		System.out.println(r);
		zestaw.add(r);
		System.out.println(zestaw.contains(r));
		
		Iterator<String> lt = words.iterator();
		while(lt.hasNext()){
			Slowo s = new Slowo(lt.next());
			zestaw.add(s);
			Iterator<Slowo> lt2 = zestaw.iterator();
			while(lt2.hasNext()){
				if(lt2.next().equals(s)){
					lt2.next().increment();
				}
			}
			
		}
		
		/*Iterator<String> lt = words.iterator();
		while(lt.hasNext()){
			Slowo s = new Slowo(lt.next());
			if (zestaw.contains(s)){
				Iterator<Slowo> lt2 = zestaw.iterator();
				while(lt2.hasNext()){
					Slowo x = lt2.next();
					System.out.println(x==s);
					if (x==s){
						x.increment();
					}
				}
			}else{
				zestaw.add(s);
			}
		}	*/
		System.out.println(zestaw);
	}
}
