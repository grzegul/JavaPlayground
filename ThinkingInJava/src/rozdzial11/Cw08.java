package rozdzial11;

import java.util.*;

class Gerbil8{
	private int gerbilNumber;
	public Gerbil8(int gerbilNumber){
		this.gerbilNumber = gerbilNumber;
	}
	int hop(){
		System.out.println("podskakuje");
		return gerbilNumber+1;
	}
}

public class Cw08 {
	
	public static void main (String[] args){
		ArrayList<Gerbil8> gerbils = new ArrayList<Gerbil8>();
		for (int i=0; i<5; i++){
			gerbils.add(new Gerbil8(i));
		}
		Iterator<Gerbil8> it = gerbils.iterator();
		while(it.hasNext()){
			Gerbil8 g = it.next();
			System.out.println(g.hop());
		}
		
		
	}
}
/*
podskakuje
1
podskakuje
2
podskakuje
3
podskakuje
4
podskakuje
5*/
