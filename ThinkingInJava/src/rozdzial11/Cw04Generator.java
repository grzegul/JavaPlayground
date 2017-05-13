package rozdzial11;
import java.util.*;

public class Cw04Generator {
	private static Collection create(Collection<String> c){
		c.add("Alfa");
		c.add("Beta");
		c.add("Kung");
		c.add("Fury");
		return c;
	}
	
	int i = 0;
	String name = "";
	public String next(Collection<String> c){
		Object[]cc = new String[c.size()];
		cc = c.toArray();
		name = (String)cc[i];
		i++;
		if (i==cc.length){
			i=0;
		}
		return name;
	}
	public void druk(int ilosc, Cw04Generator w,Collection<String> c){
		for (int y=0; y<ilosc; y++){
			System.out.println(w.next(c));
		}
	}
	
	public static void main(String[]args){
		Cw04Generator w = new Cw04Generator();
		Collection<String> c1 = w.create(new ArrayList<String>());
		Collection<String> c2 = w.create(new LinkedList<String>());
		Collection<String> c3 = w.create(new HashSet<String>());
		Collection<String> c4 = w.create(new LinkedHashSet<String>());
		Collection<String> c5 = w.create(new TreeSet<String>());
		
		int ilosc = 4;
		w.druk(ilosc,w,c1);
		w.druk(ilosc,w,c2);
		w.druk(ilosc,w,c3);
		w.druk(ilosc,w,c4);
		w.druk(ilosc,w,c5);
	}	// przyda³oby siê jeszcze zerowanie "next()" przy zmianie rodzaju kolekcji. A mo¿e to tylko ich w³aœciwoœci
}
