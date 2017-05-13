package rozdzial13;

import java.util.Arrays;

public class Cw08 {
	
	public static void main(String[] args) {
		String s = Splitting.knights;
		System.out.println(s);
		System.out.println(Arrays.toString(s.split("o|ee\\W+")));
	}

}
