package rozdzial13;

import java.util.regex.*;
import java.util.*;

public class Cw14 {
	public static void main(String[] args) {
		String input = "This!!unusual use!!of exclamation!!points";
		System.out.println(Arrays.toString((input.split("!!"))));
		// Only do the first three:
		int a = 0;
		while(a<2){
			input.replaceFirst("!!", " ");
			a++;
		}
		System.out.println(Arrays.toString(Pattern.compile("!!").split(input, 3)));
	}
}
