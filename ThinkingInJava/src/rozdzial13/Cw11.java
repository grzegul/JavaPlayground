package rozdzial13;
import java.util.regex.*;

public class Cw11 {
	static public final String s = "Arline ate eight apples and one orange while Anita hadn’t any";
	public static void main (String[] args){
		
		Pattern p = Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
		Matcher m = p.matcher(s);
			
		System.out.println(p + ": " + m.find());
		
	}
}
