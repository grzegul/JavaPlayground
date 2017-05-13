package rozdzial09;

interface Handlowy{
	String sprzedaz();
	String zakupy();
}
interface Techniczny{
	String dokumentacje();
	String projektowanie();
}
interface Ksiegowosc{
	String fakturowanie();
	String marudzenie();
}
interface Biura extends Handlowy, Techniczny, Ksiegowosc{
	String kserowanie();
}
class Produkcja{
	String prototyp(){
		return "Gotowy!!";
	}
}

public class Cw14 extends Produkcja implements Biura {
	public String sprzedaz(){
		return "Sprzedawaj!!";
	}
	public String zakupy(){
		return "Kupuj!!";
	}
	public String dokumentacje(){
		return "Wiêcej informacji!!";
	}
	public String projektowanie(){
		return "Jakie ripple?";
	}
	public String fakturowanie(){
		return "Co my tu robimy??";
	}
	public String marudzenie(){
		return "Zimno, ciep³o...";
	}
	public String kserowanie(){
		return "Wszyscy to robi¹!";
	}
		
	public static void main(String[] args) {
		Produkcja p = new Cw14();
		Handlowy h = new Cw14();
		Biura b = new Cw14();
		System.out.println(p.prototyp());
		System.out.println(h.sprzedaz());
		System.out.println(b.kserowanie());
		System.out.println(b.zakupy());
		System.out.println(b.projektowanie());
		
		Cw14 c = new Cw14();
		System.out.println(c.prototyp());
		System.out.println(c.sprzedaz());
		System.out.println(c.dokumentacje());
		System.out.println(c.fakturowanie());
		System.out.println(c.kserowanie());
	}

}
