package rozdzial11;
import java.util.*;

public class Cw11Kontener {
	public void czytaj(Collection<Object> co){
		Iterator<Object> it = co.iterator();
		while(it.hasNext()){
			Object o = it.next();
			System.out.print(o.toString() + " ");
		}
	}
	
	public static void main(String[] args){
		Collection<Object> co = new HashSet<Object>();
		for (String a : "Moj pies ma pchly".split(" ")){
			co.add(a);
		}
		Cw11Kontener c = new Cw11Kontener();
		c.czytaj(co);
	}
}
