package rozdzial18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import uzytki.TextFile;

public class Cw21 {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String s = "";

		while((s = stdin.readLine()) != null && s.length()!= 0){
			s = s.toUpperCase();
			System.out.println(s);
		}
			
		// An empty line or Ctrl-Z terminates the program
	}

}
