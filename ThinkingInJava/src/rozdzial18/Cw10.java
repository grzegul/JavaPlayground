package rozdzial18;

import java.io.*;
import java.util.*;
public class Cw10 {
	// Throw exceptions to console:
	public static List<String> read(String[] seek) throws IOException {
		// Reading input by lines:
		BufferedReader in = new BufferedReader(new FileReader(seek[0]));
		String s;
		LinkedList<String> lista = new LinkedList<String>();
		while((s = in.readLine())!= null){
			for(int j=1; j<seek.length; j++){
				if(s.contains(seek[j])){
					lista.addFirst(s + "\n");
				}
			}
		}
		in.close();
		return lista;
	}
	public static void main(String...args) throws IOException {
		System.out.print(read(args));
	}
}