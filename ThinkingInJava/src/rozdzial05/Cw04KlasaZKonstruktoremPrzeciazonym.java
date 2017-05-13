package rozdzial05;

class Klasa2{
	Klasa2(){						//Konstruktor!!!!!!!!!!!!
		System.out.println("Komunikat");
	}
	Klasa2(String a){
		System.out.println(a);	
	}
}

public class Cw04KlasaZKonstruktoremPrzeciazonym {
	public static void main(String[]args){
		new Klasa2();
		new Klasa2("przekazywanie");
	}
}
