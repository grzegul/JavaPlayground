package rozdzial13;

public class Cw07 {
	
	public static void main(String[] args) {
		String s = Splitting.knights;
		System.out.println(s);
		System.out.println(s.matches("[A-Z].*"));
		System.out.println(s.matches(".*\\."));
	}

}
