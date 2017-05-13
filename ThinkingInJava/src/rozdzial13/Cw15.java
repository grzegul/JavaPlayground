package rozdzial13;

//: strings/JGrep.java
// A very simple version of the "grep" program.
// {Args: JGrep.java "\b[Ssct]\w+" Pattern.CASE_SENSITIVE}
import java.util.regex.*;
import static java.lang.System.out;
import java.lang.reflect.*;	
import net.mindview.util.*;
public class Cw15 {
	public static void main(String[] args) throws Exception {
		int flag = 0;
		if(args.length < 2) {
			System.out.println("Usage: java JGrep file regex");
			System.exit(0);
		}
		
		Class cl = Class.forName("java.util.regex.Pattern");
		Field[] ff = cl.getFields();
		String input = args[2].split("\\.")[1];
		for (int i=0;i<ff.length;++i) {
			//System.out.println(ff[i].getName().toString());
		    if((ff[i].getName()).equals(input)){
		    	flag = ff[i].getInt(cl);
		    }
	    }

		Pattern p = Pattern.compile(args[1], flag);
		// Iterate through the lines of the input file:
		int index = 0;
		Matcher m = p.matcher("");
		for(String line : new TextFile(args[0])) {
			m.reset(line);
			while(m.find()){
				System.out.println(index++ + ": " +	m.group() + ": " + m.start());
			}
		}
	}
}