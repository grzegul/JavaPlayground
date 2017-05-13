package rozdzial18;

import java.io.*;
public class Cw14 {
	static String file = "BasicFileOutput.out";
	public static void main(String[] args) throws IOException {
		long start=System.currentTimeMillis();
		BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("BasicFileOutput.java")));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		int lineCount = 1;
		String s;
		while((s = in.readLine()) != null )
			out.println(lineCount++ + ": " + s);
		out.close();
		// Show the stored file:
		System.out.println(BufferedInputFile.read(file));
		long stop=System.currentTimeMillis();
		System.out.println("Czas wykonania:"+(stop-start));
		
	}
}