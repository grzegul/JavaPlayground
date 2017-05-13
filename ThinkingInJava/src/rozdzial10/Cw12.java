package rozdzial10;

interface Zmiana{
	String zmiana(String s);
}

public class Cw12 {
	private String s = "wiosna";
	private String change(String s){
		return s + " idzie";
	}
	public Zmiana zmiana(){
		return new Zmiana(){
			public String zmiana(String s){
				s = "zima";
				s = change(s);
				return s;
			}
		};
	}
	
	public static void main(String[] args) {
		Cw12 c = new Cw12();
		System.out.println(c.change(c.s));
		
		Zmiana z = c.zmiana();
		
		System.out.println(z.zmiana(c.s));
		System.out.println(c.change(c.s));
	}

}
