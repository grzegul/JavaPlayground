package rozdzial18;

import java.io.*;
import java.util.*;
public class Cw12 {
	static String file = "Cw12.out";
	public static List<String> read(String filename) throws IOException {
		// Reading input by lines:
		BufferedReader in = new BufferedReader(new FileReader(filename));
		PrintWriter out = new PrintWriter(file);
		int lineCount = 1;
		String s;
		LinkedList<String> lista = new LinkedList<String>();
		while((s = in.readLine())!= null){
			lista.addFirst(s + "\n");
			out.println(lineCount++ + ": " + lista.element());
		}
			
		in.close();
		out.close();
		return lista;
	}
	public static void main(String[] args) throws IOException {
		System.out.print(read(args[0]));
	}
}