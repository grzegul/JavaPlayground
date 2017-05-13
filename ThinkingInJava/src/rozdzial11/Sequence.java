package rozdzial11;
import java.util.*;

public class Sequence {
	private static List<Object> items;
	public Sequence(int size){
		items = new ArrayList<Object>(size);
	}
	public void add(Object x){
		items.add(x);
	}
	
	public static void main(String[] args) {
		int aa = 10;
		Sequence sequence = new Sequence(aa);
		for(int i=0; i<aa; i++){
			sequence.add(Integer.toString(i));
		}
		Iterator<Object> it = items.iterator();

		while(it.hasNext()){
			Object o = it.next();
			System.out.print(o + " ");

		}
	}
}