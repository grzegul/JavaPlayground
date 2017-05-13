package rozdzial11;
import java.util.*;

public class Cw12 {
	public static void main(String[] args){
		List<Integer> lista = new ArrayList<Integer>();
		for(int i=0; i<10; i++){
			lista.add(i);
		}
		System.out.println(lista);
		
		List<Integer> odwr = new ArrayList<Integer>(lista.size());
		ListIterator<Integer> it = lista.listIterator(lista.size());
		while(it.hasPrevious()){	
			odwr.add(it.previous());
		}
		System.out.println(odwr);
		
		LinkedList<Integer> odwr2 = new LinkedList<Integer>();
		while(it.hasNext()){	
			odwr2.addFirst(it.next());
		}
		System.out.println(odwr2);
	}
}
