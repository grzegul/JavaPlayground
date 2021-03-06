package rozdzial18;

import java.io.*;
import java.util.*;
public class Cw07 {
	// Throw exceptions to console:
	public static List<String> read(String filename) throws IOException {
		// Reading input by lines:
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String s;
		LinkedList<String> lista = new LinkedList<String>();
		while((s = in.readLine())!= null)
			lista.addFirst(s + "\n");
		in.close();
		return lista;
	}
	public static void main(String[] args) throws IOException {
		System.out.print(read("BufferedInputFile.java"));
	}
}