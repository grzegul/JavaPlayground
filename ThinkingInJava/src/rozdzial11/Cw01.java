package rozdzial11;

import java.util.ArrayList;

class Gerbil{
	private int gerbilNumber;
	public Gerbil(int gerbilNumber){
		this.gerbilNumber = gerbilNumber;
	}
	int hop(){
		System.out.println("podskakuje");
		return gerbilNumber+1;
	}
	
}

public class Cw01 {
	
	public static void main (String[] args){
		ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
		for (int i=0; i<5; i++){
			gerbils.add(new Gerbil(i));
		}
		for (int i=0; i<gerbils.size(); i++){
			System.out.println(gerbils.get(i).hop());
		}
	}
}
