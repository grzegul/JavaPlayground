package rozdzial13;

import java.util.regex.*;
import java.util.*;

public class Cw12 {
	static public final String POEM =
			"Twas brillig, and the slithy toves\n" +
			"Did gyre and gimble in the wabe.\n" +
			"All mimsy were the borogoves,\n" +
			"And the mome raths outgrabe.\n\n" +
			"Beware the Jabberwock, my son,\n" +
			"The jaws that bite, the claws that catch.\n" +
			"Beware the Jubjub bird, and shun\n" +
			"The frumious Bandersnatch.";
	public static void main(String[] args) {
		Matcher m = Pattern.compile("\\b[a-z]\\w+").matcher(POEM);
		Set<String> ts = new TreeSet<String>();
		
		while(m.find()) {
			ts.add(m.group());
			System.out.print(m.group() + ", ");	
		}
		System.out.println("\n\nIlosc slow zaczynajacych sie mala litera: " + ts.size());
		System.out.println(ts);
	}
}