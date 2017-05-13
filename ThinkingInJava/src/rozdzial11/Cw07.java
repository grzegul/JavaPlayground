package rozdzial11;
import java.util.*;

public class Cw07 {
	private int number;
	public Cw07(int number) {
		this.number = number;
		}  
	public String toString() {
		return "Cw07: " + number;
	}		
	public static void main(String[] args) {
		Cw07[] c = new Cw07[5];
		for(int i=0; i<c.length; i++){
			c[i] = new Cw07(i);
		}
		List<Cw07> lc = new ArrayList<Cw07>(c.length);
		for(int i=0; i<c.length; i++){
			lc.add(c[i]);
		}
		System.out.println(lc);
		List<Cw07> sub = lc.subList(1,3);
		System.out.println(sub);
		lc.removeAll(sub);
		System.out.println(lc);
	}
}
