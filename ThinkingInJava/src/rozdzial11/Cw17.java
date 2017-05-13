package rozdzial11;

import java.util.*;

class Gerbil2{
	private int gerbilNumber;
	public Gerbil2(int gerbilNumber){
		this.gerbilNumber = gerbilNumber;
	}
	int hop(){
		System.out.println("podskakuje");
		return gerbilNumber+1;
	}
	
}

public class Cw17 {
	
	public static void main (String[] args){
		Map<String,Gerbil2> gerbils2 = new LinkedHashMap<String, Gerbil2>();
		for (int i=0; i<5; i++){
			gerbils2.put("Gonek"+i, new Gerbil2(i));
		}
		System.out.println("Nazwa: " + gerbils2.keySet());
		for(String s : gerbils2.keySet()){
			System.out.println("Nazwa: " + s + ", " + gerbils2.get(s));
			gerbils2.get(s).hop();
		}
	}
}
