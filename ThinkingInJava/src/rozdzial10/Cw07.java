package rozdzial10;

public class Cw07 {
	private String s = "wiosna";
	private String change(String s){
		return s + " idzie";
	}
	class We{
		
		public String zmiana(String s){
			s = "zima";
			s = change(s);
			return s;
		}
		
	}
	
	public static void main(String[] args) {
		Cw07 c = new Cw07();
		System.out.println(c.change(c.s));
		
		Cw07.We cw = c.new We();
		
		System.out.println(cw.zmiana(c.s));
		System.out.println(c.change(c.s));
	}

}
