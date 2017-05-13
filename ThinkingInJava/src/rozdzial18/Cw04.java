package rozdzial18;

import java.io.*;
import uzytki.*;
public class Cw04 {
	public static void main(String[] args) {
		int sum = 0;
		for(File file : Directory.walk(".", "T.*\\.java")){
			System.out.println(file + " " + file.length() + " " + new MsToDate().MTS(file.lastModified()));
			sum += file.length();
		}
		System.out.println("suma: " + sum);	
		
	}
}