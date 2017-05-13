package rozdzial18;

//{Args: "t.*\.java"}
import java.util.regex.*;
import java.io.*;
import java.util.*;
public class Cw03 {
	public static void main(final String[] args) {
		File path = new File(".");
		File[] list;
		if(args.length == 0){
			list = path.listFiles();
		}
		else
			list = path.listFiles(new FilenameFilter() {
				private Pattern pattern = Pattern.compile(args[0]);
				public boolean accept(File dir, String name) {
					return pattern.matcher(name).matches();
				}
			});			
		Arrays.sort(list);
		for(File dirItem : list)
			System.out.println(dirItem.getName() + " " + dirItem.length());

	}
}