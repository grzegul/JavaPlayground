package rozdzial10;

public class Cw08 {
	class Inner{
		private String s = "prywatny";
	}
	public static void main(String[] args) {
		Cw08 c = new Cw08();
		Cw08.Inner ci = c.new Inner();
		System.out.println(ci.s.toString());
	}

}
