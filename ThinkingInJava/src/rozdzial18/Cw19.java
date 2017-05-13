package rozdzial18;

import static uzytki.BinaryFile.*;
import java.util.*;
import java.io.*;

public class Cw19 {
	public static void main(String[] args) {
		HashMap<Byte,Integer> mapa = new HashMap<Byte,Integer>();
		File bFile = new File("compcontents.bin");
		byte[] tab;
		try{
			tab = read(bFile);
//			System.out.println(tab[152]);
		}catch(IOException e){
			throw new RuntimeException(e);
		}
		for(byte by: tab){
			int il = 1;
			if (!mapa.containsKey(by)){
				mapa.put(by, il);
			}else {
				il = mapa.get(by)+1;
				mapa.replace(by, il);
			}			

		}

		System.out.println(mapa);	
		
	}

}
