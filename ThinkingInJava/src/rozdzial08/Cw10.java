package rozdzial08;

class Butelka{
	void pojemnosc(){
		System.out.println("Nieznana");
	}
	void wielkosc(){
		pojemnosc();
	}
}

class Szklana extends Butelka{
	void wielkosc(){
		System.out.println("Zielona");
	}
}

public class Cw10 {

	public static void main(String[] args) {
		Butelka b = new Szklana();
		b.pojemnosc();
		b.wielkosc();
		
		Butelka c = new Butelka();
		c.pojemnosc();
		c.wielkosc();
		
		Szklana d = new Szklana();
		d.pojemnosc();
		d.wielkosc();
	}

}
