package rozdzial18;

//{Args: "T.*\.*"}

import uzytki.*;
import java.util.regex.*;
import java.io.*;
import java.util.*;
public class Cw01 {
	public static void main(String[] args) {
		File path = new File(".");
		String[] list;
		list = path.list(new DirFilter(".*\\.java"));
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		
		for(String dirItem : list){
//			System.out.println(dirItem);
			String tf = TextFile.read(dirItem);
//			System.out.println(tf);
			if (tf.contains(args[0])){
				System.out.println(dirItem);
			}
		}
	}
}
class DirFilter implements FilenameFilter {
	private Pattern pattern;
	public DirFilter(String regex) {
		pattern = Pattern.compile(regex);
	}
	public boolean accept(File dir, String name) {
		return pattern.matcher(name).matches();
	}
}