package rozdzial13;
import java.util.regex.*;

public class Cw10 {
	static public final String s = "Java now has regular expressions";
	public static void main (String[] args){
		String[] exp = {"^Java", "\\Breg.*",  "n.w\\s+h(a|i)s", "s?", "s*", "s+", "s{4}", "s{1,}", "s{1,3}"};

		for(String e : exp){
			Pattern p = Pattern.compile(e);
			Matcher m = p.matcher(s);
			
			System.out.println(e + ": " + m.find());
		}
	}
}
