package rozdzial11;
import java.util.*;

public class Cw10 {
	public static void generuj(Gryzonie g){
		System.out.println(g);
		System.out.println(g.lifeExpect());
		
	}
	public static void pokazZachow(ArrayList<Gryzonie> g){
		Iterator<Gryzonie> it = g.iterator();
		while(it.hasNext()){
			generuj(it.next());	
		}
	}
	
	public static void main (String[] args){
		ArrayList<Gryzonie> gg = new ArrayList<Gryzonie>(2);
		gg.add(new Mysz());
		gg.add(new Chomik());
		pokazZachow(gg);
		System.out.println(((Mysz)gg.get(0)).zachowanie("jhh"));
		((Chomik)gg.get(1)).zabawa();
	}
}
