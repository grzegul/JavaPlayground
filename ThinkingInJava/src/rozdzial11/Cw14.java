package rozdzial11;
import java.util.*;

public class Cw14 {
	public int dodaj(int i){
		return i;
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> lista = new LinkedList<Integer>();
		int a = 10;
		for(int i=0; i<a; i=i+2){
			lista.addFirst(i);
			lista.add(i+1);
		}
		System.out.println(lista);
		
		
		LinkedList<Integer> lista2 = new LinkedList<Integer>();
		int x = 0;
		ListIterator<Integer> lt = lista2.listIterator(x);
		int b = 10;
		for(int j=0; j<b; j++){
			x = lista2.size()+j;
			lt.add(x+j);
		}
		/*while(lt.nextIndex()<b){
			
			lt.add(lt.nextIndex());
			//lt.set(lt.previous());
			//lt.add(lt.previousIndex());
			
		}*/
		System.out.println(lista2);
	}

}
