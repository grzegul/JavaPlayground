package rozdzial18;

//{Args: "T.*\.*"}

import uzytki.*;
import java.util.regex.*;
import java.io.*;
import java.util.*;
public class Cw02 {
	public static void main(String[] args) {

		File path = new File(".");
		SortedDirList sdl = new SortedDirList(path);

		if(args.length == 0){
			sdl.list();
		}
			
		else{
			sdl.list(path, args[0]);
			
		}
			

	}
}
class SortedDirList {
	String[] list;

	public SortedDirList (File file){
		list = file.list();
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);

	}
	public void list(){
		for(String dirItem : list){
			System.out.println(dirItem);	
		}
	}
	public void list(File path, String s){
		list = path.list(new DirFilter(s));
		for(String dirItem : list){
			System.out.println(dirItem);	
		}
	}
}