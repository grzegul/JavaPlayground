package rozdzial18;

import static uzytki.BinaryFile.*;
import uzytki.*;
import java.util.*;
import java.io.*;

public class Cw20 {
	public static void main(String[] args) {

		byte[] tab = {(byte)0xCA, (byte)0xFE, (byte)0xBA, (byte)0xBE};
//		System.out.println(Arrays.toString(tab));
		
		byte[] tab2;
		for(File file : Directory.walk(".", ".*\\.class")){
			try{
				tab2 = Arrays.copyOfRange(read(file), 0,4);
			}catch(IOException e){
				throw new RuntimeException(e);
			}
			if(Arrays.equals(tab, tab2)){
				System.out.println(file + " OK");
			}else{
				System.out.println(Arrays.toString(tab2));
			}
			
		}
		
	}

}
