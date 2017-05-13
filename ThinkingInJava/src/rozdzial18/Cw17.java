package rozdzial18;

import uzytki.*;
import java.util.*;

public class Cw17 {

	public static void main(String[] args) {
		HashMap<Character,Integer> mapa = new HashMap<Character,Integer>();
		
		TextFile tf = new TextFile("FileOutputShortcut.java", "\\W+");
		String calosc = "";
		for(String s: tf){
			calosc = calosc.concat(s);
		}
		for(int j=0;j<calosc.length();j++){
			char c = calosc.charAt(j);
			int il = 1;
			if (!mapa.containsKey(c)){
				mapa.put(c, il);
			}else {
				il = mapa.get(c)+1;
				mapa.replace(c, il);
			}
		}
		System.out.println(mapa);	
		
	}

}
